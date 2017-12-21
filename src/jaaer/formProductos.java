package jaaer;

import DAO.PaquetesDAO;
import DAO.usuarioDao;
import Modelo.Paquetes;
import Modelo.Personas;
import Modelo.TipoServicio;
import Modelo.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class formProductos extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;
    private List<TipoServicio> lstTiposServicios;
    private List<Paquetes> lstPaquetes;

    int id;
    String nombre;
    String descripcion;
    String tipo;
    int costo;
    int precio;

    public formProductos() {
        initComponents();
        llenarTabla();
        listarTipos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 153, 51));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre Del Paquete:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Descripcion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 150, 40));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("Tipo de Servicio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jPanel1.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 150, 40));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("Costo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));
        jPanel1.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 150, 40));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("Precio de Venta:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jPanel1.add(txtPrecioV, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 150, 40));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel6.setText("Ingreso De Un Nuevo Paquete");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        btnNuevo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 110, 40));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 110, 40));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 110, 40));

        jTable1.setBackground(new java.awt.Color(255, 204, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "TIpo", "Costo", "Precio"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 317, 700, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 710, 540));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        jTable1.setSelectionMode(0);
        if (txtNombre.getText() != null) {
            txtNombre.setText(null);
            txtDescripcion.setText(null);
            txtCosto.setText(null);
            txtPrecioV.setText(null);
            JOptionPane.showMessageDialog(null, "Ingrese Su nuevo Paquete");
        } else {

            try {
                Paquetes paquete = new Paquetes();
                PaquetesDAO DAO = new PaquetesDAO();

                paquete.setNombre(txtNombre.getText());
                paquete.setDescripcion(txtDescripcion.getText());
                for (int i = 0; i < lstTiposServicios.size(); i++) {
                    if (cbxTipo.getSelectedItem().equals(lstTiposServicios.get(i).getNombre())) {
                        paquete.setId_tiposervicio(lstTiposServicios.get(i).getId_servicio());
                    }
                }
                paquete.setCosto(Integer.parseInt(txtCosto.getText()));
                paquete.setPrecioventa(Integer.parseInt(txtPrecioV.getText()));
                DAO.ingresarPaquete(paquete);
                llenarTabla();

            } catch (Exception ex) {
                System.out.println("Error al intentar ingresar un paquete" + ex);

            }
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (id != 0) {
            try {
                PaquetesDAO prueba = new PaquetesDAO();
                Paquetes paquete = new Paquetes();

                paquete.setId_paquete(id);
                paquete.setNombre(txtNombre.getText());
                paquete.setDescripcion(txtDescripcion.getText());

                for (int i = 0; i < lstTiposServicios.size(); i++) {
                    if (cbxTipo.getSelectedItem().equals(lstTiposServicios.get(i).getNombre())) {
                        paquete.setId_tiposervicio(lstTiposServicios.get(i).getId_servicio());
                    }

                }
                paquete.setCosto(Integer.parseInt(txtCosto.getText()));
                paquete.setPrecioventa(Integer.parseInt(txtPrecioV.getText()));

                prueba.modificarPaquetes(paquete);
                id = 0;
                txtNombre.setText(null);
                txtDescripcion.setText(null);
                txtCosto.setText(null);
                txtPrecioV.setText(null);
                llenarTabla();
            } catch (Exception ex) {
                System.out.println("Error en el Bean Al intentar Modificar Persona " + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Primero Debe seleccionar un Registro ");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (id == 0) {
            JOptionPane.showMessageDialog(null, "Primero Debe Seleccionar Un dato de La tabla ");
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                try {
                    PaquetesDAO prueba = new PaquetesDAO();

                    prueba.eliminarPaquetes(id);
                    id = 0;
                    txtNombre.setText(null);
                    txtDescripcion.setText(null);
                    txtCosto.setText(null);
                    txtPrecioV.setText(null);
                    llenarTabla();
                } catch (Exception ex) {
                    System.out.println("Error al Eliminar Paquete Bean");
                }
            } else {
                jTable1.setSelectionMode(0);
                txtNombre.setText(null);
                txtDescripcion.setText(null);
                txtCosto.setText(null);
                txtPrecioV.setText(null);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        id = Integer.parseInt(modeloTabla.getValueAt(jTable1.getSelectedRow(), 0).toString());
        nombre = (modeloTabla.getValueAt(jTable1.getSelectedRow(), 1).toString());
        descripcion = (modeloTabla.getValueAt(jTable1.getSelectedRow(), 2).toString());
        tipo = (modeloTabla.getValueAt(jTable1.getSelectedRow(), 3).toString());
        costo = Integer.parseInt(modeloTabla.getValueAt(jTable1.getSelectedRow(), 4).toString());
        precio = Integer.parseInt(modeloTabla.getValueAt(jTable1.getSelectedRow(), 5).toString());
        System.out.println("id" + id);
                            
        txtNombre.setText(String.valueOf(nombre));
        txtDescripcion.setText(String.valueOf(descripcion));
        cbxTipo.setSelectedItem(tipo);
        txtCosto.setText(String.valueOf(costo));
        txtPrecioV.setText(String.valueOf(precio));
        
    }//GEN-LAST:event_jTable1MouseClicked

    public final void listarTipos() {
        try {
            PaquetesDAO contratacion = new PaquetesDAO();
            lstTiposServicios = contratacion.listarTipoServicio();
            for (int i = 0; i < lstTiposServicios.size(); i++) {
                cbxTipo.addItem(lstTiposServicios.get(i).getNombre());
            }
        } catch (Exception ex) {
            System.out.println("Error al listar Paquetes " + ex);
        }
    }

    public final void llenarTabla() {

        try {

            modeloTabla = (DefaultTableModel) jTable1.getModel();

            //se crea un objeto array con la cantidad de columnas del modelo
            Object[] columna = new Object[modeloTabla.getColumnCount()];

            PaquetesDAO DAO = new PaquetesDAO();
            //array que recibira los datos contenidos en el array de la clase

            int tamanio = modeloTabla.getRowCount();

            if (modeloTabla.getRowCount() != 0) {
                for (int i = 0; i < tamanio; i++) {
                    modeloTabla.removeRow(0);
                }
            }
            lstPaquetes = DAO.listar();

            int tamano = lstPaquetes.size();

            for (int i = 0; i < tamano; i++) {
                columna[0] = lstPaquetes.get(i).getId_paquete();

                columna[1] = lstPaquetes.get(i).getNombre();

                columna[2] = lstPaquetes.get(i).getDescripcion();

                columna[3] = lstPaquetes.get(i).getId_tiposervicio();

                columna[4] = lstPaquetes.get(i).getCosto();

                columna[5] = lstPaquetes.get(i).getPrecioventa();

                modeloTabla.addRow(columna);
            }

        } catch (Exception ex) {
            System.out.println("Error al intentar Listar bean Paquetes" + ex);
        }
    }

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
            java.util.logging.Logger.getLogger(formEliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formEliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formEliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formEliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioV;
    // End of variables declaration//GEN-END:variables
}
