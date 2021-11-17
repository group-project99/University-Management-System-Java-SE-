/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_;

import Entity_.Employee;
import Service_.EmployeeService;
import java.awt.Color;
import java.awt.Image;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MY_PC
 */
public class attendanceTable extends javax.swing.JFrame {

    Employee emp;
    EmployeeService empSrv = new EmployeeService();
    DefaultTableModel model = new DefaultTableModel();
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat simpletime = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date currenttime;
    String clockdate = null;
    String clocktime = null;

    public attendanceTable() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        jButton1.setVisible(false);
        clock();
        try {
            sleep(1000);
        MatteBorder border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        attendanceTable.setBorder(border);
        attendanceTable.setBackground(Color.WHITE);
        attendanceTable.setRowHeight(40);
        attendanceTable.setSelectionBackground(Color.ORANGE);
        attendanceTable.setSelectionForeground(Color.blue);
        attendanceTable.setShowGrid(true);
        attendanceTable.setGridColor(Color.gray);
        attendanceTable.setShowVerticalLines(true);
            attTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void clock() {
        new Thread() {
            public void run() {

                while (true) {
                    cal = Calendar.getInstance();
                    clocktime = simpletime.format(cal.getTime());
                    clockdate = dateFormat.format(cal.getTime());
                    time.setText(clocktime);
                    date.setText(clockdate);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }.start();
    }

    public void attTable() {

        List<Employee> employee = empSrv.attTable(date.getText());
        DefaultTableModel model = (DefaultTableModel) attendanceTable.getModel();
        for (int i = 0; i < employee.size(); i++) {
            model.addRow(new Object[]{employee.get(i).getIssuedid(), employee.get(i).getFirstname(), employee.get(i).getLastname(), employee.get(i).getAttendstatus()});

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 52, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Attendance"
            }
        ));
        jScrollPane1.setViewportView(attendanceTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 970, 460));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_go_back_37px_1.png"))); // NOI18N
        jLabel1.setToolTipText(" Back");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 50, 40));

        date.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("Date");
        date.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 70, -1));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("|");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 20, -1));

        time.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("Time");
        time.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 90, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<Employee> employee = empSrv.attTable(date.getText());
        DefaultTableModel model = (DefaultTableModel) attendanceTable.getModel();
        for (int i = 0; i < employee.size(); i++) {
            model.addRow(new Object[]{employee.get(i).getIssuedid(), employee.get(i).getFirstname(), employee.get(i).getLastname(), employee.get(i).getAttendstatus()});

        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(attendanceTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendanceTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendanceTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendanceTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attendanceTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable attendanceTable;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
