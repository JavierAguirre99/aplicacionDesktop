package jaaer;

import DAO.usuarioDao;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class formModificarUsuario extends javax.swing.JFrame {
    DefaultTableModel modeloTabla;
    List<Usuario> lstUsuario = new ArrayList();
    
    public formModificarUsuario() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablaUsuarios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtConfirmar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        tablaUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Tabla De Usuarios");
        tablaUsuarios.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Password", "Tipo de Usuario"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        tablaUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 500, 94));

        jLabel2.setText("Usuario:");
        tablaUsuarios.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 210, -1, 20));
        tablaUsuarios.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 70, -1));

        jLabel3.setText("Password:");
        tablaUsuarios.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, 20));
        tablaUsuarios.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 90, -1));
        tablaUsuarios.add(txtConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 90, -1));

        jLabel4.setText("Confirmar:");
        tablaUsuarios.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, 20));

        jButton1.setText("Guardar");
        tablaUsuarios.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(tablaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(505, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(tablaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
            
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
            java.util.logging.Logger.getLogger(formModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formModificarUsuario().setVisible(true);
            }
        });
    }
    
    private void llenar() {
        try {
            modeloTabla = (DefaultTableModel) jTable1.getModel();

            //se crea un objeto array con la cantidad de columnas del modelo
            Object[] columna = new Object[modeloTabla.getColumnCount()];

            usuarioDao DAO = new usuarioDao();
            //array que recibira los datos contenidos en el array de la clase

            int tamanio = modeloTabla.getRowCount();

            if (modeloTabla.getRowCount() != 0) {
                for (int i = 0; i < tamanio; i++) {

                    modeloTabla.removeRow(0);
                }

            }
            lstUsuario = DAO.listarUsuarios();

            int tamano = lstUsuario.size();

            for (int i = 0; i < tamano; i++) {

                columna[0] = lstUsuario.get(i).getId_usuario();

                columna[1] = lstUsuario.get(i).getNombre();

                columna[2] = lstUsuario.get(i).getNombre();

                columna[3] = lstUsuario.get(i).get;

                columna[4] = lstUsuario.get(i).getNit();

                columna[5] = lstUsuario.get(i).getDpi();

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel tablaUsuarios;
    private javax.swing.JTextField txtConfirmar;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
