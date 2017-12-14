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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 51));

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

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setForeground(new java.awt.Color(255, 153, 0));

        jLabel1.setText("Nombre Del Paquete:");

        jLabel2.setText("Descripcion:");

        jLabel3.setText("Tipo de Servicio");

        jLabel4.setText("Costo:");

        jLabel5.setText("Precio de Venta:");

        jLabel6.setText("Ingreso De Un Nuevo Paquete");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre))
                            .addComponent(txtDescripcion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cbxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnNuevo)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton2)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6)
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );

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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        id = Integer.parseInt(modeloTabla.getValueAt(jTable1.getSelectedRow(), 0).toString());
        nombre = modeloTabla.getValueAt(jTable1.getSelectedRow(), 1).toString();
        descripcion = modeloTabla.getValueAt(jTable1.getSelectedRow(), 2).toString();
        tipo = modeloTabla.getValueAt(jTable1.getSelectedRow(), 3).toString();
        costo = Integer.parseInt(modeloTabla.getValueAt(jTable1.getSelectedRow(), 4).toString());
        precio = Integer.parseInt(modeloTabla.getValueAt(jTable1.getSelectedRow(), 5).toString());

        txtNombre.setText(nombre);
        txtDescripcion.setText(descripcion);
        cbxTipo.setSelectedItem(tipo);
        txtCosto.setText(String.valueOf(costo));
        txtPrecioV.setText(String.valueOf(precio));

    }//GEN-LAST:event_jTable1MouseClicked

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioV;
    // End of variables declaration//GEN-END:variables
}
