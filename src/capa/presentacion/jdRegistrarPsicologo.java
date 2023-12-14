package capa.presentacion;

import capa.aplicacion.ServicioRegistrarPsicologo;
import capa.dominio.Psicologo;
import java.awt.Toolkit;

public class jdRegistrarPsicologo extends javax.swing.JDialog {

    
    public jdRegistrarPsicologo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombrePsicologo = new javax.swing.JTextField();
        txtDniPsicologo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".:. CONSULTORIO PSICOLOGICO");

        jLabel2.setText("NOMBRE Y APELLIDOS:");

        jLabel3.setText("N° DE DNI:");

        txtNombrePsicologo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombrePsicologo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombrePsicologo.setToolTipText("Campo Obligatorio");
        txtNombrePsicologo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePsicologoKeyTyped(evt);
            }
        });

        txtDniPsicologo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDniPsicologo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDniPsicologo.setToolTipText("Campo Obligatorio");
        txtDniPsicologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniPsicologoActionPerformed(evt);
            }
        });
        txtDniPsicologo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniPsicologoKeyTyped(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(241, 133, 183));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(241, 133, 183));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel5.setText("ESPECIALIDAD:");

        txtEspecialidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEspecialidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad.setToolTipText("Campo Obligatorio");

        jPanel3.setBackground(new java.awt.Color(143, 102, 168));

        jLabel1.setBackground(java.awt.SystemColor.controlLtHighlight);
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR PSICOLOGO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombrePsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEspecialidad)
                                    .addComponent(txtDniPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombrePsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDniPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int registrosIngresados;
        Psicologo psicologo = new Psicologo();

        psicologo.setNombre(txtNombrePsicologo.getText().toUpperCase().trim());
        psicologo.setDni(txtDniPsicologo.getText().trim());
        psicologo.setEspecialidad(txtEspecialidad.getText().toUpperCase().trim());
        try {
            ServicioRegistrarPsicologo servicioRegistrarPsicologo = new ServicioRegistrarPsicologo();
            registrosIngresados = servicioRegistrarPsicologo.agregarPsicologo(psicologo);
            if (registrosIngresados == 1) {
                Mensajes.mostrarAfirmacionDeCreacion(this);
                limpiar();
            } else 
                Mensajes.mostrarAdvertenciaDeCreacion(this);            
        } catch (Exception e) {
            Mensajes.mostrarError(this, e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtDniPsicologoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniPsicologoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txtDniPsicologo.getText().length() >= 8) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtDniPsicologoKeyTyped

    private void txtNombrePsicologoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePsicologoKeyTyped
        char c = evt.getKeyChar();
        if ((c == 'A' || c == 'Z') && (c == 'a' || c == 'z') && c == Character.SPACE_SEPARATOR) {
            evt.consume();
        }
        if (txtNombrePsicologo.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtNombrePsicologoKeyTyped

    private void txtDniPsicologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniPsicologoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniPsicologoActionPerformed

    // metodo limpiar campos despues de guardar el psicologo
    void limpiar() {        
        txtNombrePsicologo.setText("");
        txtDniPsicologo.setText("");
        txtEspecialidad.setText("");       
        txtNombrePsicologo.requestFocus();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdRegistrarPsicologo dialog = new jdRegistrarPsicologo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDniPsicologo;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtNombrePsicologo;
    // End of variables declaration//GEN-END:variables
}
