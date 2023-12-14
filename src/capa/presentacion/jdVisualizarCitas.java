package capa.presentacion;

import capa.aplicacion.ServicioRegistrarCita;
import capa.dominio.Cita;
import javax.swing.table.DefaultTableModel;

public class jdVisualizarCitas extends javax.swing.JDialog {

    ServicioRegistrarCita servicioRegistrarCita;
    Cita cita;
    
    public jdVisualizarCitas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        servicioRegistrarCita = new ServicioRegistrarCita();      
        cita = new Cita();
        mostrarCitas();
        this.setLocationRelativeTo(null);
    }
    
    
    void mostrarCitas() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            ServicioRegistrarCita servicioRegistrarCita = new ServicioRegistrarCita();
            servicioRegistrarCita.mostrarCitas(modelo);
            jtCitas.setModel(modelo);
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCitas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".:. CONSULTORIO PSICOLOGICO");

        jLabel1.setBackground(new java.awt.Color(241, 133, 183));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VISTA DE CITAS REGISTRADAS");

        jtCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtCitas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdVisualizarCitas dialog = new jdVisualizarCitas(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCitas;
    // End of variables declaration//GEN-END:variables
}
