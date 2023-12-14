package capa.persistencia;

import capa.dominio.HorarioPsicologo;
import capa.dominio.Psicologo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TECNOPATA
 */
public class HorarioPsicologoDAO {

    private AccesoDatosJDBC gestorJDBC;     
    private int totalRegistros;
    
    
    public HorarioPsicologoDAO() {                  
    }
    
    public HorarioPsicologoDAO(AccesoDatosJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;           
    }         
    
    //METODO PARA BUSCAR EL HORARIO DE ATENCION
    public HorarioPsicologo buscarHorario(String codigoHorario) {
        
        String consulta = "select idhorariopsicologo,fecha,horaentrada,horasalida from horariopsicologo where rtrim(codigo)=?";
        PreparedStatement sentencia;

        try {
            sentencia = gestorJDBC.prepararSentencia(consulta);
            sentencia.setString(1, codigoHorario);
            ResultSet resultadoHorario = sentencia.executeQuery();
            if (resultadoHorario.next()) {
                HorarioPsicologo horarioPsicologo = new HorarioPsicologo();  //probar                   
                horarioPsicologo.setCodigoHorario(codigoHorario);
                horarioPsicologo.setIdhorariopsicologo(resultadoHorario.getInt("idhorariopsicologo"));
                horarioPsicologo.setFechaAtencion(resultadoHorario.getString("fecha"));
                horarioPsicologo.setHoraEntrada(resultadoHorario.getString("horaentrada"));
                horarioPsicologo.setHoraSalida(resultadoHorario.getString("horasalida"));
                return horarioPsicologo;
            } else {
                throw new IllegalArgumentException("EL HORARIO QUE INTENTA BUSCAR NO SE ENCUENTRA REGISTRADO.");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("ERROR AL INTENTAR BUSCAR EL HORARIO DEL PSICOLOGO", e);
        }
    }     

    // METODO PARA REGISTRAR EL HORARIO DEL PSICOLOGO
    public int ingresarHorarioPsicologo(HorarioPsicologo horarioPsicologo) throws SQLException {
        String sentenciaSQL = "insert into horariopsicologo(fecha,horaentrada,horasalida,idpsicologo, codigo, estado) values(?,?,?,?,?,'Disponible')";        
        PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
        sentencia.setString(1, horarioPsicologo.getFechaAtencion());
        sentencia.setString(2, horarioPsicologo.getHoraEntrada());
        sentencia.setString(3, horarioPsicologo.getHoraSalida());
        sentencia.setInt(4, horarioPsicologo.getPsicologo().getIdPsicologo()); 
        sentencia.setString(5, horarioPsicologo.getCodigoHorario());
        return sentencia.executeUpdate();
    }   
    
    
    
    
        
    //METODO PARA CONTAR Y VALIDAR EL NUMERO DE ATENCIONES QUE TENDRA UN PSICOLOGO AL DIA
    public int contarNumeroDeAtencionesDelPsicologoPorDia(Psicologo psicologo, HorarioPsicologo horarioPsicologo){
        String consultaSQL = "select count(ct.fecha) as totalCitasPorPsicologo from horariopsicologo ct inner join psicologo pa on ct.idpsicologo = pa.idpsicologo where ct.idpsicologo=? and ct.fecha=?";
        PreparedStatement sentencia;
        int contadorDeCitasPorPsicologo = 0;
        try {
            sentencia = gestorJDBC.prepararSentencia(consultaSQL);                       
            sentencia.setInt(1, psicologo.getIdPsicologo());
            sentencia.setString(2, horarioPsicologo.getFechaAtencion());
            ResultSet resultadoHorarioPsicologo = sentencia.executeQuery();
            if (resultadoHorarioPsicologo.next()) {
                contadorDeCitasPorPsicologo = resultadoHorarioPsicologo.getInt("totalCitasPorPsicologo");  
                System.out.println(contadorDeCitasPorPsicologo);
            }
            return contadorDeCitasPorPsicologo;
            
        } catch (SQLException e) {
            throw new IllegalArgumentException("Error al intentar realizar consulta del número de atencion del psicologo.", e);
        }
    }
            
    //METODO PARA VALIDAR SI EXISTE UN HORARIO REGISTRADO CON LA FECHA Y HORAS PARA UN MISMO PSICOLOGO
    public int verificarHorario(Psicologo psicologo, HorarioPsicologo horarioPsicologo){
        String consultaSQL = "select count(fecha) as contador from horariopsicologo where idpsicologo=? and fecha=? and horaentrada=? and horasalida=?";        
        PreparedStatement sentencia;
        int contadorHorario = 0;
        try {
            sentencia = gestorJDBC.prepararSentencia(consultaSQL);                       
            sentencia.setInt(1, psicologo.getIdPsicologo());            
            sentencia.setString(2, horarioPsicologo.getFechaAtencion());
            sentencia.setString(3, horarioPsicologo.getHoraEntrada());
            sentencia.setString(4, horarioPsicologo.getHoraSalida());
            ResultSet resultadoHorarioPsicologo = sentencia.executeQuery();
            if (resultadoHorarioPsicologo.next()) {
                contadorHorario = resultadoHorarioPsicologo.getInt("contador"); 
                System.out.println(contadorHorario);
            }
            return contadorHorario;
            
        } catch (SQLException e) {
            throw new IllegalArgumentException("Error al intentar realizar la consulta para verificar el horario del psicologo.", e);
        }
    }
    
    // METODOS PARA VISUALIZAR DATOS        
    public void MostrarHorario(DefaultTableModel modelo) {
        String consultaSQL = "select hp.codigo, hp.fecha,ps.nombrepsicologo,ps.especialidad, hp.horaentrada, hp.horasalida from horariopsicologo hp inner join psicologo ps on hp.idpsicologo = ps.idpsicologo";
        PreparedStatement sentencia;
        
        String titulos[] = {"CODIGO","FECHA","PSICOLOGO","ESPECIALIDAD","HORA DE ENTRADA","HORA DE SALIDA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        
        try {
            sentencia = gestorJDBC.prepararSentencia(consultaSQL);
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){                
                String codigoHorario= resultado.getString("codigo");
                String fecha= resultado.getString("fecha");
                String psicologo= resultado.getString("nombrepsicologo");
                String especialidad= resultado.getString("especialidad");
                String horaentrada= resultado.getString("horaentrada");
                String horasalida= resultado.getString("horasalida");
                String fila[] = {codigoHorario,fecha,psicologo,especialidad,horaentrada,horasalida};
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al intentar mostrar los horarios." , e);
        }
    }    
    
    String consultaHorario = "select hp.codigo, hp.fecha,ps.nombrepsicologo,ps.especialidad, hp.horaentrada, hp.horasalida from horariopsicologo hp inner join psicologo ps on hp.idpsicologo = ps.idpsicologo";
    public void mostrarHorarioDisponible(DefaultTableModel modelo){
        String consultaSQL = consultaHorario + "where to_date(fecha, 'YYYY-MM-dd')>=current_date and estado='Disponible'";
        PreparedStatement sentencia;
        
        String titulos[] = {"CODIGO","FECHA","PSICOLOGO","ESPECIALIDAD","HORA DE ENTRADA","HORA DE SALIDA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        
        try {
            sentencia = gestorJDBC.prepararSentencia(consultaSQL);
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){                
                String codigoHorario= resultado.getString("codigo");
                String fecha= resultado.getString("fecha");
                String psicologo= resultado.getString("nombrepsicologo");
                String especialidad= resultado.getString("especialidad");
                String horaentrada= resultado.getString("horaentrada");
                String horasalida= resultado.getString("horasalida");
                String fila[] = {codigoHorario,fecha,psicologo,especialidad,horaentrada,horasalida};
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al intentar mostrar los horarios." , e);
        }
    }  
    
    //--------------------------------------------------------------------------
    
    public void buscarPorNombrePsicologoEnHorario(DefaultTableModel modelo, String nombre) {
        String consultaSQL; 
        PreparedStatement sentencia;
        
        String titulos[] = {"CODIGO","FECHA","PSICOLOGO","ESPECIALIDAD","HORA DE ENTRADA","HORA DE SALIDA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        
        if(nombre.equals("")){
           consultaSQL = consultaHorario;
       }
       else{
           consultaSQL = consultaHorario + " where ps.nombrepsicologo LIKE '%" + nombre + "%'";
       }
        
        try {
            sentencia = gestorJDBC.prepararSentencia(consultaSQL);
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){                
                String codigoHorario= resultado.getString("codigo");
                String fecha= resultado.getString("fecha");
                String psicologo= resultado.getString("nombrepsicologo");
                String especialidad= resultado.getString("especialidad");
                String horaentrada= resultado.getString("horaentrada");
                String horasalida= resultado.getString("horasalida");
                String fila[] = {codigoHorario,fecha,psicologo,especialidad,horaentrada,horasalida};
                totalRegistros = totalRegistros + 1;
                modelo.addRow(fila);
            }            
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al intentar mostrar los horarios." , e);
        }
    }  
            
    public void buscarPorEspecialidadPsicologoEnHorario(DefaultTableModel modelo, String especialidadPsicologo){
        String consultaSQL; 
        PreparedStatement sentencia;
        
        String titulos[] = {"CODIGO","FECHA","PSICOLOGO","ESPECIALIDAD","HORA DE ENTRADA","HORA DE SALIDA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        
        if(especialidadPsicologo.equals("")){
           consultaSQL = consultaHorario;
       }
       else{
           consultaSQL = "select hp.codigo, hp.fecha,ps.nombrepsicologo,ps.especialidad, hp.horaentrada, hp.horasalida from horariopsicologo hp inner join psicologo ps on hp.idpsicologo = ps.idpsicologo where ps.especialidad LIKE '%" + especialidadPsicologo + "%'";
       }
        
        try {
            sentencia = gestorJDBC.prepararSentencia(consultaSQL);
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){                
                String codigoHorario= resultado.getString("codigo");
                String fecha= resultado.getString("fecha");
                String psicologo= resultado.getString("nombrepsicologo");
                String especialidad= resultado.getString("especialidad");
                String horaentrada= resultado.getString("horaentrada");
                String horasalida= resultado.getString("horasalida");
                String fila[] = {codigoHorario,fecha,psicologo,especialidad,horaentrada,horasalida};
                totalRegistros = totalRegistros + 1;
                modelo.addRow(fila);
            }            
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al intentar mostrar los horarios." , e);
        }
    }  
    
    public void buscarPorFechaEnHorario(DefaultTableModel modelo, String fechaHorario){
        String consultaSQL = construirConsultaSQL(fechaHorario);
        prepararModelo(modelo);

        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(consultaSQL);
            ResultSet resultado = sentencia.executeQuery();
            procesarResultados(modelo, resultado);
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al intentar mostrar los horarios.", e);
        }
    }  
    
    private String construirConsultaSQL(String fechaHorario) {
        if (fechaHorario.equals("  /  /    ")) {
            return consultaHorario;
        } else {
            return "select hp.codigo, hp.fecha,ps.nombrepsicologo,ps.especialidad, hp.horaentrada, hp.horasalida from horariopsicologo hp inner join psicologo ps on hp.idpsicologo = ps.idpsicologo where hp.fecha LIKE '%" + fechaHorario + "%'";
        }
    }
    
    private void prepararModelo(DefaultTableModel modelo) {
        String titulos[] = {"CODIGO", "FECHA", "PSICOLOGO", "ESPECIALIDAD", "HORA DE ENTRADA", "HORA DE SALIDA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
    }
    
    private void procesarResultados(DefaultTableModel modelo, ResultSet resultado) throws SQLException {
        while (resultado.next()) {
            String codigoHorario = resultado.getString("codigo");
            String fecha = resultado.getString("fecha");
            String psicologo = resultado.getString("nombrepsicologo");
            String especialidad = resultado.getString("especialidad");
            String horaentrada = resultado.getString("horaentrada");
            String horasalida = resultado.getString("horasalida");
            String fila[] = {codigoHorario, fecha, psicologo, especialidad, horaentrada, horasalida};
            totalRegistros++;
            modelo.addRow(fila);
        }
    }
    
}
