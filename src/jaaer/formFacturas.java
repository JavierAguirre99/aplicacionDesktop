package jaaer;

import java.awt.*;
import java.awt.print.*;
import javax.swing.JOptionPane;

public class formFacturas extends javax.swing.JFrame implements Printable {

    public formFacturas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recibo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        recibo.setBackground(new java.awt.Color(255, 255, 255));
        recibo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        recibo.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Factura 2017030203");
        jLabel1.setToolTipText("");
        recibo.add(jLabel1);
        jLabel1.setBounds(420, 30, 120, 14);

        jLabel2.setText("Cliente:");
        recibo.add(jLabel2);
        jLabel2.setBounds(40, 70, 50, 20);

        jTextField1.setText("Juan Perez\n");
        recibo.add(jTextField1);
        jTextField1.setBounds(90, 70, 80, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cant.", "Producto", "Prec Unit.", "Prec. Cant"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(45);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        recibo.add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 520, 100);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gracias Por su Preferencia");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 10, 200, 15);

        recibo.add(jPanel1);
        jPanel1.setBounds(20, 230, 520, 90);

        jLabel4.setText("No.");
        recibo.add(jLabel4);
        jLabel4.setBounds(400, 30, 17, 14);

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
                .addGap(0, 474, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IMPRIME(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIME
        try {
            PrinterJob grap  =   PrinterJob.getPrinterJob();
            grap.setPrintable(this);
            boolean top = grap.printDialog();
            if (top) {
                grap.print();
            }
        } catch (PrinterException pex) {
            JOptionPane.showMessageDialog(null, "Error  De Programa","Error \n"+pex, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_IMPRIME

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new formFacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel recibo;
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
