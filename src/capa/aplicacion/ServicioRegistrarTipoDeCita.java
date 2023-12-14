package capa.aplicacion;

import capa.persistencia.AccesoDatosJDBC;
import capa.persistencia.AccesoDatosJDBCPostgreSQL;
import capa.persistencia.TipoDeCitaDAO;
import capa.dominio.TipoDeCita;

/**
 *
 * @author TECNOPATA
 */
public class ServicioRegistrarTipoDeCita {

    private AccesoDatosJDBC gestorJDBC;
    private TipoDeCitaDAO tipoDeCitaDAO;

    public ServicioRegistrarTipoDeCita() {
        gestorJDBC = new AccesoDatosJDBCPostgreSQL();
        tipoDeCitaDAO = new TipoDeCitaDAO(gestorJDBC);
    }

    public int agregarTipoDeCita(TipoDeCita tipoDeCita) throws Exception {        
        
        if (tipoDeCita.validarNombreTipoCita()) {            
            throw new IllegalArgumentException("Ingrese el nombre del Tipo de Cita.");
        }         
        else if (!tipoDeCita.validarMonto()) {
            throw new IllegalArgumentException("Ingrese una tarifa válida, que debe estar entre 100 y 200.");
        } 
        else if (!tipoDeCita.validarDuracion()) {
            throw new IllegalArgumentException("Ingrese una duracion válida, que debe estar entre 45 y 60 minutos.");
        }         
        gestorJDBC.abrirConexion();
        int nombreTipoCita  = tipoDeCitaDAO.verificarDniUnicoPsicologo(tipoDeCita);
        if(tipoDeCita.validarNombreRepetido(nombreTipoCita)){
            throw new IllegalArgumentException("Existe un tipo de cita con el mismo nombre, verifique y vuelva a intentarlo.");
        }         
        try {            
            gestorJDBC.iniciarTransaccion();
            int registrosRealizados = tipoDeCitaDAO.ingresarTipoDeCita(tipoDeCita);
            gestorJDBC.terminarTransaccion();
            gestorJDBC.cerrarConexion();
            return registrosRealizados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            throw e;
        }
    }

}
