package capa.presentacion;

import capa.aplicacion.ServicioRegistrarCita;
import capa.dominio.Cita;
import capa.dominio.HorarioPsicologo;
import capa.dominio.Paciente;
import capa.dominio.TipoDeCita;
import javax.swing.JOptionPane;


public class jdRegistrarCitas extends javax.swing.JDialog {

    private HorarioPsicologo horarioPsicologo;
    private Cita cita;
    private ServicioRegistrarCita servicioRegistrarCita;

    public jdRegistrarCitas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        servicioRegistrarCita = new ServicioRegistrarCita();
        cita = new Cita();
        horarioPsicologo = new HorarioPsicologo();
        txtTarifaCita.setEnabled(false);
        txtTotalPago.setEnabled(false);                
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDniPaciente = new javax.swing.JTextField();
        btnBuscarPaciente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtNombrePaciente = new javax.swing.JTextField();
        txtApellidosPaciente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtDescuentoCita = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotalPago = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVerHorarios = new javax.swing.JButton();
        txtFechaCita = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtHoraTermino = new javax.swing.JTextField();
        txtHoraDeEntrada = new javax.swing.JTextField();
        txtCodigoHorario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTarifaCita = new javax.swing.JTextField();
        txtDuracionCita = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTipoDeCita = new javax.swing.JTextField();
        btnBuscarTipoDeCita = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNombrePsicologo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEspecialidadPsicologo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".:. CONSULTORIO PSICOLOGICO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 255)), "DATOS DEL PACIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N

        jLabel1.setText("DNI:");

        txtDniPaciente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDniPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDniPaciente.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        btnBuscarPaciente.setText("BUSCAR");
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });

        jLabel13.setText("PACIENTE:");

        txtNombrePaciente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombrePaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombrePaciente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombrePaciente.setEnabled(false);

        txtApellidosPaciente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtApellidosPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidosPaciente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtApellidosPaciente.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDniPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombrePaciente)
                    .addComponent(txtApellidosPaciente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDniPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 170));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 255)), "DATOS DE LA CITA ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N

        jLabel7.setText("DESCUENTO:");

        txtDescuentoCita.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDescuentoCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescuentoCita.setText("0");

        jLabel9.setText("TOTAL:");

        txtTotalPago.setBackground(new java.awt.Color(255, 255, 51));
        txtTotalPago.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTotalPago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalPago.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel11.setText("INICIO:");

        jLabel4.setText("FECHA:");

        btnVerHorarios.setText("VER HORARIOS");
        btnVerHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHorariosActionPerformed(evt);
            }
        });

        txtFechaCita.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtFechaCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaCita.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFechaCita.setEnabled(false);

        jLabel8.setText("TERMINO:");

        txtHoraTermino.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtHoraTermino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoraTermino.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHoraTermino.setEnabled(false);

        txtHoraDeEntrada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtHoraDeEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoraDeEntrada.setToolTipText("");
        txtHoraDeEntrada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHoraDeEntrada.setEnabled(false);

        txtCodigoHorario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCodigoHorario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoHorario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCodigoHorario.setEnabled(false);

        jLabel10.setText("CODIGO:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtCodigoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnVerHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtHoraDeEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescuentoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHoraTermino, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(txtTotalPago)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addComponent(txtFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnVerHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaCita)
                    .addComponent(txtCodigoHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraDeEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(txtHoraTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDescuentoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(9, 9, 9)
                .addComponent(btnCalcular)
                .addContainerGap())
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 450, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)), "DATOS DEL TIPO DE CITA ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N

        jLabel5.setText("TIPO DE CITA:");

        jLabel6.setText("TARIFA:");

        txtTarifaCita.setBackground(new java.awt.Color(255, 255, 51));
        txtTarifaCita.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTarifaCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTarifaCita.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtDuracionCita.setBackground(new java.awt.Color(255, 255, 51));
        txtDuracionCita.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDuracionCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDuracionCita.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel12.setText("DURACIÓN:");

        txtTipoDeCita.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTipoDeCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipoDeCita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoDeCitaKeyTyped(evt);
            }
        });

        btnBuscarTipoDeCita.setText("BUSCAR");
        btnBuscarTipoDeCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTipoDeCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTipoDeCita, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarTipoDeCita))
                    .addComponent(txtDuracionCita, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTarifaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTipoDeCita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarTipoDeCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTarifaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuracionCita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 370, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)), "DATOS DEL PSICOLOGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N

        txtNombrePsicologo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombrePsicologo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombrePsicologo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombrePsicologo.setEnabled(false);

        jLabel2.setText("PSICOLOGO:");

        jLabel17.setText("ESPECIALIDAD");

        txtEspecialidadPsicologo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEspecialidadPsicologo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspecialidadPsicologo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtEspecialidadPsicologo.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEspecialidadPsicologo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(txtNombrePsicologo))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombrePsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecialidadPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap())
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 430, -1));

        btnGuardar.setBackground(new java.awt.Color(241, 133, 183));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel5.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 370, 35));

        jPanel6.setBackground(new java.awt.Color(143, 102, 168));

        jLabel14.setBackground(java.awt.SystemColor.controlLtHighlight);
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("REGISTRAR CITA");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 830, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        String dniPaciente = txtDniPaciente.getText().trim().toUpperCase();
        try {
            Paciente paciente = servicioRegistrarCita.buscarPaciente(dniPaciente);
            cita.setPaciente(paciente);
            txtNombrePaciente.setText(paciente.getNombre());
            txtApellidosPaciente.setText(paciente.getApellido());
            Mensajes.mostrarAfirmacionDeBusqueda(this);
        } catch (Exception e) {
            Mensajes.mostrarErrorDeBusqueda(this);
        }
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        try {
            double total, tarifa, descuento;
            
            tarifa = Double.parseDouble(txtTarifaCita.getText());
            descuento = Double.parseDouble(txtDescuentoCita.getText());
            if (descuento<0 || descuento>tarifa) {
                JOptionPane.showMessageDialog(null, "Monto de descuento no válido. Vuelva a ingresarlo porfavor.","Consultorio Psicologico: Mensaje", JOptionPane.ERROR_MESSAGE);
                txtTotalPago.setText("");
            } 
            
            else {
                
                total = cita.calcularTotal(tarifa, descuento);
                txtTotalPago.setText("" + total);
            }
        } catch (Exception e) {
            Mensajes.mostrarError(this, e.getMessage());
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String total, paciente, tipodecita, horario;
        total = txtTotalPago.getText();
        paciente = txtNombrePaciente.getText();
        tipodecita = txtTarifaCita.getText();
        horario = txtCodigoHorario.getText();

        if (verificarCamposVacios(paciente, tipodecita, horario, total)) {
            int registrosIngresados;
            cita.setFechaCita(txtFechaCita.getText());
            cita.setHoraDeEntrada(txtHoraDeEntrada.getText());
            cita.setDescuento(Double.parseDouble(txtDescuentoCita.getText()));
            cita.setPagoTotal(Double.parseDouble(total));
            cita.getHorarioPsicologo();
            horarioPsicologo.setCodigoHorario(horario);

            try {
                buscarHorario();
                registrosIngresados = servicioRegistrarCita.agregarCita(cita);
                if (registrosIngresados == 1) {
                    Mensajes.mostrarAfirmacionDeCreacion(this);
                    limpiar();
                } else {
                    Mensajes.mostrarAdvertenciaDeCreacion(this);
                }
            } catch (Exception e) {
                Mensajes.mostrarError(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    private boolean verificarCamposVacios(String paciente, String tipodecita, String horario, String total) {
        if (paciente.isEmpty()) {
            mostrarMensajeError("Falta ingresar el paciente.");
            return false;
        } else if (tipodecita.isEmpty()) {
            mostrarMensajeError("Falta ingresar el tipo de cita.");
            return false;
        } else if (horario.isEmpty()) {
            mostrarMensajeError("Falta ingresar el horario de la cita.");
            return false;
        } else if (total.isEmpty()) {
            mostrarMensajeError("Falta calcular el monto total a pagar.");
            return false;
        }
        return true;
    }
    
    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Consultorio Psicologico: Mensaje", JOptionPane.ERROR_MESSAGE);
    }
    private void btnBuscarTipoDeCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTipoDeCitaActionPerformed
        String nombretipoDeCita = txtTipoDeCita.getText().trim();
        try {
            TipoDeCita tipoDeCita = servicioRegistrarCita.buscarTipoDeCita(nombretipoDeCita);
            cita.setTipoDeCita(tipoDeCita);
            txtTarifaCita.setText(String.valueOf(tipoDeCita.getTarifa()));            
            txtDuracionCita.setText(String.valueOf(tipoDeCita.getDuracion()));
            Mensajes.mostrarAfirmacionDeBusqueda(this);
        } catch (Exception e) {
            Mensajes.mostrarErrorDeBusqueda(this);
        }
    }//GEN-LAST:event_btnBuscarTipoDeCitaActionPerformed

    private void txtTipoDeCitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoDeCitaKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cadena = (""+c).toUpperCase();
            c = cadena.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtTipoDeCitaKeyTyped

    private void btnVerHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHorariosActionPerformed
        jdVisualizarHorario dialog = new jdVisualizarHorario(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnVerHorariosActionPerformed

    void limpiar(){
        txtDniPaciente.setText("");
        txtNombrePaciente.setText("");
        txtApellidosPaciente.setText("");
        txtCodigoHorario.setText("");
        txtTipoDeCita.setText("");
        txtTarifaCita.setText("");
        txtDuracionCita.setText("");
        txtNombrePsicologo.setText("");
        txtEspecialidadPsicologo.setText("");
        txtFechaCita.setText("");
        txtHoraDeEntrada.setText("");
        txtHoraTermino.setText("");
        txtDescuentoCita.setText("0");
        txtTotalPago.setText("0");
        txtDniPaciente.requestFocus();
    }        
    
    void buscarHorario(){
        String codigoHorario = String.valueOf(txtCodigoHorario.getText().trim().toUpperCase());
        try {
            HorarioPsicologo horarioPsicologo = servicioRegistrarCita.buscarHorarioPsicologo(codigoHorario);
            cita.setHorarioPsicologo(horarioPsicologo);
            txtFechaCita.setText(horarioPsicologo.getFechaAtencion());
            txtHoraDeEntrada.setText(horarioPsicologo.getHoraEntrada());
            txtHoraTermino.setText(horarioPsicologo.getHoraSalida());
          //  Mensajes.mostrarAfirmacionDeBusqueda(this);
        } catch (Exception e) {
//            Mensajes.mostrarErrorDeBusqueda(this);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdRegistrarCitas dialog = new jdRegistrarCitas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnBuscarTipoDeCita;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVerHorarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JTextField txtApellidosPaciente;
    public static javax.swing.JTextField txtCodigoHorario;
    private javax.swing.JTextField txtDescuentoCita;
    public static javax.swing.JTextField txtDniPaciente;
    private javax.swing.JTextField txtDuracionCita;
    public static javax.swing.JTextField txtEspecialidadPsicologo;
    public static javax.swing.JTextField txtFechaCita;
    public static javax.swing.JTextField txtHoraDeEntrada;
    public static javax.swing.JTextField txtHoraTermino;
    public static javax.swing.JTextField txtNombrePaciente;
    public static javax.swing.JTextField txtNombrePsicologo;
    private javax.swing.JTextField txtTarifaCita;
    private javax.swing.JTextField txtTipoDeCita;
    private javax.swing.JTextField txtTotalPago;
    // End of variables declaration//GEN-END:variables
}
