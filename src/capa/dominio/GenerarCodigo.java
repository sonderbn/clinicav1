package capa.dominio;


public class GenerarCodigo {
    
    //private int dato;
    private static final int cont=1;
    private String num="";
    
    public void generar(int valor) {
        int dato = valor;

        int can = cont + dato;

        if (dato >= 1000) {
            num = String.valueOf(can);
        } else if (dato >= 100) {
            num = "0" + can;
        } else if (dato >= 9) {
            num = "00" + can;
        } else {
            num = "000" + can;
        }
    }
    
   public String serie()
   {
       return this.num;
       
   }
    
}