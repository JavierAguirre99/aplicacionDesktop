/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaaer;

import DAO.ClienteDao;
import Modelo.InnerPersonaCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author javam
 */
public class frmBusquedaListaCliente extends javax.swing.JFrame {

    /**
     * Creates new form frmBusquedaListaCliente
     */
    private ArrayList<InnerPersonaCliente> lstModCliente;
    private final ClienteDao clieDao = new ClienteDao();
    private final InnerPersonaCliente modInnerPer = new InnerPersonaCliente();
    private DefaultTableModel tblModelCliente;

    public frmBusquedaListaCliente() {
        initComponents();
        llenarTabla();
    }

//    private void limpiar() {
//        if (tblModelCliente.getRowCount() != 0) {
//
//            for (int i = 0; i < tblModelCliente.getRowCount(); i++) {
//                tblModelCliente.removeRow(0);
//            }
//        }
//    }
    private void limpiarOtraForma(){
        while(tblModelCliente.getRowCount()>0){
            tblModelCliente.removeRow(0);
        }
    }
    private void llenarTabla() {
        tblModelCliente = (DefaultTableModel) tblCliente.getModel();
        Object[] column = new Object[tblModelCliente.getColumnCount()];
        
        try {
            lstModCliente = clieDao.llenarLista();
            int tamano = lstModCliente.size();

            for (int i = 0; i < tamano; i++) {
                column[0] = lstModCliente.get(i).getIdCliente();
                column[1] = lstModCliente.get(i).getDpiCliente();
                column[2] = lstModCliente.get(i).getNombreCliente();
                column[3] = lstModCliente.get(i).getTipoCliente();
                column[4] = lstModCliente.get(i).getEstado();
                column[5] = lstModCliente.get(i).getCorreoElectronico();
                column[6] = lstModCliente.get(i).getDireccion();
                tblModelCliente.addRow(column);
            }

        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloElCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        txtIdCliente = new principal.MaterialTextField();
        btnListarImprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloElCliente.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblTituloElCliente.setText("Lista de Clientes");
        jPanel1.add(lblTituloElCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, 60));

        tblCliente.setForeground(new java.awt.Color(153, 153, 153));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "DPI", "Cliente", "Tipo de Cliente", "Estado", "Correo Electronico", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Long.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.setGridColor(new java.awt.Color(255, 255, 255));
        tblCliente.setRowHeight(25);
        tblCliente.setSelectionBackground(new java.awt.Color(255, 153, 51));
        jScrollPane1.setViewportView(tblCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 970, 350));
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 200, 40));

        btnListarImprimir.setBackground(new java.awt.Color(255, 255, 255));
        btnListarImprimir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnListarImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/printer.png"))); // NOI18N
        btnListarImprimir.setText("Listar e Imprimar");
        btnListarImprimir.setBorder(null);
        btnListarImprimir.setBorderPainted(false);
        btnListarImprimir.setContentAreaFilled(false);
        btnListarImprimir.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnListarImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnListarImprimir.setIconTextGap(10);
        btnListarImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 160, 40));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setText("ID Cliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 70, 40));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/magnifying-glass.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarImprimirActionPerformed
        limpiarOtraForma();
        llenarTabla();
        
        int res = JOptionPane.showConfirmDialog(this, "¿Desea imprimir el listado de Clientes?", "Confirmacion", JOptionPane.YES_OPTION);
        if (res == 0) {
            String direccion = "C:\\Users\\Walter\\Documents\\NetBeansProjects\\aplicacionDesktop\\src\\Reporte\\listadoClienteOtro.jrxml";
            try {
                System.out.println("hola");
                JasperReport reporteCliente = JasperCompileManager.compileReport(direccion); //se crea una archivo tipo jrxml
                JasperPrint mostrarReporte = JasperFillManager.fillReport(reporteCliente,null, clieDao.getCn()); //toma los valores de archivo jrxml y la conexion a la base de datos 
                JasperViewer.viewReport(mostrarReporte); //sirve para mostrar el reporte en pantalla
            } catch (JRException ex) {
                System.err.println("Error al generar reporte: "+ex);
            }
                    
        }
    }//GEN-LAST:event_btnListarImprimirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed


        tblModelCliente = (DefaultTableModel) tblCliente.getModel();

        Object[] column = new Object[tblModelCliente.getColumnCount()];

        modInnerPer.setIdCliente(Integer.parseInt(txtIdCliente.getText()));
        limpiarOtraForma();
        try {
            lstModCliente = clieDao.llenarTablaCliente(modInnerPer);

            int tamano = lstModCliente.size();
            for (int i = 0; i < tamano; i++) {
                column[0] = lstModCliente.get(i).getIdCliente();
                column[1] = lstModCliente.get(i).getDpiCliente();
                column[2] = lstModCliente.get(i).getNombreCliente();
                column[3] = lstModCliente.get(i).getTipoCliente();
                column[4] = lstModCliente.get(i).getEstado();
                column[5] = lstModCliente.get(i).getCorreoElectronico();
                column[6] = lstModCliente.get(i).getDireccion();
                tblModelCliente.addRow(column);
            }

        } catch (Exception e) {
            System.err.println("Error al buscar: " + e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(frmBusquedaListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBusquedaListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBusquedaListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBusquedaListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBusquedaListaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnListarImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloElCliente;
    private javax.swing.JTable tblCliente;
    private principal.MaterialTextField txtIdCliente;
    // End of variables declaration//GEN-END:variables
}
