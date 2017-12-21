package jaaer;

import DAO.EmpleadoDao;
import Modelo.Empleados;

import Modelo.InnerPersonaEmpleado;
import Modelo.Puesto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formModificarEmpleado extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;
    List<InnerPersonaEmpleado> lstEmpleado = new ArrayList();
    List<Puesto> lstPuesto = new ArrayList();

    int id;
    String puesto;
    double sueldo;

    public formModificarEmpleado() {
        initComponents();
        llenar();
        listarPuestos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        cbxPuesto = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("Sueldo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Puesto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));
        jPanel1.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, 40));

        btnModificar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, 40));

        cbxPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPuestoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 150, 40));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 168, 44, 23));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Direccion", "Puesto", "Sueldo"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 219, 600, 160));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel1.setText("Modificar Empleado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 600, 380));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (id != 0) {
            try {
                EmpleadoDao prueba = new EmpleadoDao();
                Empleados empleado = new Empleados();

                empleado.setId_empleado(Integer.parseInt(txtID.getText()));
                for (int i = 0; i < lstPuesto.size(); i++) {
                    if (cbxPuesto.getSelectedItem().equals(lstPuesto.get(i).getNombre())) {
                        empleado.setId_puesto(lstPuesto.get(i).getIdPuesto());
                    }
                }

                empleado.setSueldo(Double.parseDouble(txtSueldo.getText()));
                prueba.modificarEmpleado(empleado);
                id=0;
                txtSueldo.setText(null);
                llenar();
                
            } catch (Exception ex) {
                System.out.println("Error en el Bean Al intentar Modificar Persona " + ex);
            }
        }else{
            
            JOptionPane.showMessageDialog(null, "Primero Debe seleccionar un Registro ");
        }


    }//GEN-LAST:event_btnModificarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        id = Integer.parseInt(modeloTabla.getValueAt(jTable1.getSelectedRow(), 0).toString());
        System.out.println("id"+id);
        puesto = modeloTabla.getValueAt(jTable1.getSelectedRow(), 3).toString();
        sueldo = Double.parseDouble(modeloTabla.getValueAt(jTable1.getSelectedRow(), 4).toString());
        
        txtID.setText(String.valueOf(id));
        txtSueldo.setText(String.valueOf(sueldo));
        cbxPuesto.setSelectedItem(puesto);


    }//GEN-LAST:event_jTable1MouseClicked

    private void cbxPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPuestoActionPerformed

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
                if ("Windows".equals(info.getName())) {
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
            lstEmpleado = DAO.listaEmpleados();

            int tamano = lstEmpleado.size();

            for (int i = 0; i < tamano; i++) {

                columna[0] = lstEmpleado.get(i).getIdEmpleado();

                columna[1] = lstEmpleado.get(i).getNombreEmpleado();

                columna[2] = lstEmpleado.get(i).getDireccion();

                columna[3] = lstEmpleado.get(i).getPuesto();

                columna[4] = lstEmpleado.get(i).getSueldo();

                modeloTabla.addRow(columna);
            }

        } catch (Exception ex) {
            System.out.println("Error al intentar Listar bean personas" + ex);
        }
    }

    public void listarPuestos() {

        EmpleadoDao prueba = new EmpleadoDao();
        lstPuesto = prueba.listarPuesto();
        for (int i = 0; i < lstPuesto.size(); i++) {
            cbxPuesto.addItem(lstPuesto.get(i).getNombre());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
