package capa.dominio;

public class Cita {

    private int idCita;
    private String fechaCita;
    private String horaDeEntrada;
    private double descuento;
    private double pagoTotal;
    private Paciente paciente;
    private TipoDeCita tipoDeCita;
    private HorarioPsicologo horarioPsicologo;    

    public Cita() {
    }

    public Cita(int idCita, String fechaCita, String horaDeEntrada, double descuento, double pagoTotal, Paciente paciente, TipoDeCita tipoDeCita, HorarioPsicologo horarioPsicologo) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.horaDeEntrada = horaDeEntrada;
        this.descuento = descuento;
        this.pagoTotal = pagoTotal;
        this.paciente = paciente;
        this.tipoDeCita = tipoDeCita;
        this.horarioPsicologo = horarioPsicologo;
    }        

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(String horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(double pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public TipoDeCita getTipoDeCita() {
        return tipoDeCita;
    }

    public void setTipoDeCita(TipoDeCita tipoDeCita) {
        this.tipoDeCita = tipoDeCita;
    }

    public HorarioPsicologo getHorarioPsicologo() {
        return horarioPsicologo;
    }

    public void setHorarioPsicologo(HorarioPsicologo horarioPsicologo) {
        this.horarioPsicologo = horarioPsicologo;
    }    

    //--------------------------------------------------------------------------
    
    //METODO PARA CALCULAR EL MONTO TOTAL A PAGAR DE LA CITA
    public double calcularTotal(double tarifa, double descuento) {
        return pagoTotal = tarifa - descuento;
    }
    
    // METODO PARA VALIDAR QUE EL MONTO TOTAL NO SEA MENOR A CERO    
    public boolean validarPagoTotal() {
        return pagoTotal < 0;
    }

    //METODO PARA VALIDAR EL NUMERO DE CITAS QUE PUEDE TENER UN PACIENTE AL DIA
    public boolean totalDeCitasPorDiaPaciente(int totalDeCitasPorDiaPaciente) {
        return totalDeCitasPorDiaPaciente == 1;
    }
    
    //METODO PARA VALIDAR EL NUMERO DE CITAS QUE PUEDE TENER UN PSICOLOGO AL DIA
    public boolean totalDeCitasPorDiaPsicologo(int totalDeCitasPorDiaPsicologo) {
        return totalDeCitasPorDiaPsicologo < 7;
    }
    
    //METODO PARA VERIFICAR Y VALIDAR SI EL HORARIO ESTA DISPONIBLE
    public boolean validarHorarioDisponible(int total){
        return total == 1;
    }
}
