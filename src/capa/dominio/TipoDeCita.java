package capa.dominio;

public class TipoDeCita {

    private int idTipoDeCita;
    private String nombreTipoDeCita;
    private double tarifa;
    private int duracion;
    
    public TipoDeCita() {
    }

    public TipoDeCita(int idTipoDeCita, String tipoDeCita, double tarifa, int duracion) {
        this.idTipoDeCita = idTipoDeCita;
        this.nombreTipoDeCita = tipoDeCita;
        this.tarifa = tarifa;
        this.duracion = duracion;
    }

    public int getIdTipoDeCita() {
        return idTipoDeCita;
    }

    public void setIdTipoDeCita(int idTipoDeCita) {
        this.idTipoDeCita = idTipoDeCita;
    }

    public String getTipoDeCita() {
        return nombreTipoDeCita ;
    }

    public void setTipoDeCita(String tipoDeCita) {
        this.nombreTipoDeCita = tipoDeCita;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }        

    //--------------------- REGLAS DEL NEGOCIO ---------------------------------

    //INICIO: METODOS PARA VALIDAR CAMPOS VACIOS--------------------------------
    public boolean validarNombreTipoCita(){
        return nombreTipoDeCita.isBlank();
    }    
    
    public boolean validarMonto(){
        return tarifa >= 100 && tarifa <=200;
    }
    
    public boolean validarDuracion(){
        return duracion >= 45 && duracion <= 60;
    } //--------------------------------------------------FIN-------------------
    
    
    //METODO PARA VERIFICAR Y VALIDAR SI EXISTE UN TIPO DE CITA CON EL MISMO NOMBRE
    public boolean validarNombreRepetido(int nombre){
        return nombre == 1;
    }
}
