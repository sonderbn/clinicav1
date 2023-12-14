package capa.presentacion;

import capa.aplicacion.ServicioRegistrarPaciente;
import capa.dominio.Paciente;

/**
 *
 * @author TECNOPATA
 */

public class jdRegistrarPaciente extends javax.swing.JDialog {

    public jdRegistrarPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombrePaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidosPaciente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDniPaciente = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFechaNacimientoPaciente = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefonoPaciente = new javax.swing.JFormattedTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".:. CONSULTORIO PSICOLOGICO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel3.setText("NOMBRES:");

        txtNombrePaciente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombrePaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombrePaciente.setToolTipText("Campo Obligatorio");

        jLabel4.setText("APELLIDOS:");

        txtApellidosPaciente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtApellidosPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidosPaciente.setToolTipText("Campo Obligatorio");

        jLabel5.setText("N° DE DNI:");

        try {
            txtDniPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDniPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDniPaciente.setToolTipText("Campo Obligatorio");
        txtDniPaciente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDniPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniPacienteActionPerformed(evt);
            }
        });

        jLabel6.setText("FECHA NACIMIENTO:");

        try {
            txtFechaNacimientoPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFechaNacimientoPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaNacimientoPaciente.setToolTipText("Campo Obligatorio (dd/MM/YYYY)");
        txtFechaNacimientoPaciente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel7.setText("TELEFONO:");

        try {
            txtTelefonoPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefonoPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefonoPaciente.setToolTipText("Campo Obligatorio");
        txtTelefonoPaciente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTelefonoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoPacienteActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(241, 133, 183));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(241, 133, 183));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(143, 102, 168));

        jLabel2.setBackground(java.awt.SystemColor.controlLtHighlight);
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRAR PACIENTE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidosPaciente)
                            .addComponent(txtNombrePaciente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDniPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaNacimientoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(247, 247, 247))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDniPaciente))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFechaNacimientoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        txtNombrePaciente.getAccessibleContext().setAccessibleDescription("");
        txtApellidosPaciente.getAccessibleContext().setAccessibleDescription("");
        txtDniPaciente.getAccessibleContext().setAccessibleDescription("");
        txtFechaNacimientoPaciente.getAccessibleContext().setAccessibleDescription("");
        txtTelefonoPaciente.getAccessibleContext().setAccessibleDescription("");
        btnGuardar.getAccessibleContext().setAccessibleDescription("");
        btnCancelar.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int registrosIngresados;
        Paciente paciente = new Paciente();
        paciente.setNombre(txtNombrePaciente.getText().toUpperCase().trim());
        paciente.setApellido(txtApellidosPaciente.getText().toUpperCase().trim());
        paciente.setDni(txtDniPaciente.getText().trim());
        paciente.setFechaDeNacimiento(txtFechaNacimientoPaciente.getText());
        paciente.setTelefono(txtTelefonoPaciente.getText().trim());

        try {

            ServicioRegistrarPaciente servicioRegistrarPaciente = new ServicioRegistrarPaciente();
            registrosIngresados = servicioRegistrarPaciente.agregarPaciente(paciente);
            if (registrosIngresados == 1) {
                Mensajes.mostrarAfirmacionDeCreacion(this);
                limpiar();
            } else
            Mensajes.mostrarAdvertenciaDeCreacion(this);
        } catch (Exception e) {
            Mensajes.mostrarError(this, e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtTelefonoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoPacienteActionPerformed

    private void txtDniPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniPacienteActionPerformed

    // metodo limpiar campos despues de guardar el paciente
    void limpiar() {        
        txtNombrePaciente.setText("");
        txtApellidosPaciente.setText("");
        txtDniPaciente.setText("");      
        txtFechaNacimientoPaciente.setText("");
        txtTelefonoPaciente.setText("");
        txtNombrePaciente.requestFocus();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdRegistrarPaciente dialog = new jdRegistrarPaciente(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtApellidosPaciente;
    private javax.swing.JFormattedTextField txtDniPaciente;
    private javax.swing.JFormattedTextField txtFechaNacimientoPaciente;
    private javax.swing.JTextField txtNombrePaciente;
    private javax.swing.JFormattedTextField txtTelefonoPaciente;
    // End of variables declaration//GEN-END:variables
}
