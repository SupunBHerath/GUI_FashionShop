/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.guicoursework;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author supun
 */
public class BSCSBQty extends javax.swing.JFrame {

    /**
     * Creates new form BSCSBQty
     */
    public BSCSBQty() {

        initComponents();
        DefaultTableModel dtm1 = (DefaultTableModel) CustomerTable.getModel();
        Code temCode = new Code();
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);
        JTableHeader tableHeader = CustomerTable.getTableHeader();
        tableHeader.setDefaultRenderer(center);
        for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
            CustomerTable.getColumnModel().getColumn(columnIndex).setCellRenderer(center);
        }
        ArrayList<Orders> list = Home.orderList;

        String[] temSizeArr = {"XS", "S", "M", "L", "XL", "XXL"};
        int[] qtyTable = temCode.qtyTableForLoop(list);
        double[] amountTable = {qtyTable[0] * 600, qtyTable[1] * 800, qtyTable[2] * 900, qtyTable[3] * 1000, qtyTable[4] * 1100, qtyTable[5] * 1200};
        for (int i = 0; i < qtyTable.length; i++) {
            for (int j = 0; j < qtyTable.length - 1; j++) {
                if (qtyTable[j] < qtyTable[j + 1]) {
                    int temqty = qtyTable[j + 1];
                    qtyTable[j + 1] = qtyTable[j];
                    qtyTable[j] = temqty;

                    double temamount = amountTable[j + 1];
                    amountTable[j + 1] = amountTable[j];
                    amountTable[j] = temamount;

                    String tempSize = temSizeArr[j + 1];
                    temSizeArr[j + 1] = temSizeArr[j];
                    temSizeArr[j] = tempSize;
                }
            }
        }
        double total = 0;
        dtm1.setRowCount(0);
        for (int i = 0; i < qtyTable.length; i++) {
            Object[] rowData = {temSizeArr[i], qtyTable[i], amountTable[i]};
            dtm1.addRow(rowData);
            total += amountTable[i];
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

        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        btnBack1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Items By Qty");
        setPreferredSize(new java.awt.Dimension(550, 450));
        setResizable(false);

        CustomerTable.setAutoCreateRowSorter(true);
        CustomerTable.setBackground(new java.awt.Color(242, 242, 242));
        CustomerTable.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), java.awt.Color.white));
        CustomerTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Size", "Qty", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CustomerTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CustomerTable.setGridColor(new java.awt.Color(242, 242, 242));
        CustomerTable.setRowHeight(48);
        CustomerTable.setSelectionBackground(new java.awt.Color(242, 242, 242));
        CustomerTable.setShowGrid(true);
        jScrollPane1.setViewportView(CustomerTable);

        btnBack1.setBackground(new java.awt.Color(255, 102, 102));
        btnBack1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(255, 255, 255));
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack1))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        dispose();

    }//GEN-LAST:event_btnBack1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BSCSBQty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BSCSBQty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BSCSBQty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BSCSBQty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BSCSBQty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton btnBack1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
