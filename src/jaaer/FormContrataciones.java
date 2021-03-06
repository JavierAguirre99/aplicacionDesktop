package jaaer;

import DAO.ContratacionesDAO;
import DAO.EmpleadoDao;
import Modelo.Contrataciones;
import Modelo.Empleados;
import Modelo.InnerPersonaEmpleado;
import Modelo.Municipios;
import Modelo.Paquetes;
import java.util.Calendar;
import java.util.List;

public class FormContrataciones extends javax.swing.JFrame {

    private List<Municipios> lstMunicipio;
    private List<Paquetes> lstPaquetes;
    private List<InnerPersonaEmpleado> lstEmpleado;

    public FormContrataciones() {
        initComponents();
        listarMunicipios();
        listarPaquetes();
        listarEmpledos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbxEmpleado = new javax.swing.JComboBox<>();
        cbxMunicipio = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxPaquetes = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jDateReno = new com.toedter.calendar.JDateChooser();
        jDateCul = new com.toedter.calendar.JDateChooser();
        jDateContra = new com.toedter.calendar.JDateChooser();
        txtIDcliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(671, 578));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(961, 344, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.add(cbxEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 445, 165, 35));

        jPanel3.add(cbxMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 392, 165, 35));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel10.setText("Empleado:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 445, 129, 35));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel9.setText("Municipio:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 392, 129, 35));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setText("Direccion:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 339, 129, 35));

        jPanel3.add(cbxPaquetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 285, 165, 35));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("Paquete:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 285, 129, 35));

        jLabel4.setText("ID Cliente:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 230, 129, 35));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("Fecha Culminacion:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 177, 129, 35));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Fecha Renovacion:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 124, 129, 35));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setText("Fecha Contratacion:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 71, -1, 35));
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 165, 35));
        jPanel3.add(jDateReno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 170, 40));
        jPanel3.add(jDateCul, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 172, 170, 40));
        jPanel3.add(jDateContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 170, 40));
        jPanel3.add(txtIDcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 230, 165, 35));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 480, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void materialButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton1ActionPerformed
        ContratacionesDAO ingresar = new ContratacionesDAO();
        try {
            Contrataciones objeto = new Contrataciones();
            int anio = jDateContra.getCalendar().get(Calendar.YEAR);
            int mes = jDateContra.getCalendar().get(Calendar.MARCH);
            int dia = jDateCul.getCalendar().get(Calendar.DAY_OF_MONTH);

            int anio1 = jDateReno.getCalendar().get(Calendar.YEAR);
            int mes1 = jDateReno.getCalendar().get(Calendar.MARCH);
            int dia1 = jDateReno.getCalendar().get(Calendar.DAY_OF_MONTH);
            int anio2 = jDateCul.getCalendar().get(Calendar.YEAR);
            int mes2 = jDateCul.getCalendar().get(Calendar.MARCH);
            int dia2 = jDateCul.getCalendar().get(Calendar.DAY_OF_MONTH);

            String fechaContra = anio + "-" + mes + "-" + dia;
            String fechaRenova = anio1 + "-" + mes1 + "-" + dia1;
            String fechaCulmi = anio2 + "-" + mes2 + "-" + dia2;
            objeto.setFecha_contrataciones(fechaContra);
            objeto.setFecha_renovacion(fechaRenova);
            objeto.setFecha_culminacion(fechaCulmi);

            objeto.setId_cliente(Integer.parseInt(txtIDcliente.getText()));
            objeto.setId_paquete(cbxPaquetes.getSelectedIndex());
            objeto.setDireccion(txtDireccion.getText());
            objeto.setId_municipio(cbxMunicipio.getSelectedIndex());
            objeto.setId_empleado(cbxEmpleado.getSelectedIndex());
            ingresar.insertarContratacion(objeto);
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }//GEN-LAST:event_materialButton1ActionPerformed

    public final void listarPaquetes() {
        try {
            ContratacionesDAO contratacion = new ContratacionesDAO();
            lstPaquetes = contratacion.listarPaquetes();
            for (int i = 0; i < lstMunicipio.size(); i++) {
                cbxPaquetes.addItem(lstPaquetes.get(i).getNombre());
            }
        } catch (Exception ex) {
            System.out.println("Error al listar Paquetes " + ex);;
        }
    }

    public final void listarMunicipios() {
        try {
            ContratacionesDAO contratacion = new ContratacionesDAO();
            lstMunicipio = contratacion.listarMunicipios();
            for (int i = 0; i < lstMunicipio.size(); i++) {
                cbxMunicipio.addItem(lstMunicipio.get(i).getNombre());
            }
        } catch (Exception ex) {
            System.out.println("Erro al listar Municipios" + ex);;
        }
    }

    public final void listarEmpledos() {
        try {
            System.out.println("empleado: ");
            EmpleadoDao empDao = new EmpleadoDao();
            lstEmpleado = empDao.listarTodoEmpleado();
            
            for (int i = 0; i < lstEmpleado.size(); i++) {
                cbxEmpleado.addItem(lstEmpleado.get(i).getNombreEmpleado());
            }
        } catch (Exception ex) {
            System.out.println("Erro al listar Municipios" + ex);;
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
            java.util.logging.Logger.getLogger(FormContrataciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormContrataciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormContrataciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormContrataciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormContrataciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxEmpleado;
    private javax.swing.JComboBox<String> cbxMunicipio;
    private javax.swing.JComboBox<String> cbxPaquetes;
    private com.toedter.calendar.JDateChooser jDateContra;
    private com.toedter.calendar.JDateChooser jDateCul;
    private com.toedter.calendar.JDateChooser jDateReno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIDcliente;
    // End of variables declaration//GEN-END:variables
}
