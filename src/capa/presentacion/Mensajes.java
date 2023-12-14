package capa.presentacion;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author TECNOPATA
 */
public class Mensajes {

    private static final String errorDeConsulta = "No se pudo realizar la consulta, intente de nuevo o consulte con el Administrador.";
    private static final String advertenciaDeCreacion = "Los datos no fueron guardados, verifique.";
    private static final String afirmacionDeCreacion = "Los datos fueron guardados.";
    private static final String afirmacionDeBusqueda = "Los datos fueron encontrados.";
    private static final String errorDeBusqueda = "Los datos no fueron encontrados.";

    public static void mostrarAfirmacionDeCreacion(JDialog dialogo) {
        JOptionPane.showMessageDialog(dialogo, afirmacionDeCreacion, "Consultorio Psicologico: Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrarError(JDialog dialogo, String mensaje) {
        JOptionPane.showMessageDialog(dialogo, mensaje, "Consultorio Psicologico: Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarAdvertenciaDeCreacion(JDialog dialogo) {
        JOptionPane.showMessageDialog(dialogo, advertenciaDeCreacion, "Consultorio Psicologico: Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    
    public static void mostrarAfirmacionDeBusqueda(JDialog dialogo) {
        JOptionPane.showMessageDialog(dialogo, afirmacionDeBusqueda, "Consultorio Psicologico: Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void mostrarAdvertencia(JDialog dialogo, String mensaje){
        JOptionPane.showMessageDialog(dialogo,mensaje,"Consultorio Psicologico: Advertencia",JOptionPane.WARNING_MESSAGE);
    }
    
    public static void mostrarErrorDeConsulta(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,errorDeConsulta,"Consultorio Psicologico: Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostrarErrorDeBusqueda(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,errorDeBusqueda,"Consultorio Psicologico: Error",JOptionPane.ERROR_MESSAGE);
    }
}
