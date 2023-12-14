package capa.aplicacion;

import capa.dominio.Paciente;
import capa.persistencia.AccesoDatosJDBC;
import capa.persistencia.AccesoDatosJDBCPostgreSQL;
import capa.persistencia.PacienteDAO;

public class ServicioRegistrarPaciente {

    private AccesoDatosJDBC gestorJDBC;
    private PacienteDAO pacienteDAO;

    public ServicioRegistrarPaciente() {
        gestorJDBC = new AccesoDatosJDBCPostgreSQL();
        pacienteDAO = new PacienteDAO(gestorJDBC);
    }

    public Paciente buscarPaciente(String dni) throws Exception {
        gestorJDBC.abrirConexion();
        Paciente paciente = pacienteDAO.buscarPaciente(dni);
        gestorJDBC.cerrarConexion();
        return paciente;
    }

    public int agregarPaciente(Paciente paciente) throws Exception {
        
        if (paciente.validarNombre()) {
            throw new IllegalArgumentException("Ingrese el nombre del paciente.");
        } else if (paciente.validarApellidos()) {
            throw new IllegalArgumentException("Ingrese los apellidos del paciente.");
        } else if (paciente.validarDni()) {
            throw new IllegalArgumentException("Ingrese el número de DNI del paciente.");
        } else if (paciente.validarCantidaDigitosDNI() < 8) {
            throw new IllegalArgumentException("Verifique el número de DNI tiene " + String.valueOf(paciente.validarCantidaDigitosDNI()) + " dígitos.");
        } else if ("  /  /    ".equals(paciente.getFechaDeNacimiento())) {
            throw new IllegalArgumentException("Ingrese la fecha de nacimiento del paciente.");
        } else if (paciente.validarTelefono()) {
            throw new IllegalArgumentException("Ingrese el número celular (referencial) del paciente.");
        } else if (paciente.validarCantidaDigitosTelefono() < 9) {
            throw new IllegalArgumentException("Verifique el número de celular tiene " + String.valueOf(paciente.validarCantidaDigitosTelefono()) + " dígitos.");
        }                
        gestorJDBC.abrirConexion();
        int dniPaciente  = pacienteDAO.verificarDniUnicoPaciente(paciente);                
        if(paciente.validarDniRepetidoPaciente(dniPaciente)){
            throw new IllegalArgumentException("Existe un paciente registrado con el mismo número de dni.");
        }        
        try {            
            gestorJDBC.iniciarTransaccion();
            int registrosRealizados = pacienteDAO.ingresarPaciente(paciente);
            gestorJDBC.terminarTransaccion();
            gestorJDBC.cerrarConexion();
            return registrosRealizados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            throw e;
        }
    }
    
}
