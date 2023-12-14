package capa.persistencia;

import capa.dominio.Cita;
import capa.dominio.HorarioPsicologo;
import capa.dominio.Paciente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TECNOPATA
 */
public class CitaDAO {
    
    private AccesoDatosJDBC gestorJDBC;    
    
    public CitaDAO(){        
    }    

    public CitaDAO(AccesoDatosJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }
    
    //METODO PARA REGISTRAR UNA CITA
    public int ingresarCita(Cita cita) throws SQLException {
        String sentenciaSQL = "insert into cita(fecha,horadecita,descuento,pagototal,idpaciente,idtipodecita,idhorariopsicologo) values(?,?,?,?,?,?,?)";
        PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);        
        sentencia.setString(1, cita.getFechaCita());
        sentencia.setString(2, cita.getHoraDeEntrada());
        sentencia.setDouble(3, cita.getDescuento());
        sentencia.setDouble(4, cita.getPagoTotal());
        sentencia.setInt(5, cita.getPaciente().getIdPaciente());        
        sentencia.setInt(6, cita.getTipoDeCita().getIdTipoDeCita());
        sentencia.setInt(7, cita.getHorarioPsicologo().getIdhorariopsicologo());       
        return sentencia.executeUpdate();
    }
    
    //ASIGNAR HORARIO
    public int asignarHorario(HorarioPsicologo horarioPsicologo) throws Exception {
        String sentenciaSQL = "update horariopsicologo set estado='Asignado' where codigo=?";
        PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);                     
        sentencia.setString(1, horarioPsicologo.getCodigoHorario());
        return sentencia.executeUpdate();
    }
    
    //METODO PARA VALIDAR QUE EL PACIENTE TENGA SOLO UNA CITA POR DIA O DETERMINADA FECHA
    public int contarNumeroDeCitasDelPacientePorDia(Paciente paciente, Cita cita) throws Exception {
        String consultaSQL = "select count(ct.fecha) as totalCitasPorPaciente from cita ct inner join paciente pa on ct.idpaciente = pa.idpaciente where ct.idpaciente=? and ct.fecha =?";
        PreparedStatement sentencia;
        int contadorDeCitasPorPsicologo = 0;
        try {
            sentencia = gestorJDBC.prepararSentencia(consultaSQL);                       
            sentencia.setInt(1, paciente.getIdPaciente());
            sentencia.setString(2, cita.getFechaCita());
            ResultSet resultadoPsicologo = sentencia.executeQuery();
            if (resultadoPsicologo.next()) {
                contadorDeCitasPorPsicologo = resultadoPsicologo.getInt("totalCitasPorPaciente"); 
                System.out.println(contadorDeCitasPorPsicologo);
            }
            return contadorDeCitasPorPsicologo;
            
        } catch (SQLException e) {
            throw new IllegalArgumentException("Error al intentar realizar la consulta.", e);
        }
    }
    
    //METODO PARA VALIDAR SI EXISTE UNA CITA REGISTRADA CON UN HORARIO DE ATENCION 
    public int validarCitaConHorarioExitente(Cita cita, HorarioPsicologo horarioPsicologo) throws Exception{
        String consultaSQL = "select count(ct.idhorariopsicologo) as total from cita ct inner join horariopsicologo hp on ct.idhorariopsicologo = hp.idhorariopsicologo where ct.idhorariopsicologo=?";
        PreparedStatement sentencia;
        int contadorDeCitasConHorario = 0;
        try {
            sentencia = gestorJDBC.prepararSentencia(consultaSQL);        
            sentencia.setInt(1, cita.getHorarioPsicologo().getIdhorariopsicologo());
            ResultSet resultadoPsicologo = sentencia.executeQuery();
            if (resultadoPsicologo.next()) {
                contadorDeCitasConHorario = resultadoPsicologo.getInt("total");                
                System.out.println(contadorDeCitasConHorario);
            }
            return contadorDeCitasConHorario;
            
        } catch (SQLException e) {
            throw new IllegalArgumentException("Error al intentar realizar la consulta.", e);
        }
    }
    
    //METODO PARA VISUALIZAR LAS CITAS REGISTRADAS        
    
    public void mostrarCitas(DefaultTableModel modelo){
        String consultaSQL = "Select ct.horadecita, concat(pa.nombrepaciente,' ',pa.apellidospaciente) as paci, ct.fecha, ps.nombrepsicologo, ps.especialidad, tc.nombretipodecita, tc.tarifa, ct.descuento, ct.pagototal from cita ct inner join paciente pa on ct.idpaciente = pa.idpaciente inner join tipodecita tc on ct.idtipodecita = tc.idtipodecita inner join horariopsicologo hp on ct.idhorariopsicologo = hp.idhorariopsicologo inner join psicologo ps on hp.idpsicologo = ps.idpsicologo";
        PreparedStatement sentencia;
        
        String titulos[] = {"CODIGO","PACIENTE","FECHA","PSICOLOGO","ESPECIALIDAD","TIPO DE CITA","TARIFA", "DESCUENTO", "TOTAL"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        
        try {
            sentencia = gestorJDBC.prepararSentencia(consultaSQL);
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){                
                String horacita= resultado.getString("horadecita");
                String otro= resultado.getString("paci");
                String fecha= resultado.getString("fecha");
                String psicologo= resultado.getString("nombrepsicologo");
                String especialidad= resultado.getString("especialidad");
                String tipodecita= resultado.getString("nombretipodecita");
                String tarifa= resultado.getString("tarifa");                
                String descuento= resultado.getString("descuento");   
                String total= resultado.getString("pagototal");   
                String fila[] = {horacita,otro,fecha,psicologo,especialidad,tipodecita,tarifa, descuento, total};
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al intentar mostrar los horarios." , e);
        }
    }     
    
}
