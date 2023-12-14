package capa.aplicacion;

import capa.dominio.HorarioPsicologo;
import capa.dominio.Psicologo;
import capa.persistencia.AccesoDatosJDBC;
import capa.persistencia.AccesoDatosJDBCPostgreSQL;
import capa.persistencia.HorarioPsicologoDAO;
import capa.persistencia.PsicologoDAO;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TECNOPATA
 */
public class ServicioRegistrarHorarioPsicologo {

    private AccesoDatosJDBC gestorJDBC;
    private HorarioPsicologoDAO horarioPsicologoDAO;
    private PsicologoDAO psicologoDAO;

    public ServicioRegistrarHorarioPsicologo() {
        gestorJDBC = new AccesoDatosJDBCPostgreSQL();
        horarioPsicologoDAO = new HorarioPsicologoDAO(gestorJDBC);
        psicologoDAO = new PsicologoDAO(gestorJDBC);
    }

    //METODO PARA BUSCAR PSICOLOGO
    public Psicologo buscarPsicologo(String dni) throws Exception {
        gestorJDBC.abrirConexion();
        Psicologo psicologo = psicologoDAO.buscarPsicologo(dni);
        gestorJDBC.cerrarConexion();
        return psicologo;
    }

    //METODO PARA LLAMAR AL BUSCAR PSICOLOGO POR NOMBRE EN HORARIO
    public void buscarPsicologoEnHorario(DefaultTableModel modelo, String nombre) throws Exception {
        gestorJDBC.abrirConexion();
        horarioPsicologoDAO.buscarPorNombrePsicologoEnHorario(modelo, nombre);
        gestorJDBC.cerrarConexion();
    }
    
    //METODO PARA LLAMAR AL BUSCAR ESPECIALIDAD DEL PSICOLOGO EN HORARIO
    public void buscarEspecialidadPsicologoEnHorario(DefaultTableModel modelo, String especialidad) throws Exception {
        gestorJDBC.abrirConexion();
        horarioPsicologoDAO.buscarPorEspecialidadPsicologoEnHorario(modelo, especialidad);
        gestorJDBC.cerrarConexion();
    }

    //METODO PARA LLAMAR AL BUSCAR FECHA EN HORARIO
    public void buscarFechaEnHorario(DefaultTableModel modelo, String fecha) throws Exception {
        gestorJDBC.abrirConexion();
        horarioPsicologoDAO.buscarPorFechaEnHorario(modelo, fecha);
        gestorJDBC.cerrarConexion();
    }
    
     public int agregarHorarioPsicologo(HorarioPsicologo horarioPsicologo) throws Exception {
        validarCodigoHorario(horarioPsicologo);

        Psicologo psicologo = horarioPsicologo.getPsicologo();
        gestorJDBC.abrirConexion();

        int totalDeCitasPorPsicologoAlDia = horarioPsicologoDAO.contarNumeroDeAtencionesDelPsicologoPorDia(psicologo, horarioPsicologo);
        int totalHorario = horarioPsicologoDAO.verificarHorario(psicologo, horarioPsicologo);

        validarLimiteAtencionesPorDia(horarioPsicologo, totalDeCitasPorPsicologoAlDia);
        validarHorarioExistente(horarioPsicologo, totalHorario);

        try {
            gestorJDBC.iniciarTransaccion();
            int registrosRealizados = horarioPsicologoDAO.ingresarHorarioPsicologo(horarioPsicologo);
            gestorJDBC.terminarTransaccion();
            return registrosRealizados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            throw e;
        } finally {
            gestorJDBC.cerrarConexion();
        }
    }
    
    private void validarCodigoHorario(HorarioPsicologo horarioPsicologo){
        if (horarioPsicologo.validarCodigo()) {
            throw new IllegalArgumentException("Ingrese el código del horario");
        }
    }
    
    private void validarLimiteAtencionesPorDia(HorarioPsicologo horarioPsicologo, int totalDeCitasPorPsicologoAlDia){
        if (horarioPsicologo.totalDeCitasPorDiaPsicologo(totalDeCitasPorPsicologoAlDia)) {
            throw new IllegalArgumentException("Ha llegado al límite de atenciones por día.");
        }
    }
    
    private void validarHorarioExistente(HorarioPsicologo horarioPsicologo, int totalHorario) {
        if (horarioPsicologo.contarHorarioPsicogolo(totalHorario)) {
            throw new IllegalArgumentException("Existe un horario con las mismas horas y fecha para un psicólogo, verifique y vuelva a intentarlo.");
        }
    }

}
