package jaaer;

import DAO.usuarioDao;
import Modelo.TiposUsuarios;
import Modelo.Usuario;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setText("Nombres:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 100, 60, 20);

        cbxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoUsuario);
        cbxTipoUsuario.setBounds(160, 190, 100, 20);

        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 130, 60, 20);
        jPanel1.add(txtPasword);
        txtPasword.setBounds(160, 130, 100, 20);

        jLabel3.setText("Confirmar:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 160, 60, 20);
        jPanel1.add(txtConfirmar);
        txtConfirmar.setBounds(160, 160, 100, 20);

        btnGuardar.setText("Agregar ");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar);
        btnGuardar.setBounds(140, 220, 90, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("USUARIOS ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 10, 110, 22);

        jLabel5.setText("Tipo de Usu:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 190, 60, 20);

        cbxNombres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNombres1ActionPerformed(evt);
            }
        });
        jPanel1.add(cbxNombres1);
        cbxNombres1.setBounds(160, 100, 100, 20);

        jLabel6.setText("ID:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 70, 34, 20);

        txtID.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(txtID);
        txtID.setBounds(160, 70, 100, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cbxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoUsuarioActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ingresarNuevoUsuario();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxNombres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNombres1ActionPerformed
        for (int i = 0; i < listaUsuario.size(); i++) {
            if (cbxNombres1.getSelectedItem().equals(listaUsuario.get(i).getNombre())) {
                txtID.setText(String.valueOf(listaUsuario.get(i).getId_usuario()));
            }
        }
    }//GEN-LAST:event_cbxNombres1ActionPerformed
    public static void main(String args[]) {
       
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
    private javax.swing.JTextField txtConfirmar;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtPasword;
    // End of variables declaration//GEN-END:variables
}
