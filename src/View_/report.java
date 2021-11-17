/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_;

import View_Guest.*;
import View_.*;
import Utility.DBConnection;
import View_.subInterf.PDF_Genarated_Success;
import java.awt.Color;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author MY_PC
 */
public class report extends javax.swing.JFrame {

    PDF_Genarated_Success pp = new PDF_Genarated_Success();
    Connection conn = DBConnection.getConnection();
    PreparedStatement pst = null;
    ResultSet rs = null;

    //Date
    Calendar cal = Calendar.getInstance();
    Calendar cal2 = new GregorianCalendar();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String clockdate = null;

    public report() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Table Format
        MatteBorder border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        attendance.setBorder(border);
        attendance.setBackground(Color.WHITE);
        attendance.setRowHeight(40);
        attendance.setSelectionBackground(Color.ORANGE);
        attendance.setSelectionForeground(Color.blue);
        attendance.setShowGrid(true);
        attendance.setGridColor(Color.gray);
        attendance.setShowVerticalLines(true);

        clock();
        jComboBox1.setEnabled(false);
        jDateChooser1.setEnabled(false);
        jDateChooser2.setEnabled(false);
    }

    // set empty
    public void clear() {
        jComboBox1.setSelectedIndex(0);
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
    }

    // monthly salary print
    //-------------------------------------------------------------------------------------------------
    public void monthly() {
        String fordates = "";
        String todates = "";
        String month = jComboBox1.getSelectedItem().toString();

        if (jComboBox1.getSelectedItem().toString().equals("Select a month,")) {
            //nothing to do
            System.out.print("Monthly not selected !");
        } else {
            switch (month) {
                case "January":
                    fordates = "2021-01-01";
                    todates = "2021-02-01";
                    break;
                case "February":
                    fordates = "2021-02-02";
                    todates = "2021-03-01";
                    break;
                case "March":
                    fordates = "2021-03-02";
                    todates = "2021-04-01";
                    break;
                case "April":
                    fordates = "2021-04-02";
                    todates = "2021-05-01";
                    break;
                case "May":
                    fordates = "2021-05-02";
                    todates = "2021-06-01";
                    break;
                case "June":
                    fordates = "2021-06-02";
                    todates = "2021-07-01";
                    break;
                case "July":
                    fordates = "2021-07-02";
                    todates = "2021-08-01";
                    break;
                case "Auguest":
                    fordates = "2021-08-02";
                    todates = "2021-09-01";
                    break;
                case "September":
                    fordates = "2021-09-02";
                    todates = "2021-10-01";
                    break;
                case "Octomber":
                    fordates = "2021-10-02";
                    todates = "2021-11-01";
                    break;
                case "November":
                    fordates = "2021-11-02";
                    todates = "2021-12-01";
                    break;
                case "December":
                    fordates = "2021-12-02";
                    todates = "2022-01-01";
                    break;
                default:
                    System.out.print("Date No Switch!");
                    break;
            }

            try {
                String sql = "SELECT * FROM attendance WHERE Date BETWEEN ? AND ? ";
                pst = conn.prepareStatement(sql);
                pst.setString(1, fordates);
                pst.setString(2, todates);
                rs = pst.executeQuery();
                attendance.setModel(DbUtils.resultSetToTableModel(rs));

                System.out.print("Repositary OK !");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }

//    -----------------------------------------------------------------------------------------------------
    //-------
    //-------
    // Periodly salary print
    public void periodly() {

        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        String datefrom = Date_Format.format(jDateChooser1.getDate());
        String dateto = Date_Format.format(jDateChooser2.getDate());
        if (datefrom.equals(null) || dateto.equals(null)) {
            //nothing to do
            System.out.print("Periodly not selected !");
        } else {
            try {
                String sql = "SELECT * FROM attendance WHERE Date BETWEEN ? AND ? ";
                pst = conn.prepareStatement(sql);
                pst.setString(1, datefrom);
                pst.setString(2, dateto);
                rs = pst.executeQuery();
                attendance.setModel(DbUtils.resultSetToTableModel(rs));
                System.out.print("Repositary OK !");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public void clock() {
        new Thread() {
            public void run() {

                while (true) {
                    cal = Calendar.getInstance();
                    clockdate = dateFormat.format(cal.getTime());
                    time.setText("Date : " + clockdate);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }.start();
    }

    public void tableLoad() {

        try {
            String sql = "SELECT * FROM `attendance`";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            attendance.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "TableLoad error :" + e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        monthlycheck = new javax.swing.JCheckBox();
        periodcheck = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SCrol = new javax.swing.JScrollPane();
        attendance = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        processPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(57, 58, 60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 230, 230));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_report_file_96px_2.png"))); // NOI18N
        jLabel2.setText("NSBM");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 110));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 230, 230));
        jLabel3.setText("Payroll System");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 120, 30));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(230, 230, 230));
        jLabel7.setText("Report");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 130, 60));

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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 40, 40));

        jPanel1.setBackground(new java.awt.Color(51, 52, 54));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Periodly", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(153, 153, 153));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        jPanel12.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 30));

        jDateChooser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser2MouseClicked(evt);
            }
        });
        jPanel12.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("To");
        jPanel12.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 45, 20, 30));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 110));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Monthly\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(102, 102, 255));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a month,", "January", "February", "March", "April", "May", "June", "July", "Auguest", "September", "Octomber", "November", "December" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 50));

        monthlycheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        monthlycheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlycheckActionPerformed(evt);
            }
        });
        jPanel1.add(monthlycheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        periodcheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        periodcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodcheckActionPerformed(evt);
            }
        });
        jPanel1.add(periodcheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Print", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(153, 153, 153));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 153, 51));
        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_new_/icons8_printer_60px.png"))); // NOI18N
        jButton3.setToolTipText("Attendance");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 60));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 90));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Generate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(153, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(51, 51, 255));
        jButton5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Generate");
        jButton5.setToolTipText("Print");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 230, 380));

        processPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 720));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time.setBackground(new java.awt.Color(255, 255, 255));
        time.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 140, 40));

        jLabel9.setBackground(new java.awt.Color(153, 153, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Attendance");
        jLabel9.setOpaque(true);
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 740, 40));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(54, 54, 54));
        jLabel26.setText("X");
        jLabel26.setToolTipText("close");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 30, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(54, 54, 54));
        jLabel27.setText("-");
        jLabel27.setToolTipText("minimize");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 30, 30));

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 740, 600));

        SCrol.setBackground(new java.awt.Color(204, 255, 255));
        SCrol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SCrol.setOpaque(false);

        attendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        attendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attendance.setOpaque(false);
        SCrol.setViewportView(attendance);

        jPanel3.add(SCrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 740, 600));

        processPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 800, 720));

        getContentPane().add(processPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        process pg = new process();
        pg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        this.setState(login.ICONIFIED);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jDateChooser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void monthlycheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlycheckActionPerformed
        // TODO add your handling code here:
        if (monthlycheck.isSelected() == true) {
            jComboBox1.setEnabled(true);
            periodcheck.setSelected(false);
            jDateChooser1.setEnabled(false);
            jDateChooser2.setEnabled(false);
        } else if (monthlycheck.isSelected() == false) {
            jComboBox1.setEnabled(false);
        }
        clear();
    }//GEN-LAST:event_monthlycheckActionPerformed

    private void periodcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodcheckActionPerformed
        // TODO add your handling code here:
        if (periodcheck.isSelected() == true) {
            jDateChooser1.setEnabled(true);
            jDateChooser2.setEnabled(true);
            monthlycheck.setSelected(false);
            jComboBox1.setEnabled(false);
        } else if (periodcheck.isSelected() == false) {
            jDateChooser1.setEnabled(false);
            jDateChooser2.setEnabled(false);
        }
        clear();
    }//GEN-LAST:event_periodcheckActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String times = time.getText();
        MessageFormat header = new MessageFormat("Attendance and Leaves Report");
        MessageFormat footer = new MessageFormat(times + "                              "
                + "                                                                "
                + "        " + "~ {0,number,integer} ~");
        try {
            attendance.print(JTable.PrintMode.FIT_WIDTH, header, footer);

        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        monthly();
        periodly();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane SCrol;
    private javax.swing.JTable attendance;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JCheckBox monthlycheck;
    private javax.swing.JCheckBox periodcheck;
    private javax.swing.JPanel processPanel;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
