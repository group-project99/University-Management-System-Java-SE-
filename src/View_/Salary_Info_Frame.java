/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_;

import View_Guest.*;
import Utility.DBConnection;
import View_.attendance;
import View_.subInterf.Excel_Genarated_Success;
import View_.subInterf.PDF_Genarated_Success;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.JFileChooser;

/**
 *
 * @author MY_PC
 */
public class Salary_Info_Frame extends javax.swing.JFrame {

    Connection conn = DBConnection.getConnection();
    PreparedStatement pst = null;
    ResultSet rs = null;

    //Date
    Calendar cal = Calendar.getInstance();
    Calendar cal2 = new GregorianCalendar();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String clockdate = null;

    salary_Table st = new salary_Table();
    PDF_Genarated_Success pp = new PDF_Genarated_Success();

    public Salary_Info_Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        clock();

        jComboBox1.setEnabled(false);
        jDateChooser1.setEnabled(false);
        jDateChooser2.setEnabled(false);

// end of constructor
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
                String sql = "SELECT * FROM salary WHERE Date BETWEEN ? AND ? ";
                pst = conn.prepareStatement(sql);
                pst.setString(1, fordates);
                pst.setString(2, todates);
                rs = pst.executeQuery();
                st.setVisible(true);
                st.salTable.setModel(DbUtils.resultSetToTableModel(rs));

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
                String sql = "SELECT * FROM salary WHERE Date BETWEEN ? AND ? ";
                pst = conn.prepareStatement(sql);
                pst.setString(1, datefrom);
                pst.setString(2, dateto);
                rs = pst.executeQuery();
                st.setVisible(true);
                st.salTable.setModel(DbUtils.resultSetToTableModel(rs));

                System.out.print("Repositary OK !");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

//Date Generater
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

    public void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        periodcheck = new javax.swing.JCheckBox();
        monthlycheck = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        printS1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        printS6 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        printS5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 52, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 230, 230));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_new_/icons8_tips_127px_1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 140, 110));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(230, 230, 230));
        jLabel7.setText("Salary.Info");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 190, 60));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("-");
        jLabel22.setToolTipText("minimize");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 30, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("X");
        jLabel23.setToolTipText("close");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 30, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(230, 230, 230));
        jLabel9.setText("Student.Pay.Mgt System");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 170, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 300));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBackground(new java.awt.Color(250, 250, 250));
        jTabbedPane2.setForeground(new java.awt.Color(60, 62, 63));
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane2.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jTabbedPane2.setOpaque(true);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 185));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Monthly", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(102, 102, 255));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a month,", "January", "February", "March", "April", "May", "June", "July", "Auguest", "September", "Octomber", "November", "December" }));
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
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 320, 30));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 380, 90));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Periodly", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("To");
        jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));
        jPanel12.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 140, 30));
        jPanel12.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 30));

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 380, 90));

        periodcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodcheckActionPerformed(evt);
            }
        });
        jPanel5.add(periodcheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        monthlycheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlycheckActionPerformed(evt);
            }
        });
        jPanel5.add(monthlycheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 270));

        jTabbedPane2.addTab("SESSIONS", jPanel6);

        jPanel8.setBackground(new java.awt.Color(252, 212, 252));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(158, 158, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(133, 133, 235));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Show Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printS1.setBackground(new java.awt.Color(153, 255, 204));
        printS1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        printS1.setForeground(new java.awt.Color(204, 204, 204));
        printS1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_new_/icons8_cells_124px.png"))); // NOI18N
        printS1.setToolTipText("Show Salary Info");
        printS1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printS1ActionPerformed(evt);
            }
        });
        jPanel13.add(printS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 130, 130));

        jPanel7.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 290, 170));

        jPanel8.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 270));

        jTabbedPane2.addTab("SHOW TABLE", jPanel8);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(186, 235, 184));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(204, 255, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "\nEXCEL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11), new java.awt.Color(0, 204, 51))); // NOI18N
        jPanel15.setToolTipText("");
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printS6.setBackground(new java.awt.Color(102, 255, 102));
        printS6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        printS6.setForeground(new java.awt.Color(204, 204, 204));
        printS6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_new_/icons8_microsoft_excel_120px.png"))); // NOI18N
        printS6.setToolTipText("Excel Sheet");
        printS6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printS6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printS6ActionPerformed(evt);
            }
        });
        jPanel15.add(printS6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 120));

        jPanel11.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 150, 170));

        jPanel14.setBackground(new java.awt.Color(204, 255, 204));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PDF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel14.setToolTipText("");
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printS5.setBackground(new java.awt.Color(255, 204, 153));
        printS5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        printS5.setForeground(new java.awt.Color(204, 204, 204));
        printS5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_new_/icons8_pdf_120px.png"))); // NOI18N
        printS5.setToolTipText("PDF");
        printS5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printS5ActionPerformed(evt);
            }
        });
        jPanel14.add(printS5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 120));

        jPanel11.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 150, 170));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 270));

        jTabbedPane2.addTab("PRINT", jPanel1);

        jPanel3.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_back_arrow_50px.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 50, -1));

        time.setBackground(new java.awt.Color(51, 51, 51));
        time.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 140, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1090, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        this.setState(Salary_Info_Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        salaryCalc studentPaymentForm = new salaryCalc();
        studentPaymentForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void printS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printS5ActionPerformed
        // TODO add your handling code here:

        String times = time.getText();
        MessageFormat header = new MessageFormat("Salary Information Report");
        MessageFormat footer = new MessageFormat(times + "                              "
            + "                                                                "
            + "        " + "~ {0,number,integer} ~");
        try {
            st.salTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);

        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_printS5ActionPerformed

    private void printS6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printS6ActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();

            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + ".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("customer");

                Row rowCol = sheet.createRow(0);
                for (int i = 0; i < st.salTable.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(st.salTable.getColumnName(i));
                }

                for (int j = 0; j < st.salTable.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 1);
                    for (int k = 0; k < st.salTable.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (st.salTable.getValueAt(j, k) != null) {
                            cell.setCellValue(st.salTable.getValueAt(j, k).toString());
                        }
                    }
                }

                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                out.close();
                openFile(saveFile.toString());
                Excel_Genarated_Success ex = new Excel_Genarated_Success();
                ex.setVisible(true);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException io) {
            System.out.println(io);
        }
    }//GEN-LAST:event_printS6ActionPerformed

    private void printS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printS1ActionPerformed
        // TODO add your handling code here:

        monthly();
        periodly();
    }//GEN-LAST:event_printS1ActionPerformed

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

    private void jDateChooser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MouseClicked

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MouseClicked

    public void setColor(JPanel panel) {

        panel.setBackground(new java.awt.Color(102, 102, 102));
    }

    public void resetColor(JPanel panel) {

        panel.setBackground(new java.awt.Color(255, 204, 204));

    }

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
            java.util.logging.Logger.getLogger(Salary_Info_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salary_Info_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salary_Info_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salary_Info_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Salary_Info_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JCheckBox monthlycheck;
    private javax.swing.JCheckBox periodcheck;
    private javax.swing.JButton printS1;
    private javax.swing.JButton printS5;
    private javax.swing.JButton printS6;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
