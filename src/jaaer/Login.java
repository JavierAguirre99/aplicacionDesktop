/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaaer;

import DAO.usuarioDao;
import Modelo.Usuario;
import interfazEmpleado.menuEjecutivo;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jpIngreso = new javax.swing.JPanel();
        lblContra = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtContra = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jpIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContra.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        lblContra.setForeground(new java.awt.Color(186, 12, 12));
        lblContra.setText("Contraseña:");
        jpIngreso.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 130, 30));

        lblUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(186, 12, 12));
        lblUsuario.setText("Usuario:");
        jpIngreso.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 100, 30));

        txtUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setBorder(null);
        jpIngreso.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 230, 40));
        jpIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 340, 20));
        jpIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 340, 20));

        txtContra.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        txtContra.setForeground(new java.awt.Color(153, 153, 153));
        txtContra.setBorder(null);
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        jpIngreso.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 210, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancelar.png"))); // NOI18N
        jLabel6.setToolTipText("");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jpIngreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/usuario-1.png"))); // NOI18N
        jLabel7.setToolTipText("");
        jpIngreso.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login-1.png"))); // NOI18N
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jpIngreso.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 60, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clave.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jpIngreso.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/flecha-hacia-abajo.png"))); // NOI18N
        jLabel9.setToolTipText("");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jpIngreso.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/usuario.png"))); // NOI18N
        jpIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, 140));

        getContentPane().add(jpIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 560, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        int dialogo = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicacion", "Salir", dialogo);

        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        try {
            usuarioDao userDao = new usuarioDao();
            Usuario use = new Usuario();
            use.setContrasena(txtContra.getText());
            use.setNombre(txtUsuario.getText());
            userDao.verificarUsuario(use);            
            
            if(userDao.getContent()==1){
                JOptionPane.showMessageDialog(this, "Bienvenido usuario "+txtUsuario.getText());
                menuPrincipal menCliente = new menuPrincipal();
                menCliente.setVisible(true);
                menCliente.pack();
            }
            if(userDao.getContent()==2){
                JOptionPane.showMessageDialog(this, "Bienvenido usuario "+txtUsuario.getText());
                menuServicioCliente menPrincipal = new menuServicioCliente();
                menPrincipal.setVisible(true);
                menPrincipal.pack();
            }
            if(userDao.getContent()==4){
                JOptionPane.showMessageDialog(this, "Bienvenido usuario "+txtUsuario.getText());
                menuEjecutivo menPrincipal = new menuEjecutivo();
                menPrincipal.setVisible(true);
                menPrincipal.pack();
            }if (userDao.getContent()==5) {
                JOptionPane.showMessageDialog(this, "Ingrese un usuario correcto");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error contraseña o usuario incoreccto");
            System.out.println("Error: "+ex);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

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
                if ("Widows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpIngreso;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
