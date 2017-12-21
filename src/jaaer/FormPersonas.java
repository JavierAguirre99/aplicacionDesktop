package jaaer;

import DAO.PersonaDAO;
import Modelo.Personas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class FormPersonas extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;
    List<Personas> lstPersona = new ArrayList();
    int id;
    String nombre;
    String apellido;
    String direccion;
    int nit;
    Long dpi;
    String fecha;
    String movil;
    String casa;

    public FormPersonas() {

        initComponents();
        llenar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtNit = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCasa = new javax.swing.JTextField();
        txtDpi = new javax.swing.JTextField();
        txtMovil = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1060, 509));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("Direccion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, 20));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("DPI:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("Tel Movil:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setText("Nit:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel8.setText("Fecha Nac:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 60, 40));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel9.setText("Tel Casa:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, 50));

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 100, 40));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, 40));
        jPanel1.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, 40));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 150, 40));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 150, 40));
        jPanel1.add(txtCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 150, 40));
        jPanel1.add(txtDpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 150, 40));
        jPanel1.add(txtMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 150, 40));

        btnModificar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 110, 40));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Direccion", "Nit", "DPI", "Fecha Nac", "Tel Movil", "Tel Casa"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 870, 220));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setText("Ingreso de Personas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 872, 520));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenar() {
        try {
            modeloTabla = (DefaultTableModel) jTable1.getModel();

            //se crea un objeto array con la cantidad de columnas del modelo
            Object[] columna = new Object[modeloTabla.getColumnCount()];

            PersonaDAO DAO = new PersonaDAO();
            //array que recibira los datos contenidos en el array de la clase

            int tamanio = modeloTabla.getRowCount();

            if (modeloTabla.getRowCount() != 0) {
                for (int i = 0; i < tamanio; i++) {

                    modeloTabla.removeRow(0);
                }

            }
            lstPersona = DAO.listarPersonas();

            int tamano = lstPersona.size();

            for (int i = 0; i < tamano; i++) {

                columna[0] = lstPersona.get(i).getId();

                columna[1] = lstPersona.get(i).getNombre();

                columna[2] = lstPersona.get(i).getApellido();

                columna[3] = lstPersona.get(i).getDireccion();

                columna[4] = lstPersona.get(i).getNit();

                columna[5] = lstPersona.get(i).getDpi();

                columna[6] = lstPersona.get(i).getFecha_nac();

                columna[7] = lstPersona.get(i).getTel_movil();

                columna[8] = lstPersona.get(i).getTel_casa();

                modeloTabla.addRow(columna);
            }

        } catch (Exception ex) {
            System.out.println("Error al intentar Listar bean personas" + ex);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            PersonaDAO Dao = new PersonaDAO();
            Personas objeto = new Personas();

            objeto.setNombre(txtNombre.getText());
            objeto.setApellido(txtApellido.getText());
            objeto.setDireccion(txtDireccion.getText());
            objeto.setDpi(Long.parseLong(txtDpi.getText()));
            objeto.setNit(Integer.parseInt(txtNit.getText()));

            int anio2 = txtFecha.getCalendar().get(Calendar.YEAR);
            int mes2 = txtFecha.getCalendar().get(Calendar.MARCH);
            int dia2 = txtFecha.getCalendar().get(Calendar.DAY_OF_MONTH);

            String fechaContra = anio2 + "-" + mes2 + "-" + dia2;

            objeto.setFecha_nac(fechaContra);
            objeto.setTel_casa(Integer.parseInt(txtCasa.getText()));
            objeto.setTel_movil(Integer.parseInt(txtMovil.getText()));

            Dao.ingresarPersona(objeto);
            llenar();

        } catch (Exception ex) {
            System.out.println("Error al Ingresar una persona" + ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        try {
            PersonaDAO prueba = new PersonaDAO();
            Personas persona = new Personas();

            persona.setId(id);
            System.out.println(id);
            persona.setNombre(txtNombre.getText());
            persona.setApellido(txtApellido.getText());
            persona.setDireccion(txtDireccion.getText());
            persona.setDpi(Long.parseLong(txtDpi.getText()));
            persona.setNit(Integer.parseInt(txtNit.getText()));

            int anio2 = txtFecha.getCalendar().get(Calendar.YEAR);
            int mes2 = txtFecha.getCalendar().get(Calendar.MARCH);
            int dia2 = txtFecha.getCalendar().get(Calendar.DAY_OF_MONTH);

            String fechaPersona = anio2 + "-" + mes2 + "-" + dia2;
            persona.setFecha_nac(fechaPersona);
            persona.setTel_movil(Integer.parseInt(txtMovil.getText()));
            persona.setTel_casa(Integer.parseInt(txtCasa.getText()));

            prueba.modificarPersona(persona);
            llenar();
        } catch (Exception ex) {
            System.out.println("Error en el Bean Al intentar Modificar Persona " + ex);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        id = Integer.parseInt(modeloTabla.getValueAt(jTable1.getSelectedRow(), 0).toString());
        System.out.println("id" + id);
        nombre = modeloTabla.getValueAt(jTable1.getSelectedRow(), 1).toString();
        apellido = (modeloTabla.getValueAt(jTable1.getSelectedRow(), 2).toString());
        direccion = modeloTabla.getValueAt(jTable1.getSelectedRow(), 3).toString();
        nit = Integer.parseInt(modeloTabla.getValueAt(jTable1.getSelectedRow(), 4).toString());
        dpi = Long.parseLong(modeloTabla.getValueAt(jTable1.getSelectedRow(), 5).toString());
        fecha = (modeloTabla.getValueAt(jTable1.getSelectedRow(), 6).toString());
        movil = String.valueOf(modeloTabla.getValueAt(jTable1.getSelectedRow(), 7).toString());
        casa = String.valueOf((modeloTabla.getValueAt(jTable1.getSelectedRow(), 8).toString()));

        txtNombre.setText(String.valueOf(id));
        txtApellido.setText(apellido);
        txtDireccion.setText(direccion);
        txtNit.setText(String.valueOf(id));
        txtDpi.setText(String.valueOf(dpi));
        txtFecha.setDateFormatString(fecha);
        txtMovil.setText(movil);
        txtCasa.setText(casa);
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(menuServicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuServicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuServicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuServicioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPersonas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCasa;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDpi;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtMovil;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
