package capa.presentacion;

import capa.dominio.Psicologo;
import capa.aplicacion.ServicioRegistrarHorarioPsicologo;
import capa.dominio.HorarioPsicologo;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.JOptionPane;




public class jdHorarioPsicologo extends javax.swing.JDialog {

    private ServicioRegistrarHorarioPsicologo servicioRegistrarHorarioPsicologo;
    private HorarioPsicologo horarioPsicologo;

    public jdHorarioPsicologo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        servicioRegistrarHorarioPsicologo = new ServicioRegistrarHorarioPsicologo();
        horarioPsicologo = new HorarioPsicologo();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNombrePsicologo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnBuscarPsicologo = new javax.swing.JButton();
        txtDniPsicologo = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoHorario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHoras = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtHoraEntrada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHoraSalida = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".:. CONSULTORIO PSICOLOGICO");
        setBackground(new java.awt.Color(0, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 255)), "DATOS DEL PSICOLOGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 255, 255));

        txtNombrePsicologo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombrePsicologo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombrePsicologo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombrePsicologo.setEnabled(false);

        jLabel2.setText("PSICOLOGO:");

        jLabel17.setText("DNI PSICOLOGO:");

        btnBuscarPsicologo.setText("BUSCAR");
        btnBuscarPsicologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPsicologoActionPerformed(evt);
            }
        });

        try {
            txtDniPsicologo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDniPsicologo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDniPsicologo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDniPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombrePsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(btnBuscarPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDniPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombrePsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jLabel3.setText("CODIGO:");

        txtCodigoHorario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCodigoHorario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoHorario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCodigoHorario.setEnabled(false);

        jButton1.setText("GENERAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("FECHA DE ATENCION:");

        jtHoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"8:00", "8:59"},
                {"9:00", "9:59"},
                {"10:00", "10:59"},
                {"11:00", "11:59"},
                {"12:00", "12:59"},
                {"13:00", "13:59"},
                {"14:00", "14:59"},
                {"15:00", "15:59"},
                {"16:00", "16:00"},
                {"17:00", "17:59"},
                {"18:00", "18:59"},
                {"19:00", "19:59"},
                {"20:00", "20:59"},
                {"21:00", "21:59"}
            },
            new String [] {
                "HORA INICIO", "HORA TERMINO"
            }
        ));
        jtHoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtHorasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtHoras);
        if (jtHoras.getColumnModel().getColumnCount() > 0) {
            jtHoras.getColumnModel().getColumn(0).setResizable(false);
            jtHoras.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel4.setText("HORA DE ENTRADA:");

        txtHoraEntrada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtHoraEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoraEntrada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHoraEntrada.setEnabled(false);

        jLabel6.setText("HORA DE SALIDA:");

        txtHoraSalida.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtHoraSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoraSalida.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHoraSalida.setEnabled(false);

        btnGuardar.setBackground(new java.awt.Color(241, 133, 183));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(143, 102, 168));

        jLabel1.setBackground(java.awt.SystemColor.controlLtHighlight);
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR HORARIO DE ATENCIÓN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 81, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(311, 311, 311))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(txtHoraEntrada)
                                    .addComponent(txtHoraSalida)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (jtHoras.getSelectedRow() >= 0) {
            try {
                guardarHorarioPsicologo();
            } catch (Exception e) {
                Mensajes.mostrarError(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un rango de hora.", "Consultorio Psicologico: Mensaje", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed
    private void guardarHorarioPsicologo() throws Exception {
        int registrosIngresados;
        horarioPsicologo.setHoraEntrada(txtHoraEntrada.getText().trim());
        horarioPsicologo.setHoraSalida(txtHoraSalida.getText().trim());
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        horarioPsicologo.setFechaAtencion(formato.format(txtFecha.getDate()).toString());
        horarioPsicologo.setCodigoHorario(txtCodigoHorario.getText().trim().toUpperCase());

        registrosIngresados = servicioRegistrarHorarioPsicologo.agregarHorarioPsicologo(horarioPsicologo);

        if (registrosIngresados == 1) {
            Mensajes.mostrarAfirmacionDeCreacion(this);
            limpiar();
        } else {
            Mensajes.mostrarAdvertenciaDeCreacion(this);
        }
    }
    private void btnBuscarPsicologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPsicologoActionPerformed
        String dniPsicologo = txtDniPsicologo.getText().trim();
        try {
            Psicologo psicologo = servicioRegistrarHorarioPsicologo.buscarPsicologo(dniPsicologo);
            horarioPsicologo.setPsicologo(psicologo);
            txtNombrePsicologo.setText(psicologo.getNombre());
            Mensajes.mostrarAfirmacionDeBusqueda(this);
        } catch (Exception e) {
            Mensajes.mostrarErrorDeBusqueda(this);
        }
    }//GEN-LAST:event_btnBuscarPsicologoActionPerformed

    private void jtHorasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtHorasMousePressed
        int fila = jtHoras.rowAtPoint(evt.getPoint());
        if (jtHoras.getSelectedRow() >= 0) {
            txtHoraEntrada.setText(jtHoras.getValueAt(fila, 0).toString());
            txtHoraSalida.setText(jtHoras.getValueAt(fila, 1).toString());

        } else {
            JOptionPane.showMessageDialog(null, "Consultorio Psicologico: Mensaje", "Debe seleccionar un rango de hora.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtHorasMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random random = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cadena = "";
        int n= 0, pos = 0, num;
        
        while(n<1){
            pos = (int) (random.nextDouble() * letras.length()-1 + 0);
            num = (int)(random.nextDouble() * 9999 + 10000);
            cadena = cadena+letras.charAt(pos)+num;
            pos = (int) (random.nextDouble() + letras.length()-1 + 0);
            cadena = cadena+letras.charAt(pos);
            txtCodigoHorario.setText(cadena);
            System.out.println("" + (n+1) +" - " + cadena);
            cadena="";
            n++;
        } 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    void limpiar() {
        txtDniPsicologo.setText("");
        txtNombrePsicologo.setText("");
        txtHoraEntrada.setText("");
        txtHoraSalida.setText("");
    }
            
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdHorarioPsicologo dialog = new jdHorarioPsicologo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscarPsicologo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtHoras;
    private javax.swing.JTextField txtCodigoHorario;
    private javax.swing.JFormattedTextField txtDniPsicologo;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtHoraSalida;
    public static javax.swing.JTextField txtNombrePsicologo;
    // End of variables declaration//GEN-END:variables
}
