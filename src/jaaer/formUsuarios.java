package jaaer;

import DAO.usuarioDao;
import Modelo.TiposUsuarios;
import Modelo.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class formUsuarios extends javax.swing.JFrame {

    private List<TiposUsuarios> lstUsuarios;
    private List<Usuario> listaUsuario;

    public formUsuarios() {
        initComponents();
        listarTipos();
        listarUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxTipoUsuario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtPasword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtConfirmar = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxNombres1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombres:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 190, 60, 20);

        cbxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoUsuario);
        cbxTipoUsuario.setBounds(180, 390, 150, 40);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 250, 80, 20);
        jPanel1.add(txtPasword);
        txtPasword.setBounds(180, 250, 150, 40);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("Confirmar:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 320, 80, 20);
        jPanel1.add(txtConfirmar);
        txtConfirmar.setBounds(180, 320, 150, 40);

        btnGuardar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnGuardar.setText("Agregar ");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar);
        btnGuardar.setBounds(180, 460, 110, 40);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        jLabel4.setText("Ingresar Usuario");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 40, 180, 25);
        jLabel4.getAccessibleContext().setAccessibleName("Ingresar Usuario ");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de Usu:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 390, 76, 20);

        cbxNombres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNombres1ActionPerformed(evt);
            }
        });
        jPanel1.add(cbxNombres1);
        cbxNombres1.setBounds(180, 180, 150, 40);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("ID:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 130, 34, 20);

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtID);
        txtID.setBounds(180, 120, 150, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 450, 520));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cbxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoUsuarioActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ingresarNuevoUsuario();
        java.util.Date fecha = new Date();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxNombres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNombres1ActionPerformed
        for (int i = 0; i < listaUsuario.size(); i++) {
            if (cbxNombres1.getSelectedItem().equals(listaUsuario.get(i).getNombre())) {
                txtID.setText(String.valueOf(listaUsuario.get(i).getId_usuario()));
            }
        }
    }//GEN-LAST:event_cbxNombres1ActionPerformed
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
                new formUsuarios().setVisible(true);
            }
        });
    }

    public void ingresarNuevoUsuario() {
        try {
            usuarioDao nuevoUsuario = new usuarioDao();
            Usuario usuario = new Usuario();

            usuario.setId_usuario(Integer.parseInt(txtID.getText()));
            usuario.setNombre((String) cbxNombres1.getSelectedItem());

            usuario.setContrasena(txtPasword.getText());
            for (int i = 0; i < lstUsuarios.size(); i++) {
                if (cbxTipoUsuario.getSelectedItem().equals(lstUsuarios.get(i).getTipousuario())) {
                    usuario.setTipo_usuario(lstUsuarios.get(i).getId_tipousuario());
                    System.out.println("Este es el Tipo de Usuario" + lstUsuarios.get(i).getId_tipousuario());
                }
            }

            String pass = txtPasword.getText();
            String conf = txtConfirmar.getText();

            if (pass != conf) {
                JOptionPane.showMessageDialog(null, "Password No coinciden");
            } else {
                nuevoUsuario.nuevoUsuario(usuario);
            }
        } catch (Exception ex) {
            Logger.getLogger(formUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public final void listarTipos() {
        try {
            usuarioDao usuario = new usuarioDao();
            lstUsuarios = usuario.listarTiposUsuarios();
            for (int i = 0; i < lstUsuarios.size(); i++) {
                cbxTipoUsuario.addItem(lstUsuarios.get(i).getTipousuario());
            }
        } catch (Exception ex) {
            System.out.println("Error en el Bean AL intentar Ingresar Un nuevo Usuario");
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////

    public final void listarUsuarios() {
        try {
            usuarioDao usuario = new usuarioDao();
            listaUsuario = usuario.listarNombres();
            for (int i = 0; i < listaUsuario.size(); i++) {
                cbxNombres1.addItem(listaUsuario.get(i).getNombre());
            }
        } catch (Exception ex) {
            System.out.println("Error en el Bean AL intentar Ingresar Un nuevo Usuario");
        }
    }

    public void obtenerFecha() {
        Date date = new Date();
//Caso 1: obtener la hora y salida por pantalla con formato:
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Hora: " + hourFormat.format(date));
//Caso 2: obtener la fecha y salida por pantalla con formato:
        DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
        System.out.println("Fecha: " + dateFormat.format(date));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxNombres1;
    private javax.swing.JComboBox<String> cbxTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtConfirmar;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtPasword;
    // End of variables declaration//GEN-END:variables
}
