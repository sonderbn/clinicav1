package capa.dominio;

public class Psicologo {

    private int idPsicologo;
    private String nombre;
    private String dni;		
    private String especialidad;

    public Psicologo(){
    }

    public Psicologo(int idPsicologo, String nombre, String dni, String especialidad) {
        this.idPsicologo = idPsicologo;
        this.nombre = nombre;
        this.dni = dni;
        this.especialidad = especialidad;
    }        
    
    public int getIdPsicologo() {
        return idPsicologo;
    }

    public void setIdPsicologo(int idPsicologo) {
        this.idPsicologo = idPsicologo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }      
    
    
    //INICIO: METODOS PARA VALIDAR CAMPOS VACIOS--------------------------------
    public boolean validarNombrePsicologo(){
        return nombre.isBlank();
    }
    
    public boolean validarEspecialidad(){
        return especialidad.isBlank();
    }
    
    public boolean validarDniPsicologo(){
        return dni.isBlank();
    }
    
    public long validarCantidaDigitosDni(){
        return dni.chars().count();
    } //---------------------------------------------FIN------------------------
            
    //METODO PARA VERIFICAR SI EXISTE UN PSICOLOGO CON EL MISMO NUMERO DE DNI
    public boolean validarDniRepetidoPsicologo(int dni){
        return dni == 1;
    }
}