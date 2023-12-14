package capa.persistencia;

import capa.dominio.Psicologo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TECNOPATA
 */
public class PsicologoDAO {

    int totalRegistros;
    private AccesoDatosJDBC gestorJDBC;

    public PsicologoDAO(AccesoDatosJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }

    public PsicologoDAO() {
    }

    //METODO PARA BUSCAR PSICOLOGO
    public Psicologo buscarPsicologo(String dni) throws Exception {
        String consulta = "select idpsicologo,nombrepsicologo,dnipsicologo,especialidad from psicologo where dnipsicologo = ?";
        PreparedStatement sentencia;

        try {
            sentencia = gestorJDBC.prepararSentencia(consulta);
            sentencia.setString(1, dni);
            ResultSet resultadoPsicologo = sentencia.executeQuery();
            if (resultadoPsicologo.next()) {
                Psicologo psicologo = new Psicologo();
                psicologo.setDni(dni);
                psicologo.setIdPsicologo(resultadoPsicologo.getInt("idpsicologo"));
                psicologo.setNombre(resultadoPsicologo.getString("nombrepsicologo"));
                psicologo.setEspecialidad(resultadoPsicologo.getString("especialidad"));
                return psicologo;
            } else {
                throw new Exception("EL PSICOLOGO QUE INTENTA BUSCAR NO SE ENCUENTRA REGISTRADO.");
            }
        } catch (Exception e) {
            throw new Exception("ERROR AL INTENTAR BUSCAR AL PSICOLOGO", e);
        }
    }

    //METODO PARA BUSCAR PSICOLOGO POR ID
    public Psicologo buscarPsicologoPorId(int id) throws Exception {
        String consulta = "select nombrepsicologo,dnipsicologo,especialidad from psicologo where idpsicologo = ?";
        PreparedStatement sentencia;

        try {
            sentencia = gestorJDBC.prepararSentencia(consulta);
            sentencia.setInt(1, id);
            ResultSet resultadoPsicologo = sentencia.executeQuery();
            if (resultadoPsicologo.next()) {
                Psicologo psicologo = new Psicologo();
                psicologo.setIdPsicologo(id);
                psicologo.setNombre(resultadoPsicologo.getString("nombrepsicologo"));
                psicologo.setDni(resultadoPsicologo.getString("dnipsicologo"));
                psicologo.setEspecialidad(resultadoPsicologo.getString("especialidad"));
                return psicologo;
            } else {
                throw new Exception("EL PSICOLOGO QUE INTENTA BUSCAR NO SE ENCUENTRA REGISTRADO.");
            }
        } catch (Exception e) {
            throw new Exception("ERROR AL INTENTAR BUSCAR AL PSICOLOGO", e);
        }
    }

    //METODO PARA REGISTRAR UN NUEVO PSICOLOGO
    public int ingresarPsicologo(Psicologo psicologo) throws SQLException {
        String sentenciaSQL = "insert into psicologo(nombrepsicologo,dnipsicologo,especialidad) values(?,?,?)";
        PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
        sentencia.setString(1, psicologo.getNombre());
        sentencia.setString(2, psicologo.getDni());
        sentencia.setString(3, psicologo.getEspecialidad());
        return sentencia.executeUpdate();
    }

    //METODO PARA VERIFICAR Y VALIDAR SI EXISTE UN PSICOLOGO CON EL MISMO NUMERO DE DNI
    public int verificarDniUnicoPsicologo(Psicologo psicologo) throws Exception {
        String consultaSQL = "select count(dnipsicologo) as contadorDniUnico from psicologo where dnipsicologo=?";
        PreparedStatement sentencia;
        int validadorDniUnico = 0;
        try {
            sentencia = gestorJDBC.prepararSentencia(consultaSQL);
            sentencia.setString(1, psicologo.getDni());
            ResultSet resultadoPsicologo = sentencia.executeQuery();
            if (resultadoPsicologo.next()) {
                validadorDniUnico = resultadoPsicologo.getInt("contadorDniUnico");
            }
            return validadorDniUnico;
        } catch (SQLException e) {
            throw new Exception("Error al intentar realizar la consulta.", e);
        }
    }
}
