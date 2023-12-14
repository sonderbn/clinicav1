package capa.dominio;

/**
 *
 * @author TECNOPATA
 */
public class HorarioPsicologo {
    
    private int idhorariopsicologo;
    private String fechaAtencion;
    private String horaEntrada;
    private String horaSalida;
    private String  codigoHorario;
    private Psicologo psicologo;    
    
    
    public HorarioPsicologo() {
    }

    public HorarioPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;                
    }

    public HorarioPsicologo(int idhorariopsicologo, String fechaAtencion, String horaEntrada, String horaSalida, String codigoHorario, Psicologo psicologo) {
        this.idhorariopsicologo = idhorariopsicologo;
        this.fechaAtencion = fechaAtencion;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.codigoHorario = codigoHorario;
        this.psicologo = psicologo;
    }         

    public int getIdhorariopsicologo() {
        return idhorariopsicologo;
    }

    public void setIdhorariopsicologo(int idhorariopsicologo) {
        this.idhorariopsicologo = idhorariopsicologo;
    }        
    
    public String getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(String fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }        

    public String getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(String codigoHorario) {
        this.codigoHorario = codigoHorario;
    }        

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }        
    
    
    //---------- REGLAS DEL NEGOCIO --------------------------------------------                        
    
    //validar Codigo
    public boolean validarCodigo(){
        return codigoHorario.isEmpty();
    }
    
    
    //El psicologo no puede tener mas de 7 atenciones por dia.
    //METODO PARA CONTAR EL NUMERO 
    public boolean totalDeCitasPorDiaPsicologo(int totalDeCitasPorDiaPsicologo){
        return totalDeCitasPorDiaPsicologo ==7 ;
    }
        
    //METODO PARA VALIDAR SI EXISTE HORARIO EN LA MISMO FECHA Y HORA PARA UN PSICOLOGO
    public boolean contarHorarioPsicogolo(int contador){
        return contador >= 1;
    }
}
