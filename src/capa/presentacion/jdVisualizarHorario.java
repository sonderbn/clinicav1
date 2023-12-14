package capa.presentacion;

import capa.aplicacion.ServicioRegistrarCita;
import capa.aplicacion.ServicioRegistrarHorarioPsicologo;
import capa.dominio.Cita;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TECNOPATA
 */
public class jdVisualizarHorario extends javax.swing.JDialog {

    ServicioRegistrarCita servicioRegistrarCita;
    Cita cita;
    ServicioRegistrarHorarioPsicologo servicioRegistrarHorarioPsicologo;

    public jdVisualizarHorario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        servicioRegistrarCita = new ServicioRegistrarCita();
        cita = new Cita();
        servicioRegistrarHorarioPsicologo = new ServicioRegistrarHorarioPsicologo();
        mostrarHorarios();
    }

    void mostrarHorarios() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            ServicioRegistrarCita servicioCita = new ServicioRegistrarCita();
            servicioCita.mostrarHorario(modelo);
            jtHorarioDelDia.setModel(modelo);
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    void buscarPorNombre(String nombre) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            ServicioRegistrarHorarioPsicologo servicioHorarioPsicologo = new ServicioRegistrarHorarioPsicologo();
            servicioHorarioPsicologo.buscarPsicologoEnHorario(modelo, nombre);
            jtHorarioDelDia.setModel(modelo);
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    void buscarPorEspecialidad(String especialidad) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            ServicioRegistrarHorarioPsicologo servicioHorarioPsicologo = new ServicioRegistrarHorarioPsicologo();
            servicioHorarioPsicologo.buscarEspecialidadPsicologoEnHorario(modelo, especialidad);
            jtHorarioDelDia.setModel(modelo);
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    void buscarPorFecha(String fecha) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            ServicioRegistrarHorarioPsicologo servicioHorarioPsicologo = new ServicioRegistrarHorarioPsicologo();
            servicioHorarioPsicologo.buscarFechaEnHorario(modelo, fecha);
            jtHorarioDelDia.setModel(modelo);
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgBuscador = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHorarioDelDia = new javax.swing.JTable();
        txtNombrePsicologo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rbEspecialidad = new javax.swing.JRadioButton();
        rbPsicologo = new javax.swing.JRadioButton();
        rbFecha = new javax.swing.JRadioButton();
        txtEspecialidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".:. CONSULTORIO PSICOLOGICO");

        jtHorarioDelDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtHorarioDelDia);

        txtNombrePsicologo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombrePsicologo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombrePsicologo.setEnabled(false);
        txtNombrePsicologo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombrePsicologoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePsicologoKeyTyped(evt);
            }
        });

        jLabel1.setText("PSICOLOGO:");

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2), "  BUSCAR POR:  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        btgBuscador.add(rbEspecialidad);
        rbEspecialidad.setText("ESPECIALIDAD");
        rbEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEspecialidadActionPerformed(evt);
            }
        });

        btgBuscador.add(rbPsicologo);
        rbPsicologo.setText("NOMBRE PSICOLOGO");
        rbPsicologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPsicologoActionPerformed(evt);
            }
        });

        btgBuscador.add(rbFecha);
        rbFecha.setText("FECHA DE ATENCION");
        rbFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbPsicologo)
                .addGap(18, 18, 18)
                .addComponent(rbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbFecha)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEspecialidad)
                    .addComponent(rbPsicologo)
                    .addComponent(rbFecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtEspecialidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEspecialidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidad.setEnabled(false);
        txtEspecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEspecialidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEspecialidadKeyTyped(evt);
            }
        });

        jLabel2.setText("ESPECIALIDAD:");

        jLabel3.setText("FECHA:");

        try {
            txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setEnabled(false);
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombrePsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(242, 242, 242))
                            .addComponent(btnSeleccionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombrePsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        jTabbedPane1.addTab("HORARIO DEL DIA", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        if (jtHorarioDelDia.getSelectedRow() >= 0) {
            try {
                DefaultTableModel modelo = (DefaultTableModel) jtHorarioDelDia.getModel();
                String idhorario, fechaCita, horaEntrada, horaTermino, nombrePsicologo, especialidadPsicologo;
                idhorario = String.valueOf(modelo.getValueAt(jtHorarioDelDia.getSelectedRow(), 0).toString());
                fechaCita = String.valueOf(modelo.getValueAt(jtHorarioDelDia.getSelectedRow(), 1).toString());
                nombrePsicologo = String.valueOf(modelo.getValueAt(jtHorarioDelDia.getSelectedRow(), 2).toString());
                especialidadPsicologo = String.valueOf(modelo.getValueAt(jtHorarioDelDia.getSelectedRow(), 3).toString());
                horaEntrada = String.valueOf(modelo.getValueAt(jtHorarioDelDia.getSelectedRow(), 4).toString());
                horaTermino = String.valueOf(modelo.getValueAt(jtHorarioDelDia.getSelectedRow(), 5).toString());
                jdRegistrarCitas.txtCodigoHorario.setText(idhorario);
                jdRegistrarCitas.txtFechaCita.setText(fechaCita);
                jdRegistrarCitas.txtHoraDeEntrada.setText(horaEntrada);
                jdRegistrarCitas.txtHoraTermino.setText(horaTermino);
                jdRegistrarCitas.txtNombrePsicologo.setText(nombrePsicologo);
                jdRegistrarCitas.txtEspecialidadPsicologo.setText(especialidadPsicologo);
                dispose();

            } catch (Exception e) {
                throw e;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un horario.", "Consultorio Psicologico: Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void rbEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEspecialidadActionPerformed
        txtNombrePsicologo.setText("");
        txtFecha.setText("");
        txtNombrePsicologo.setEnabled(false);
        txtFecha.setEnabled(false);
        txtEspecialidad.setEnabled(true);
        txtEspecialidad.requestFocus();
    }//GEN-LAST:event_rbEspecialidadActionPerformed

    private void rbPsicologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPsicologoActionPerformed
        txtEspecialidad.setText("");
        txtFecha.setText("");
        txtNombrePsicologo.setEnabled(true);
        txtFecha.setEnabled(false);
        txtEspecialidad.setEnabled(false);
        txtNombrePsicologo.requestFocus();
    }//GEN-LAST:event_rbPsicologoActionPerformed

    private void txtNombrePsicologoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePsicologoKeyReleased
        buscarPorNombre(txtNombrePsicologo.getText());
    }//GEN-LAST:event_txtNombrePsicologoKeyReleased

    private void txtNombrePsicologoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePsicologoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cadena = ("" + c).toUpperCase();
            c = cadena.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtNombrePsicologoKeyTyped

    private void txtEspecialidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEspecialidadKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cadena = ("" + c).toUpperCase();
            c = cadena.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtEspecialidadKeyTyped

    private void txtEspecialidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEspecialidadKeyReleased
        buscarPorEspecialidad(txtEspecialidad.getText());
    }//GEN-LAST:event_txtEspecialidadKeyReleased

    private void rbFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFechaActionPerformed
        txtNombrePsicologo.setText("");
        txtEspecialidad.setText("");
        txtNombrePsicologo.setEnabled(false);
        txtEspecialidad.setEnabled(false);
        txtFecha.setEnabled(true);
        txtFecha.requestFocus();
    }//GEN-LAST:event_rbFechaActionPerformed

    private void txtFechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyReleased
        buscarPorFecha(txtFecha.getText());
    }//GEN-LAST:event_txtFechaKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdVisualizarHorario dialog = new jdVisualizarHorario(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup btgBuscador;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtHorarioDelDia;
    private javax.swing.JRadioButton rbEspecialidad;
    private javax.swing.JRadioButton rbFecha;
    private javax.swing.JRadioButton rbPsicologo;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtNombrePsicologo;
    // End of variables declaration//GEN-END:variables
}
