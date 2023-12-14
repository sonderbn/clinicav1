package capa.persistencia;

import capa.dominio.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TECNOPATA
 */
public class PacienteDAO {

    AccesoDatosJDBC gestorJDBC;

    public PacienteDAO() {
    }

    public PacienteDAO(AccesoDatosJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }

    //METODO PARA BUSCAR PACIENTE
    public Paciente buscarPaciente(String dni) throws Exception {
        String consulta = "select idpaciente,nombrepaciente,apellidospaciente,dnipaciente,fechanacimiento,telefonopaciente from paciente where dnipaciente = ?";
        PreparedStatement sentencia;

        try {
            sentencia = gestorJDBC.prepararSentencia(consulta);
            sentencia.setString(1, dni);
            ResultSet resultadoPaciente = sentencia.executeQuery();
            if (resultadoPaciente.next()) {
                Paciente paciente = new Paciente();
                paciente.setDni(dni);
                paciente.setIdPaciente(resultadoPaciente.getInt("idpaciente"));
                paciente.setNombre(resultadoPaciente.getString("nombrepaciente"));
                paciente.setApellido(resultadoPaciente.getString("apellidospaciente"));
                paciente.setFechaDeNacimiento(resultadoPaciente.getString("fechanacimiento"));
                paciente.setTelefono(resultadoPaciente.getString("telefonopaciente"));
                return paciente;
            } else {
                throw new Exception("EL PACIENTE QUE INTENTA BUSCAR NO SE ENCUENTRA REGISTRADO.");
            }
        } catch (Exception e) {
            throw new Exception("ERROR AL INTENTAR BUSCAR AL PACIENTE", e);
        }
    }

    //METODO PARA REGISTRAR UN NUEVO PACIENTE
    public int ingresarPaciente(Paciente paciente) throws SQLException {
        String sentenciaSQL = "insert into paciente(nombrepaciente,apellidospaciente,dnipaciente,fechanacimiento,telefonopaciente) values(?,?,?,?,?)";
        PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
        sentencia.setString(1, paciente.getNombre());
        sentencia.setString(2, paciente.getApellido());
        sentencia.setString(3, paciente.getDni());
        sentencia.setString(4, paciente.getFechaDeNacimiento());
        sentencia.setString(5, paciente.getTelefono());
        return sentencia.executeUpdate();
    }

    //METODO PARA VERIFICAR Y VALIDAR SI EXISTE UN PACIENTE CON EL MISMO NUMERO DE DNI
    public int verificarDniUnicoPaciente(Paciente paciente) throws Exception{
        String consultaSQL = "select count(dnipaciente) as contadorDniUnico from paciente where dnipaciente=?";
        PreparedStatement sentencia;
        int validadorDniUnico = 0;
        try {
            sentencia = gestorJDBC.prepararSentencia(consultaSQL);                       
            sentencia.setString(1, paciente.getDni());            
            ResultSet resultadoPaciente = sentencia.executeQuery();
            if (resultadoPaciente.next()) {
                validadorDniUnico = resultadoPaciente.getInt("contadorDniUnico");                                
            }
            return validadorDniUnico;            
        } catch (SQLException e) {
            throw new Exception("Error al intentar realizar la consulta.", e);
        }                
    }

}
