/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaaer;

import DAO.EmpleadoDao;
import Modelo.InnerPersonaEmpleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Walter
 */
public class formEliminarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form formEliminarEmpleado
     */
    private final EmpleadoDao empdao = new EmpleadoDao();
    private DefaultTableModel tblModeloEmpleado;
    private final InnerPersonaEmpleado innEmpMod = new InnerPersonaEmpleado();

    public formEliminarUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDeBusqueda = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtTituloEliminarCliente = new javax.swing.JLabel();
        btnEliminarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        lblUsuario = new javax.swing.JLabel();
        lblIdUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btgIdUsuario = new javax.swing.JRadioButton();
        btgNombreEmpleado = new javax.swing.JRadioButton();
        btnBuscarUsuario = new javax.swing.JButton();
        txtIdUsuario = new principal.MaterialTextField();
        txtUsuario = new principal.MaterialTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtTituloEliminarCliente.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        txtTituloEliminarCliente.setText("Eliminar Usuario");

        btnEliminarUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnEliminarUsuario.setText("Eliminar");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        tblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
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
        tblUsuario.setGridColor(new java.awt.Color(255, 255, 255));
        tblUsuario.setRowHeight(25);
        tblUsuario.setSelectionBackground(new java.awt.Color(255, 153, 51));
        jScrollPane1.setViewportView(tblUsuario);

        lblUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblIdUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblIdUsuario.setText("ID:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione el metodo de busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 0, 11))); // NOI18N

        btgIdUsuario.setBackground(new java.awt.Color(255, 255, 255));
        grupoDeBusqueda.add(btgIdUsuario);
        btgIdUsuario.setText("ID Usuario");
        btgIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgIdUsuarioActionPerformed(evt);
            }
        });

        btgNombreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        grupoDeBusqueda.add(btgNombreEmpleado);
        btgNombreEmpleado.setText("Usuario");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btgNombreEmpleado)
                    .addComponent(btgIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btgIdUsuario)
                .addGap(18, 18, 18)
                .addComponent(btgNombreEmpleado)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        btnBuscarUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnBuscarUsuario.setText("Buscar");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTituloEliminarCliente)
                        .addGap(288, 288, 288))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtTituloEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed

       

        int id = Integer.parseInt(tblModeloEmpleado.getValueAt(tblUsuario.getSelectedRow(), 0).toString());
        innEmpMod.setIdEmpleado(id);
        int res = JOptionPane.showConfirmDialog(this, "Confirme para eliminar a la empleado", "Confirmacion", JOptionPane.YES_NO_OPTION);
        try {
            if (res == 0) {
                empdao.eliminarEmpleado(innEmpMod);
                tblModeloEmpleado.removeRow(tblUsuario.getSelectedRow());
                txtIdUsuario.setText(null);
                txtUsuario.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el empleado");
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btgIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btgIdUsuarioActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed

        //el modelo de la tabla se le asigna el balor de la tabla en la vista
        tblModeloEmpleado = (DefaultTableModel) tblUsuario.getModel();
        //numero de columnas que tendra la tabla
        Object[] column = new Object[tblModeloEmpleado.getColumnCount()];
        //array que recibira los valores del array del DAO
        ArrayList<InnerPersonaEmpleado> lstModEmpleado;

        if (btgIdUsuario.isSelected()) {
            int id = Integer.parseInt(txtIdUsuario.getText());
            
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
                innEmpMod.setNombreEmpleado(txtUsuario.getText());
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
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(formEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formEliminarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btgIdUsuario;
    private javax.swing.JRadioButton btgNombreEmpleado;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.ButtonGroup grupoDeBusqueda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblUsuario;
    private principal.MaterialTextField txtIdUsuario;
    private javax.swing.JLabel txtTituloEliminarCliente;
    private principal.MaterialTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}