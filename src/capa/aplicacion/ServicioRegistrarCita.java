package capa.aplicacion;

import capa.dominio.Cita;
import capa.dominio.HorarioPsicologo;
import capa.dominio.Paciente;
import capa.dominio.TipoDeCita;
import capa.persistencia.AccesoDatosJDBC;
import capa.persistencia.AccesoDatosJDBCPostgreSQL;
import capa.persistencia.CitaDAO;
import capa.persistencia.PacienteDAO;
import capa.persistencia.HorarioPsicologoDAO;
import capa.persistencia.TipoDeCitaDAO;
import javax.swing.table.DefaultTableModel;

public class ServicioRegistrarCita {

    private AccesoDatosJDBC gestorJDBC;
    private PacienteDAO pacienteDAO;
    private CitaDAO citaDAO;
    private TipoDeCitaDAO tipoDeCitaDAO;
    private HorarioPsicologoDAO horarioPsicologoDAO;

    public ServicioRegistrarCita() {
        gestorJDBC = new AccesoDatosJDBCPostgreSQL();
        citaDAO = new CitaDAO(gestorJDBC);
        pacienteDAO = new PacienteDAO(gestorJDBC);
        horarioPsicologoDAO = new HorarioPsicologoDAO(gestorJDBC);
        tipoDeCitaDAO = new TipoDeCitaDAO(gestorJDBC);
    }
    

    //METODO PARA BUSCAR EL TIPO DE CITA
    public TipoDeCita buscarTipoDeCita(String nombreTipoDeCita) throws Exception {
        gestorJDBC.abrirConexion();
        TipoDeCita tipoDeCita = tipoDeCitaDAO.buscarTipoDeCita(nombreTipoDeCita);
        gestorJDBC.cerrarConexion();
        return tipoDeCita;
    }

    //METODO PARA BUSCAR EL PACIENTE
    public Paciente buscarPaciente(String dni) throws Exception {
        gestorJDBC.abrirConexion();
        Paciente paciente = pacienteDAO.buscarPaciente(dni);
        gestorJDBC.cerrarConexion();
        return paciente;
    }
    
    //METODO PARA BUSCAR EL HORARIO
    public HorarioPsicologo buscarHorarioPsicologo(String codigo) throws Exception {
        gestorJDBC.abrirConexion();
        HorarioPsicologo horarioPsicologo = horarioPsicologoDAO.buscarHorario(codigo);
        gestorJDBC.cerrarConexion();
        return horarioPsicologo;
    }
    
    //METODO PARA MOSTRAR LAS CITAS
    public void mostrarCitas(DefaultTableModel modelo) throws Exception {
        gestorJDBC.abrirConexion();
        citaDAO.mostrarCitas(modelo);
        gestorJDBC.cerrarConexion();
    }

    //METODO PARA MOSTRAR LOS HORARIOS
    public void mostrarHorario(DefaultTableModel modelo) throws Exception {
        gestorJDBC.abrirConexion();
        horarioPsicologoDAO.mostrarHorarioDisponible(modelo);
        gestorJDBC.cerrarConexion();
    }

    //METODO PARA GUARDAR LA CITA HACIENDO VALIDAR LAS REGLAS DEL NEGOCIO
    public int agregarCita(Cita cita) throws Exception {
        if (cita.validarPagoTotal()) {
            throw new IllegalArgumentException("El descuento no puede ser superior al monto de la tarifa según el tipo de cita.");
        }
        Paciente paciente = cita.getPaciente();
        HorarioPsicologo horarioPsicologo = cita.getHorarioPsicologo();
        gestorJDBC.abrirConexion();
        int totalDeCitasPorPacienteAlDia = citaDAO.contarNumeroDeCitasDelPacientePorDia(paciente, cita);
        int validarDeHorario = citaDAO.validarCitaConHorarioExitente(cita, horarioPsicologo);
        if (cita.totalDeCitasPorDiaPaciente(totalDeCitasPorPacienteAlDia)) {
            throw new IllegalArgumentException("No se puede registrar una nueva cita porque el paciente ya cuenta con una en la misma fecha indicada.");
        }
        if (cita.validarHorarioDisponible(validarDeHorario)) {
            throw new IllegalArgumentException("No se puede registrar la cita, porque ya existe una cita registrada en este horario.");
        }
        try {
            gestorJDBC.iniciarTransaccion();
            int registrosRealizados = citaDAO.ingresarCita(cita);
            citaDAO.asignarHorario(horarioPsicologo);
            gestorJDBC.terminarTransaccion();
            gestorJDBC.cerrarConexion();
            return registrosRealizados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            throw e;
        }
    }
    
}
