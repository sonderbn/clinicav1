package capa.presentacion;

import java.awt.Frame;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author TECNOPATA
 */

public class FrmMenu extends javax.swing.JFrame {   
    
public FrmMenu() {
    initComponents();        
    this.setExtendedState(Frame.ICONIFIED);  // Minimiza la ventana 
    this.setLocationRelativeTo(null);        // Centra la ventana     
    this.setLocationRelativeTo(this);  
    SetImageLabel(label1,"src/Imagenes/fondo1.jpg");
}

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuRegistrarCita = new javax.swing.JMenu();
        subMenuRegistrar = new javax.swing.JMenuItem();
        subMenuModificarCita = new javax.swing.JMenuItem();
        menuPsicologo = new javax.swing.JMenu();
        subMenuAgregarPsicologo = new javax.swing.JMenuItem();
        subMenuAsignarHorario = new javax.swing.JMenuItem();
        menuPaciente = new javax.swing.JMenu();
        subMenuAgregarPaciente = new javax.swing.JMenuItem();
        menuTipoDeCita = new javax.swing.JMenu();
        subMenuAgregarTipoDeCita = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:. CONSULTORIO PSICOLOGICO");
        setResizable(false);

        label1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg"))); // NOI18N
        label1.setMaximumSize(new java.awt.Dimension(800, 600));
        label1.setPreferredSize(new java.awt.Dimension(800, 600));

        menuRegistrarCita.setText("GESTIONAR CITAS");

        subMenuRegistrar.setText("REGISTRAR CITA");
        subMenuRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRegistrarActionPerformed(evt);
            }
        });
        menuRegistrarCita.add(subMenuRegistrar);

        subMenuModificarCita.setText("VISUALIZAR CITAS");
        subMenuModificarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuModificarCitaActionPerformed(evt);
            }
        });
        menuRegistrarCita.add(subMenuModificarCita);

        jMenuBar1.add(menuRegistrarCita);

        menuPsicologo.setText("GESTIONAR PSICOLOGO");

        subMenuAgregarPsicologo.setText("AGREGAR PSICOLOGO");
        subMenuAgregarPsicologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAgregarPsicologoActionPerformed(evt);
            }
        });
        menuPsicologo.add(subMenuAgregarPsicologo);

        subMenuAsignarHorario.setText("ASIGNAR HORARIO");
        subMenuAsignarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAsignarHorarioActionPerformed(evt);
            }
        });
        menuPsicologo.add(subMenuAsignarHorario);

        jMenuBar1.add(menuPsicologo);

        menuPaciente.setText("GESTIONAR PACIENTE");

        subMenuAgregarPaciente.setText("AGREGAR PACIENTE");
        subMenuAgregarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAgregarPacienteActionPerformed(evt);
            }
        });
        menuPaciente.add(subMenuAgregarPaciente);

        jMenuBar1.add(menuPaciente);

        menuTipoDeCita.setText("MANTENIMIENTO");

        subMenuAgregarTipoDeCita.setText("AGREGAR TIPO DE CITA");
        subMenuAgregarTipoDeCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAgregarTipoDeCitaActionPerformed(evt);
            }
        });
        menuTipoDeCita.add(subMenuAgregarTipoDeCita);

        jMenuBar1.add(menuTipoDeCita);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRegistrarActionPerformed

        jdRegistrarCitas dialog = new jdRegistrarCitas(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_subMenuRegistrarActionPerformed

    private void subMenuAgregarPsicologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAgregarPsicologoActionPerformed
        jdRegistrarPsicologo dialog = new jdRegistrarPsicologo(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_subMenuAgregarPsicologoActionPerformed

    private void subMenuAgregarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAgregarPacienteActionPerformed
        jdRegistrarPaciente dialog = new jdRegistrarPaciente(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_subMenuAgregarPacienteActionPerformed

    private void subMenuAgregarTipoDeCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAgregarTipoDeCitaActionPerformed
        jdRegistrarTipoDeCita dialog = new jdRegistrarTipoDeCita(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_subMenuAgregarTipoDeCitaActionPerformed

    private void subMenuAsignarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAsignarHorarioActionPerformed
        jdHorarioPsicologo dialog = new jdHorarioPsicologo(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_subMenuAsignarHorarioActionPerformed

    private void subMenuModificarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuModificarCitaActionPerformed
        jdVisualizarCitas dialog = new jdVisualizarCitas(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_subMenuModificarCitaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }
    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel label1;
    private javax.swing.JMenu menuPaciente;
    private javax.swing.JMenu menuPsicologo;
    private javax.swing.JMenu menuRegistrarCita;
    private javax.swing.JMenu menuTipoDeCita;
    private javax.swing.JMenuItem subMenuAgregarPaciente;
    private javax.swing.JMenuItem subMenuAgregarPsicologo;
    private javax.swing.JMenuItem subMenuAgregarTipoDeCita;
    private javax.swing.JMenuItem subMenuAsignarHorario;
    private javax.swing.JMenuItem subMenuModificarCita;
    private javax.swing.JMenuItem subMenuRegistrar;
    // End of variables declaration//GEN-END:variables
}
