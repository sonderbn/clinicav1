package capa.aplicacion;

import capa.dominio.Psicologo;
import capa.persistencia.AccesoDatosJDBC;
import capa.persistencia.AccesoDatosJDBCPostgreSQL;
import capa.persistencia.PsicologoDAO;

/**
 *
 * @author TECNOPATA
 */
public class ServicioRegistrarPsicologo {

    private AccesoDatosJDBC gestorJDBC;
    private PsicologoDAO psicologoDAO;

    public ServicioRegistrarPsicologo() {
        gestorJDBC = new AccesoDatosJDBCPostgreSQL();
        psicologoDAO = new PsicologoDAO(gestorJDBC);
    }

    public Psicologo buscarPsicologo(String dni) throws Exception {
        gestorJDBC.abrirConexion();
        Psicologo psicologo = psicologoDAO.buscarPsicologo(dni);
        gestorJDBC.cerrarConexion();
        return psicologo;
    }

    public int agregarPsicologo(Psicologo psicologo) throws Exception {               
         if (psicologo.validarNombrePsicologo()) {
            throw new IllegalArgumentException("Ingrese el nombre del psicólogo.");
        } else if (psicologo.validarDniPsicologo()) {
            throw new IllegalArgumentException("Ingrese el número de DNI del psicólogo.");
        } else if (psicologo.validarCantidaDigitosDni() < 8) {
            throw new IllegalArgumentException("Verifique el número de DNI del psicólogo tiene " + psicologo.validarCantidaDigitosDni() + " dígitos.");
        } else if (psicologo.validarEspecialidad()) {
            throw new IllegalArgumentException("Ingrese la especialidad del psicólogo.");
        }         
        gestorJDBC.abrirConexion();
        int dniPsicologo  = psicologoDAO.verificarDniUnicoPsicologo(psicologo);                
        if(psicologo.validarDniRepetidoPsicologo(dniPsicologo)){
            throw new IllegalArgumentException("Existe un Psicólogo registrado con el mismo número de dni.");
        } 
        try {
            gestorJDBC.iniciarTransaccion();
            int registrosRealizados = psicologoDAO.ingresarPsicologo(psicologo);
            gestorJDBC.terminarTransaccion();
            gestorJDBC.cerrarConexion();
            return registrosRealizados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            throw e;
        }
    }

}
