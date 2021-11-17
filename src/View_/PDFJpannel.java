/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_;

import Entity_.jReportEntity;
import Service_.jReportService;
import View_.subInterf.PDF_Genarated_Success;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MY_PC
 */
public class PDFJpannel extends javax.swing.JFrame {

    
    jReportEntity jre = new jReportEntity();
    jReportService jrs = new jReportService();

    Calendar cal = Calendar.getInstance();
    Calendar cal2 = new GregorianCalendar();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String clockdate = null;
    
    public PDFJpannel() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        clock();

    }
    
    public void clock() {
        new Thread() {
            public void run() {

                while (true) {
                    cal = Calendar.getInstance();
                    clockdate = dateFormat.format(cal.getTime());
                    time.setText("Date : "+clockdate);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(attendance.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }.start();
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TOTDED = new javax.swing.JLabel();
        empEpf = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        nametxt = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TOTD = new javax.swing.JLabel();
        bankAcc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deductions = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        earnings = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        no_of_days = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        present_days = new javax.swing.JLabel();
        leaves = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        empidtxt = new javax.swing.JLabel();
        desigtxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        GROSSSALARY = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        NETSAL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(57, 58, 60));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_new_/icons8_print_36px_1.png"))); // NOI18N
        jButton3.setToolTipText("Print");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, 40));

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_new_/icons8_close_window_36px_1.png"))); // NOI18N
        jButton4.setToolTipText("Close");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 40));

        jPanel9.setBackground(new java.awt.Color(51, 52, 54));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 90, 170));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 480));

        jPanel10.setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("DESIGNATION : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_new_/ireport.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 50));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel3.setText("ETF");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 100, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("BANK ACC:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 70, 40));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setText("NAME : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel7.setText("DEDUCTIONS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 90, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 100, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel9.setText("EPF");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 100, 20));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("EMPLOYER");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 100, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel13.setText("EPF");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 100, 20));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setText("EMPLOYEE");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 100, 30));

        TOTDED.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        TOTDED.setText("TOTAL DEDUCTIONS: ");
        jPanel1.add(TOTDED, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, 30));

        empEpf.setBackground(new java.awt.Color(255, 255, 255));
        empEpf.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        empEpf.setOpaque(true);
        jPanel1.add(empEpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 100, 30));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel23.setText("EARNINGS");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 70, 40));

        nametxt.setBackground(new java.awt.Color(255, 255, 255));
        nametxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 250, 30));

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 20, 250));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 20, 290));

        jSeparator10.setBackground(new java.awt.Color(204, 255, 255));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 650, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 430, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 20, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 100, 10));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 650, 20));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 20, 290));

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 20, 290));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 430, 10));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel30.setOpaque(true);
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 100, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel11.setText("EMPLOYEE NO : ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 30));

        TOTD.setBackground(new java.awt.Color(255, 255, 255));
        TOTD.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        TOTD.setOpaque(true);
        jPanel1.add(TOTD, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 90, 30));

        bankAcc.setBackground(new java.awt.Color(255, 255, 255));
        bankAcc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        bankAcc.setOpaque(true);
        jPanel1.add(bankAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 350, 40));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        deductions.setEditable(false);
        deductions.setColumns(20);
        deductions.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        deductions.setRows(5);
        jScrollPane1.setViewportView(deductions);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 210, 210));

        earnings.setEditable(false);
        earnings.setColumns(20);
        earnings.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        earnings.setRows(5);
        jScrollPane2.setViewportView(earnings);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 220, 210));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 120, 300));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 10, 300));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel28.setText("No.of Days");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 70, 20));

        no_of_days.setBackground(new java.awt.Color(255, 255, 255));
        no_of_days.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no_of_days.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        no_of_days.setOpaque(true);
        jPanel2.add(no_of_days, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 90, 30));

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel29.setText("Present Days");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 90, 20));

        present_days.setBackground(new java.awt.Color(255, 255, 255));
        present_days.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        present_days.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        present_days.setOpaque(true);
        jPanel2.add(present_days, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 90, 30));

        leaves.setBackground(new java.awt.Color(255, 255, 255));
        leaves.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        leaves.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        leaves.setOpaque(true);
        jPanel2.add(leaves, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 90, 30));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel21.setText("Leaves");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 60, 20));

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel31.setOpaque(true);
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 90, 20));

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel32.setOpaque(true);
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 90, 20));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel24.setOpaque(true);
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 90, 20));

        time.setBackground(new java.awt.Color(255, 255, 255));
        time.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jPanel2.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 140, 30));

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel25.setText("Leaves");
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel25.setOpaque(true);
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 90, 20));

        empidtxt.setBackground(new java.awt.Color(255, 255, 255));
        empidtxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel2.add(empidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 210, 30));

        desigtxt.setBackground(new java.awt.Color(255, 255, 255));
        desigtxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel2.add(desigtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 220, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Pitipana - Thalagala Rd, Homagama 10200");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 250, 30));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel22.setText("CAMPPUS PRIVATE INSTITUTE");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 280, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 160));

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 650, 10));

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel18.setText("GROSS SALARY:");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        GROSSSALARY.setBackground(new java.awt.Color(255, 255, 255));
        GROSSSALARY.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel7.add(GROSSSALARY, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 110, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 220, 30));

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setText("NET SALARY:");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        NETSAL.setBackground(new java.awt.Color(255, 255, 255));
        NETSAL.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel8.add(NETSAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 130, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 220, 30));

        jPanel10.add(jPanel1);

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 800, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Data");

        job.setPrintable(new Printable() {
            public int print(Graphics pg, PageFormat pf, int pageNum) {
                pf.setOrientation(PageFormat.LANDSCAPE);
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D) pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.765,0.75);

                jPanel10.print(g2);

                return Printable.PAGE_EXISTS;

            }
        });
        boolean ok = job.printDialog();
        if (ok) {
            try {

                job.print();
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

//        PrinterJob job = PrinterJob.getPrinterJob();
//            job.setJobName("Print Data");
//            
//            job.setPrintable(new Printable(){
//            public int print(Graphics pg,PageFormat pf, int pageNum){
//                    pf.setOrientation(PageFormat.LANDSCAPE);
//                 if(pageNum>0){
//                    return Printable.NO_SUCH_PAGE;
//                }
//                
//                Graphics2D g2 = (Graphics2D)pg;
//                g2.translate(pf.getImageableX(), pf.getImageableY());
//                g2.scale(0.45,0.55);
//                
//                jPanel1.paint(g2);
//          
//               
//                return Printable.PAGE_EXISTS;
//                         
//                
//                 }
//             }
//         );
//         
//        boolean ok = job.printDialog();
//        if(ok){
//        try{
//            
//        job.print();
//        }
//        catch (PrinterException ex){}
//        JOptionPane.showMessageDialog(null,"Report Generated");
//        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(PDFJpannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDFJpannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDFJpannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDFJpannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDFJpannel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel GROSSSALARY;
    public javax.swing.JLabel NETSAL;
    public javax.swing.JLabel TOTD;
    private javax.swing.JLabel TOTDED;
    public javax.swing.JLabel bankAcc;
    public javax.swing.JTextArea deductions;
    public javax.swing.JLabel desigtxt;
    public javax.swing.JTextArea earnings;
    public javax.swing.JLabel empEpf;
    public javax.swing.JLabel empidtxt;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JLabel leaves;
    public javax.swing.JLabel nametxt;
    public javax.swing.JLabel no_of_days;
    public javax.swing.JLabel present_days;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
