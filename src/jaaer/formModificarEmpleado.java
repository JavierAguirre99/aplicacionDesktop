package jaaer;

import DAO.EmpleadoDao;
import Modelo.Empleados;
import Modelo.EmpleadosMod;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class formModificarEmpleado extends javax.swing.JFrame {
    DefaultTableModel modeloTabla;
    List<EmpleadosMod> lstEmpleado = new ArrayList();
    public formModificarEmpleado() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        txtDpi = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Sueldo:");

        jLabel7.setText("Puesto:");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtDpi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(btnModificar)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Puesto", "Sueldo"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Modificar Empleados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        try {
            EmpleadoDao prueba = new EmpleadoDao();
            Empleados empleado = new Empleados();

            empleado.setId(id);
            persona.setNombre(txtNombre.getText());
            persona.setApellido(txtApellido.getText());
            persona.setDireccion(txtDireccion.getText());
            persona.setDpi(Integer.parseInt(txtDpi.getText()));
            persona.setNit(Integer.parseInt(txtNit.getText()));

            int anio2 = txtFecha.getCalendar().get(Calendar.YEAR);
            int mes2 = txtFecha.getCalendar().get(Calendar.MARCH);
            int dia2 = txtFecha.getCalendar().get(Calendar.DAY_OF_MONTH);

            String fechaPersona = anio2 + "-" + mes2 + "-" + dia2;
            persona.setFecha_nac(fechaPersona);
            persona.setTel_movil(Integer.parseInt(txtMovil.getText()));
            persona.setTel_casa(Integer.parseInt(txtCasa.getText()));

            prueba.modificarPersona(persona);
            llenar();
        } catch (Exception ex) {
            System.out.println("Error en el Bean Al intentar Modificar Persona "+ex);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        id = Integer.parseInt(modeloTabla.getValueAt(jTable1.getSelectedRow(), 0).toString());
        nombre = modeloTabla.getValueAt(jTable1.getSelectedRow(), 1).toString();
        apellido = modeloTabla.getValueAt(jTable1.getSelectedRow(), 2).toString();
        direccion = modeloTabla.getValueAt(jTable1.getSelectedRow(), 3).toString();
        nit = Integer.parseInt(modeloTabla.getValueAt(jTable1.getSelectedRow(), 4).toString());
        dpi = Integer.parseInt(modeloTabla.getValueAt(jTable1.getSelectedRow(), 5).toString());
        fecha = modeloTabla.getValueAt(jTable1.getSelectedRow(), 6).toString();
        movil = modeloTabla.getValueAt(jTable1.getSelectedRow(), 7).toString();
        casa = modeloTabla.getValueAt(jTable1.getSelectedRow(), 8).toString();

        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
        txtDireccion.setText(direccion);
        txtNit.setText(String.valueOf(nit));
        txtDpi.setText(String.valueOf(dpi));
        txtMovil.setText(movil);
        txtCasa.setText(casa);
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formModificarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formModificarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formModificarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formModificarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formModificarEmpleado().setVisible(true);
            }
        });
    }
    
    private void llenar() {
        try {
            modeloTabla = (DefaultTableModel) jTable1.getModel();

            //se crea un objeto array con la cantidad de columnas del modelo
            Object[] columna = new Object[modeloTabla.getColumnCount()];

            EmpleadoDao DAO = new EmpleadoDao();
            //array que recibira los datos contenidos en el array de la clase

            int tamanio = modeloTabla.getRowCount();

            if (modeloTabla.getRowCount() != 0) {
                for (int i = 0; i < tamanio; i++) {

                    modeloTabla.removeRow(0);
                }

            }
            lstEmpleado = DAO.listarNoEmpleado();

            int tamano = lstPersona.size();

            for (int i = 0; i < tamano; i++) {

                columna[0] = lstPersona.get(i).getId();

                columna[1] = lstPersona.get(i).getNombre();

                columna[2] = lstPersona.get(i).getApellido();

                columna[3] = lstPersona.get(i).getDireccion();

                columna[4] = lstPersona.get(i).getNit();

                columna[5] = lstPersona.get(i).getDpi();

                columna[6] = lstPersona.get(i).getFecha_nac();

                columna[7] = lstPersona.get(i).getTel_movil();

                columna[8] = lstPersona.get(i).getTel_casa();

                modeloTabla.addRow(columna);
            }

        } catch (Exception ex) {
            System.out.println("Error al intentar Listar bean personas" + ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDpi;
    private javax.swing.JTextField txtNit;
    // End of variables declaration//GEN-END:variables
}
