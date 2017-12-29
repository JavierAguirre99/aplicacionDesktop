/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaaer;

import DAO.EmpleadoDao;
import Modelo.Empleados;
import Modelo.InnerPersonaEmpleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formEliminarEmpleado extends javax.swing.JFrame {

    private final EmpleadoDao empdao = new EmpleadoDao();
    private DefaultTableModel tblModeloEmpleado;
    private final InnerPersonaEmpleado innEmpMod = new InnerPersonaEmpleado();

    public formEliminarEmpleado() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDeBusqueda = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtTituloEliminarCliente = new javax.swing.JLabel();
        btnEliminarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        lblNombreCliente = new javax.swing.JLabel();
        lblIdCliente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btgIdEmpleado = new javax.swing.JRadioButton();
        btgNombreEmpleado = new javax.swing.JRadioButton();
        btnBuscarCliente = new javax.swing.JButton();
        txtEmpleado = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTituloEliminarCliente.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        txtTituloEliminarCliente.setText("Eliminar Empleado");
        jPanel1.add(txtTituloEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 29, -1, 55));

        btnEliminarCliente.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 318, 111, 45));

        tblEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Empeado", "DPI", "Empleado", "Puesto", "Sueldo", "Direccion", "Nit", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpleado.setGridColor(new java.awt.Color(255, 255, 255));
        tblEmpleado.setRowHeight(25);
        tblEmpleado.setSelectionBackground(new java.awt.Color(255, 153, 51));
        jScrollPane1.setViewportView(tblEmpleado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 411, 771, 339));

        lblNombreCliente.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblNombreCliente.setText("Empleado:");
        jPanel1.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 80, 40));

        lblIdCliente.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblIdCliente.setText("ID:");
        jPanel1.add(lblIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 134, 66, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione el metodo de busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 0, 11))); // NOI18N

        btgIdEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        grupoDeBusqueda.add(btgIdEmpleado);
        btgIdEmpleado.setText("ID Empleado");
        btgIdEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgIdEmpleadoActionPerformed(evt);
            }
        });

        btgNombreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        grupoDeBusqueda.add(btgNombreEmpleado);
        btgNombreEmpleado.setText("Empleado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btgNombreEmpleado)
                    .addComponent(btgIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btgIdEmpleado)
                .addGap(18, 18, 18)
                .addComponent(btgNombreEmpleado)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 122, -1, -1));

        btnBuscarCliente.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 318, 111, 45));
        jPanel1.add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 229, 44));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 229, 44));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 770, -1));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
     
        int id = Integer.parseInt(tblModeloEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 0).toString());
        innEmpMod.setIdEmpleado(id);
        int res = JOptionPane.showConfirmDialog(this, "Confirme para eliminar a la empleado", "Confirmacion", JOptionPane.YES_NO_OPTION);
        try {
            if (res == 0) {
                empdao.eliminarEmpleado(innEmpMod);
                tblModeloEmpleado.removeRow(tblEmpleado.getSelectedRow());
                txtEmpleado.setText(null);
                txtEmpleado.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el empleado");
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btgIdEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgIdEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btgIdEmpleadoActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed

        //el modelo de la tabla se le asigna el balor de la tabla en la vista
        tblModeloEmpleado = (DefaultTableModel) tblEmpleado.getModel();
        //numero de columnas que tendra la tabla
        Object[] column = new Object[tblModeloEmpleado.getColumnCount()];
        //array que recibira los valores del array del DAO
        ArrayList<InnerPersonaEmpleado> lstModEmpleado;

        if (btgIdEmpleado.isSelected()) {
            int id = Integer.parseInt(txtEmpleado.getText());
            
            innEmpMod.setIdEmpleado(id);
            try {

                lstModEmpleado = empdao.listarPorId(innEmpMod);

                if (tblModeloEmpleado.getRowCount() != 0) {

                    for (int i = 0; i < tblModeloEmpleado.getRowCount(); i++) {
                        tblModeloEmpleado.removeRow(0);
                    }
                }
                
                int tamano = lstModEmpleado.size();
                System.out.println("id: "+tamano);
                //                tblDatoPersona.removeAll();
                for (int i = 0; i < tamano; i++) {
                    column[0] = lstModEmpleado.get(i).getIdEmpleado();
                    column[1] = lstModEmpleado.get(i).getDpiEmpleado();
                    column[2] = lstModEmpleado.get(i).getNombreEmpleado();
                    column[3] = lstModEmpleado.get(i).getPuesto();
                    column[4] = lstModEmpleado.get(i).getDireccion();
                    column[5] = lstModEmpleado.get(i).getNit();
                    column[6] = lstModEmpleado.get(i).getTelefono();
                    column[7] = lstModEmpleado.get(i).getSueldo();
                    tblModeloEmpleado.addRow(column);

                }
            } catch (Exception e) {
                System.err.println("error: " + e);
            }

        }
        if (btgNombreEmpleado.isSelected()) {
//            lstModEmpleado = null;
            try {
                innEmpMod.setNombreEmpleado(txtEmpleado.getText());
                lstModEmpleado = empdao.listarPorNombre(innEmpMod);

//                int valor = tblModeloEmpleado.getRowCount();
                
                if (tblModeloEmpleado.getRowCount() != 0) {

                    for (int i = 0; i < tblModeloEmpleado.getRowCount(); i++) {
                        tblModeloEmpleado.removeRow(0);
                    }
                }
                System.out.println("hola");
                for (int i = 0; i < lstModEmpleado.size(); i++) {
                    column[0] = lstModEmpleado.get(i).getIdEmpleado();
                    column[1] = lstModEmpleado.get(i).getDpiEmpleado();
                    column[2] = lstModEmpleado.get(i).getNombreEmpleado();
                    column[3] = lstModEmpleado.get(i).getPuesto();
                    column[4] = lstModEmpleado.get(i).getDireccion();
                    column[5] = lstModEmpleado.get(i).getNit();
                    column[6] = lstModEmpleado.get(i).getTelefono();
                    column[7] = lstModEmpleado.get(i).getSueldo();
                    tblModeloEmpleado.addRow(column);

                }
            } catch (Exception e) {
                System.out.println("error: " + e);
            }
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(formEliminarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formEliminarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formEliminarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formEliminarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formEliminarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btgIdEmpleado;
    private javax.swing.JRadioButton btgNombreEmpleado;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.ButtonGroup grupoDeBusqueda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JLabel txtTituloEliminarCliente;
    // End of variables declaration//GEN-END:variables

}
