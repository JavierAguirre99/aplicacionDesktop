package jaaer;

import DAO.EmpleadoDao;
import Modelo.InnerPersonaEmpleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formEliminarUsuario extends javax.swing.JFrame {

    private final EmpleadoDao empdao = new EmpleadoDao();
    private DefaultTableModel tblModeloEmpleado;
    private final InnerPersonaEmpleado innEmpMod = new InnerPersonaEmpleado();

    public formEliminarUsuario() {
        initComponents();
    }

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
        txtUsuario = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTituloEliminarCliente.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        txtTituloEliminarCliente.setText("Eliminar Usuario");
        jPanel1.add(txtTituloEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 29, -1, 55));

        btnEliminarUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnEliminarUsuario.setText("Eliminar");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 318, 111, 45));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 411, 771, 339));

        lblUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 214, 66, 40));

        lblIdUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblIdUsuario.setText("ID:");
        jPanel1.add(lblIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 134, 66, 40));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 122, -1, -1));

        btnBuscarUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnBuscarUsuario.setText("Buscar");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 318, 111, 45));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 226, 40));
        jPanel1.add(txtIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 226, 40));

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
                System.out.println("id: " + tamano);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JLabel txtTituloEliminarCliente;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
