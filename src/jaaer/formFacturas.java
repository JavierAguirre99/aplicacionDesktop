package jaaer;


import DAO.FacturaDAO;
import Modelo.Factura;

import java.awt.*;
import java.awt.print.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formFacturas extends javax.swing.JFrame implements Printable {

    DefaultTableModel modeloTabla;
    java.util.List<Factura> lstFactura = new ArrayList();

    public formFacturas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        recibo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtNIT = new javax.swing.JTextField();
        txtDPI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.Contratacion", "Apellido", "Nombre", "Direccion", "Nombre Paquete", "Tipo"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        recibo.setBackground(new java.awt.Color(255, 255, 255));
        recibo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        recibo.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Factura 2017030203");
        jLabel1.setToolTipText("");
        recibo.add(jLabel1);
        jLabel1.setBounds(230, 10, 160, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setText("No.Contratacion:");
        recibo.add(jLabel2);
        jLabel2.setBounds(20, 70, 100, 20);

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        recibo.add(txtNumero);
        txtNumero.setBounds(120, 70, 90, 20);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gracias Por su Preferencia");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 10, 200, 15);

        recibo.add(jPanel1);
        jPanel1.setBounds(20, 230, 520, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("No.");
        recibo.add(jLabel4);
        jLabel4.setBounds(197, 10, 30, 17);

        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        recibo.add(btnBuscar);
        btnBuscar.setBounds(220, 60, 80, 30);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apellido", "Nombre", "Direccion", "Fecha Renova", "Paquete", "Tipo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(5).setMaxWidth(55);
            table.getColumnModel().getColumn(6).setMaxWidth(60);
        }

        recibo.add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 540, 110);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setText("NIT:");
        recibo.add(jLabel5);
        jLabel5.setBounds(410, 70, 40, 20);
        recibo.add(txtNIT);
        txtNIT.setBounds(440, 70, 110, 20);
        recibo.add(txtDPI);
        txtDPI.setBounds(440, 40, 110, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel7.setText("DPI:");
        recibo.add(jLabel7);
        jLabel7.setBounds(410, 40, 23, 20);

        jButton1.setText("Grabar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIME(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(recibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 485, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IMPRIME(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIME
        try {
            PrinterJob grap = PrinterJob.getPrinterJob();
            grap.setPrintable(this);
            boolean top = grap.printDialog();
            if (top) {
                grap.print();
            }
        } catch (PrinterException pex) {
            JOptionPane.showMessageDialog(null, "Error  De Programa", "Error \n" + pex, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_IMPRIME

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        llenerFactura();
    }//GEN-LAST:event_txtNumeroActionPerformed
    public void llenerFactura() {
        try {
            modeloTabla = (DefaultTableModel) table.getModel();

            //se crea un objeto array con la cantidad de columnas del modelo
            Object[] columna2 = new Object[modeloTabla.getColumnCount()];

            FacturaDAO DAO = new FacturaDAO();
            //array que recibira los datos contenidos en el array de la clase

            lstFactura = DAO.listarFacturas(Integer.parseInt(txtNumero.getText()));
                        
            int tamano = lstFactura.size();

            table.removeAll();
            for (int i = 0; i < tamano; i++) {
                
                txtNIT.setText(String.valueOf(lstFactura.get(i).getNit()));
                txtDPI.setText(String.valueOf(lstFactura.get(i).getDpi()));
                
                columna2[0] = lstFactura.get(i).getApellido();
                
                columna2[1] = lstFactura.get(i).getNombre();
                
                columna2[2] = lstFactura.get(i).getDireccion();
                                

                columna2[3] = lstFactura.get(i).getFecha_renovacion();

                columna2[4] = lstFactura.get(i).getNombrePaquete();

                columna2[5] = lstFactura.get(i).getTiposervicio();

                columna2[6] = lstFactura.get(i).getPrecioVenta();

                modeloTabla.addRow(columna2);

            }
            table.updateUI();
        } catch (Exception ex) {
            System.out.println("Error al intentar Listar bean internet" + ex);
        }
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        llenerFactura();
    }//GEN-LAST:event_btnBuscarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new formFacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel recibo;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtDPI;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {
        if (index > 0) {
            return NO_SUCH_PAGE;

        }
        Graphics2D hub = (Graphics2D) graf;
        hub.translate(pagfor.getImageableX() + 30, pagfor.getImageableY() + 30);
        hub.scale(1.0, 1.0);

        recibo.printAll(graf);
        return PAGE_EXISTS;
    }
}
