package capa.persistencia;

import capa.dominio.TipoDeCita;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TipoDeCitaDAO {
    
    AccesoDatosJDBC gestorJDBC;

    public TipoDeCitaDAO() {
    }

    public TipoDeCitaDAO(AccesoDatosJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }
    
    //METODO BUSCAR TIPO DE CITA
    public TipoDeCita buscarTipoDeCita(String nombreTipoDeCita) throws Exception {                
        String consulta = "select idtipodecita,nombretipodecita,tarifa,duracion from tipodecita where nombretipodecita = ?";
        PreparedStatement sentencia;
        
        try {
            sentencia = gestorJDBC.prepararSentencia(consulta);
            sentencia.setString(1, nombreTipoDeCita);
            ResultSet resultadoTipoDeCita = sentencia.executeQuery();
            if(resultadoTipoDeCita.next()){                        
            TipoDeCita tipoDeCita = new TipoDeCita();            
            tipoDeCita.setTipoDeCita(nombreTipoDeCita);
            tipoDeCita.setIdTipoDeCita(resultadoTipoDeCita.getInt("idtipodecita"));            
            tipoDeCita.setTarifa(resultadoTipoDeCita.getDouble("tarifa"));
            tipoDeCita.setDuracion(resultadoTipoDeCita.getInt("duracion"));            
            return tipoDeCita;                                    
        } else {
            throw new Exception("EL TIPO DE CITA QUE INTENTA BUSCAR NO SE ENCUENTRA REGISTRADO.");            }            
        } catch (Exception e) {
            throw new Exception("ERROR AL INTENTAR BUSCAR EL TIPO DE CITA", e);
        }
    }

    //METODO PARA REGISTRAR UN NUEVO TIPO DE CITA
    public int ingresarTipoDeCita(TipoDeCita tipoDeCita) throws SQLException {
        String sentenciaSQL = "insert into tipodecita(nombretipodecita,tarifa,duracion) values(?,?,?)";
        PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
        sentencia.setString(1, tipoDeCita.getTipoDeCita());
        sentencia.setDouble(2, tipoDeCita.getTarifa());
        sentencia.setInt(3, tipoDeCita.getDuracion());
        return sentencia.executeUpdate();
    }
    
    //METODO PARA VERIFICAR SI EXISTE UN TIPO DE CITA CON EL MISMO NOMBRE
    public int verificarDniUnicoPsicologo(TipoDeCita tipoDeCita) throws Exception{
        String consultaSQL = "select count(nombretipodecita) as total from tipodecita where nombretipodecita=?";
        PreparedStatement sentencia;
        int validadorDniUnico = 0;
        try {
            sentencia = gestorJDBC.prepararSentencia(consultaSQL);                       
            sentencia.setString(1, tipoDeCita.getTipoDeCita());            
            ResultSet resultadoTipoDeCita = sentencia.executeQuery();
            if (resultadoTipoDeCita.next()) {
                validadorDniUnico = resultadoTipoDeCita.getInt("total");                                
            }
            return validadorDniUnico;            
        } catch (SQLException e) {
            throw new Exception("Error al intentar realizar la consulta.", e);
        }                
    }               

}
