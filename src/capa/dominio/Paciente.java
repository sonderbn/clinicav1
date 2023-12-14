package capa.dominio;

/**
 * @author MELANIE
 * @version 1.0
 * @created 23-May.-2022 20:49:25
 */
public class Paciente {

    private int idPaciente;
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaDeNacimiento;    
    private String telefono;

    public Paciente() {
    }

    public Paciente(int idPaciente, String nombre, String apellido, String dni, String fechaDeNacimiento, String telefono) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
    }   
    
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    //---------------------------- REGLAS DEL NEGOCIO...........................
    
    //INICIO: METODOS PARA VERIFICAR SI LOS CAMPOS ESTAN VACIOS-----------------
    
    public boolean validarNombre(){
        return nombre.isBlank();
    }
    
    public boolean validarApellidos(){
        return apellido.isBlank();
    }
    
    public boolean validarDni(){
        return dni.isBlank();
    } 
    
    public boolean validarFechaNacimiento(){
        return fechaDeNacimiento.isBlank();
    } 
    
    public boolean validarTelefono(){
        return telefono.isBlank();
    }        
    
    public long validarCantidaDigitosDNI(){
        return dni.chars().count();        
    }
    
    public long validarCantidaDigitosTelefono(){        
        return telefono.chars().count();                       
    } //------------------------------------------------FIN---------------------
    
    
    //METODO PARA VALIDAR SI EXISTE UN PACIENTE CON EL MISMO NUMERO DE DNI        
    public boolean validarDniRepetidoPaciente(int dni){
        return dni == 1;
    }    
    
}
