/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_;

import Entity_.Employee;
import Entity_.User;
import com.barcodelib.barcode.Linear;
import Service_.EmployeeService;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class registration extends javax.swing.JFrame {

    User u;
    Employee emp;
    EmployeeService empSrv = new EmployeeService();
    String gender = null;
    String filename = null;
    byte[] personimage = null;
    byte[] barcodeimage = null;
    SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
    boolean choice;
    String lablePass;
    String fname;
    String barcodepath = "C:\\Users\\MY_PC\\Documents\\NetBeansProjects\\EMP_Mgt_System\\Barcode\\Employee\\";

    public registration() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel3.setVisible(true);
        lblResetColor(staffLbl);
        lblResetColor(lectureLbl);
        sdisable();

    }

    //All the Text Fields andd Buttons Enable - False
    public void sdisable() {//---------------
        id.setEditable(false);
        firstname.setEnabled(false);
        lastname.setEnabled(false);
        dob.setEnabled(false);
        nationalid.setEnabled(false);
        radiomale.setEnabled(false);
        radiofemale.setEnabled(false);
        tp.setEnabled(false);
        email.setEnabled(false);
        adline1.setEnabled(false);
        adline2.setEnabled(false);
        postcode.setEnabled(false);
        department.setEnabled(false);
        designation.setEnabled(false);
        datehired.setEnabled(false);
        basicsalary.setEnabled(false);
    }

    //All the Text Fields andd Buttons Enable - TRUE
    public void ssenable() {
        id.setEditable(true);
        firstname.setEnabled(true);
        lastname.setEnabled(true);
        dob.setEnabled(true);
        nationalid.setEnabled(true);
        radiomale.setEnabled(true);
        radiofemale.setEnabled(true);
        tp.setEnabled(true);
        email.setEnabled(true);
        adline1.setEnabled(true);
        adline2.setEnabled(true);
        postcode.setEnabled(true);
        department.setEnabled(true);
        designation.setEnabled(true);
        datehired.setEnabled(true);
        basicsalary.setEnabled(true);
    }

    //Clear All the Text Fields
    public void clear() {
        firstname.setText("");
        lastname.setText("");
        dob.setCalendar(null);
        nationalid.setText("");
        radiomale.setSelected(false);
        radiofemale.setSelected(false);
        tp.setText("");
        email.setText("");
        adline1.setText("");
        adline2.setText("");
        postcode.setText("");
        department.setSelectedIndex(0);
        designation.setSelectedIndex(0);
        datehired.setCalendar(null);
        basicsalary.setSelectedIndex(0);
        imageLbl.setIcon(null);
        firstname.requestFocus();
    }

    //Get the next id from relevent table
    public void nextId() {
        if (choice) {
            empSrv.nextId(emp, "staff");
            id.setText("E" + String.valueOf(emp.getId() + 1));
        } else {
            empSrv.nextId(emp, "lecturer");
            id.setText("L" + String.valueOf(emp.getId() + 1));
        }
        try {

            Linear barcode = new Linear();
            barcode.setType(Linear.CODE128B);
            barcode.setData(id.getText());
            barcode.setI(11.0f);
            barcode.renderBarcode(barcodepath + id.getText() + ".png");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        registrationPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        nationalid = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        tp = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        email = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        adline1 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        adline2 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        firstname = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        lastname = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        postcode = new javax.swing.JTextField();
        datehired = new com.toedter.calendar.JDateChooser();
        dob = new com.toedter.calendar.JDateChooser();
        basicsalary = new javax.swing.JComboBox<>();
        department = new javax.swing.JComboBox<>();
        designation = new javax.swing.JComboBox<>();
        radiofemale = new javax.swing.JRadioButton();
        radiomale = new javax.swing.JRadioButton();
        imageLbl = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        pictureBrowse = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        id = new javax.swing.JTextField();
        idlabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lectureLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        staffLbl = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 52, 54));
        jLabel6.setText("First Name");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 79, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 52, 54));
        jLabel8.setText("Last Name");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 79, 14));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 52, 54));
        jLabel9.setText("Date Of Birth");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 90, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 52, 54));
        jLabel10.setText("National ID");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 79, 14));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 52, 54));
        jLabel11.setText("Gender");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 60, 14));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 52, 54));
        jLabel12.setText("Telephone");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 79, 14));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 52, 54));
        jLabel13.setText("E-mail");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 79, 14));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 52, 54));
        jLabel14.setText("Address Line 1");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 110, 14));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Address Line 2");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 110, 14));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 52, 54));
        jLabel16.setText("Post Code");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 80, 14));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 52, 54));
        jLabel20.setText("Department");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 90, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 52, 54));
        jLabel21.setText("Designation");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 90, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 52, 54));
        jLabel23.setText("Date Hired");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 90, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 52, 54));
        jLabel24.setText("Basic Salary");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 90, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 200, 10));

        nationalid.setBackground(new java.awt.Color(250, 250, 250));
        nationalid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nationalid.setText("992323124v");
        nationalid.setBorder(null);
        nationalid.setOpaque(false);
        jPanel3.add(nationalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 200, 30));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 200, 10));

        tp.setBackground(new java.awt.Color(250, 250, 250));
        tp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tp.setText("0778956123");
        tp.setBorder(null);
        tp.setOpaque(false);
        jPanel3.add(tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 200, 30));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 200, 10));

        email.setBackground(new java.awt.Color(250, 250, 250));
        email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        email.setText("abc@gmail.com");
        email.setBorder(null);
        email.setOpaque(false);
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 200, 30));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 200, 10));

        adline1.setBackground(new java.awt.Color(250, 250, 250));
        adline1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        adline1.setText("Vetangod");
        adline1.setBorder(null);
        adline1.setOpaque(false);
        jPanel3.add(adline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 200, 30));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 200, 10));

        adline2.setBackground(new java.awt.Color(250, 250, 250));
        adline2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        adline2.setText("Veyangoda");
        adline2.setBorder(null);
        adline2.setOpaque(false);
        jPanel3.add(adline2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 200, 30));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 200, 10));

        firstname.setBackground(new java.awt.Color(250, 250, 250));
        firstname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstname.setText("Kasun");
        firstname.setBorder(null);
        firstname.setOpaque(false);
        jPanel3.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 200, 30));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 200, 10));

        lastname.setBackground(new java.awt.Color(250, 250, 250));
        lastname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastname.setText("Sandeepa");
        lastname.setBorder(null);
        lastname.setOpaque(false);
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel3.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 200, 30));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 200, 10));

        postcode.setBackground(new java.awt.Color(250, 250, 250));
        postcode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        postcode.setText("51");
        postcode.setBorder(null);
        postcode.setOpaque(false);
        jPanel3.add(postcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 200, 30));
        jPanel3.add(datehired, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 200, -1));
        jPanel3.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 200, -1));

        basicsalary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "15000", "25000", "45000", "55000" }));
        basicsalary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(basicsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 200, 30));

        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Information Technology", "Civil Engineering", "Mechanical Engineering", "Quantity Surveying", "Accounting & Finance", "Business Analytics", "Marketing Management", " " }));
        department.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 200, 30));

        designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Supervisor", "Administrator", "Clerk", "Accountant", "Lecturer", " " }));
        designation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 200, 30));

        buttonGroup1.add(radiofemale);
        radiofemale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radiofemale.setText("female");
        radiofemale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radiofemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiofemaleActionPerformed(evt);
            }
        });
        jPanel3.add(radiofemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        buttonGroup1.add(radiomale);
        radiomale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radiomale.setText("male");
        radiomale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radiomale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiomaleActionPerformed(evt);
            }
        });
        jPanel3.add(radiomale, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        imageLbl.setBackground(new java.awt.Color(255, 255, 255));
        imageLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(imageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 160, 140));

        addButton.setBackground(new java.awt.Color(69, 70, 71));
        addButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add Record");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 160, 40));

        clearButton.setBackground(new java.awt.Color(69, 70, 71));
        clearButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel3.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 160, 40));

        pictureBrowse.setBackground(new java.awt.Color(69, 70, 71));
        pictureBrowse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pictureBrowse.setForeground(new java.awt.Color(255, 255, 255));
        pictureBrowse.setText(" Attach Image");
        pictureBrowse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pictureBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pictureBrowseActionPerformed(evt);
            }
        });
        jPanel3.add(pictureBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 160, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_back_arrow_50px.png"))); // NOI18N
        jLabel22.setToolTipText(" Back");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 420, 50, 40));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 200, 10));

        id.setBackground(new java.awt.Color(250, 250, 250));
        id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        id.setBorder(null);
        id.setOpaque(false);
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 200, 30));

        idlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idlabel.setForeground(new java.awt.Color(51, 52, 54));
        idlabel.setText("Employee ID");
        jPanel3.add(idlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 90, -1));

        registrationPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1100, 470));

        jPanel2.setBackground(new java.awt.Color(51, 52, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 230, 230));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_shared_document_96px.png"))); // NOI18N
        jLabel2.setText("NSBM");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 100, 110));

        lectureLbl.setBackground(new java.awt.Color(51, 52, 54));
        lectureLbl.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lectureLbl.setForeground(new java.awt.Color(230, 230, 230));
        lectureLbl.setText("Lectures");
        lectureLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lectureLbl.setOpaque(true);
        lectureLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lectureLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lectureLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lectureLblMouseExited(evt);
            }
        });
        jPanel2.add(lectureLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 210, 30));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(230, 230, 230));
        jLabel7.setText("Emp.Registration");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 300, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(230, 230, 230));
        jLabel4.setText("Payroll System");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 120, 40));

        staffLbl.setBackground(new java.awt.Color(73, 74, 75));
        staffLbl.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        staffLbl.setForeground(new java.awt.Color(230, 230, 230));
        staffLbl.setText("Staffs");
        staffLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        staffLbl.setOpaque(true);
        staffLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                staffLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                staffLblMouseExited(evt);
            }
        });
        jPanel2.add(staffLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 210, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("X");
        jLabel26.setToolTipText("close");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 30, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("-");
        jLabel27.setToolTipText("minimize");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 30, 30));

        registrationPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 260));

        getContentPane().add(registrationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        try {
            filename = barcodepath + id.getText() + ".png";
            File img = new File(filename);
            FileInputStream fis = new FileInputStream(img);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {

                bos.write(buf, 0, readNum);
            }
            barcodeimage = bos.toByteArray();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        
        
        emp = new Employee();
        emp.setFirstname(firstname.getText());
        emp.setLastname(lastname.getText());
        if (dob.getDate() == null) {
            emp.setDob("");
        } else {
            emp.setDob(dateformat.format(dob.getDate()));
        }
        emp.setNationlid(nationalid.getText());
        emp.setGender(gender);
        emp.setEmail(email.getText());
        emp.setTp(tp.getText());
        emp.setAdline1(adline1.getText());
        emp.setAdline2(adline2.getText());
        emp.setPostcode(postcode.getText());
        emp.setDepartment(department.getSelectedItem().toString());
        emp.setDesignation(designation.getSelectedItem().toString());
        if (datehired.getDate() == null) {
            emp.setDob("");
        } else {
            emp.setDatehired(dateformat.format(datehired.getDate()));
        }

        emp.setBasicsalary(basicsalary.getSelectedItem().toString());
        emp.setImagepath(filename);
        emp.setImage(personimage);
        emp.setBarcode(barcodeimage);

        if (choice) //check whether staff or lecturere
        {
            emp.setIssuedid(id.getText());
            empSrv.save(emp, "staff");
        } else {
            emp.setIssuedid(id.getText());
            empSrv.save(emp, "lecturer");
        }
        
        nextId();//call nextId method

        if (!emp.getEmail().equals("") && !emp.getFirstname().equals("")) //If there is no error call the clear method
        {
            clear();
        }


    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void pictureBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pictureBrowseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home") + System.getProperty("file.separator") + "Music"));
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(imageLbl.getWidth(), imageLbl.getHeight(), Image.SCALE_DEFAULT));
        imageLbl.setIcon(imageIcon);

        try {

            File img = new File(filename);
            FileInputStream fis = new FileInputStream(img);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {

                bos.write(buf, 0, readNum);
            }

            personimage = bos.toByteArray();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_pictureBrowseActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked

        PayrollMain mainobj = new PayrollMain();
        mainobj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked

        this.setState(login.ICONIFIED);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void staffLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffLblMouseClicked
        emp = new Employee();
        lblSetColor(staffLbl);
        lblResetColor(lectureLbl);
        ssenable();
        department.setSelectedIndex(8);
        department.setEnabled(false);
        idlabel.setText("Staff ID");
        choice = true;
        nextId();//call nextId method
    }//GEN-LAST:event_staffLblMouseClicked

    private void lectureLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lectureLblMouseClicked
        emp = new Employee();
        lblSetColor(lectureLbl);
        lblResetColor(staffLbl);
        ssenable();
        idlabel.setText("Lecturer ID");
        choice = false;
        designation.setSelectedIndex(5);
        designation.setEnabled(false);
        nextId();//call nextId method
    }//GEN-LAST:event_lectureLblMouseClicked

    private void radiomaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiomaleActionPerformed
        gender = "Male";
        radiomale.setSelected(true);
        radiofemale.setSelected(false);
    }//GEN-LAST:event_radiomaleActionPerformed

    private void radiofemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiofemaleActionPerformed
        gender = "Female";
        radiofemale.setSelected(true);
        radiomale.setSelected(false);
    }//GEN-LAST:event_radiofemaleActionPerformed

    private void staffLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffLblMouseEntered
        //lblSetColor(staffLbl);
    }//GEN-LAST:event_staffLblMouseEntered

    private void staffLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffLblMouseExited
        //lblResetColor(staffLbl);
    }//GEN-LAST:event_staffLblMouseExited

    private void lectureLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lectureLblMouseEntered
        //lblSetColor(lectureLbl);
    }//GEN-LAST:event_lectureLblMouseEntered

    private void lectureLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lectureLblMouseExited
        //lblResetColor(lectureLbl);
    }//GEN-LAST:event_lectureLblMouseExited

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    public void lblSetColor(JLabel lable) {

        lable.setBackground(new java.awt.Color(73, 74, 75));

    }

    public void lblResetColor(JLabel lable) {

        lable.setBackground(new java.awt.Color(51, 52, 54));

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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField adline1;
    private javax.swing.JTextField adline2;
    private javax.swing.JComboBox<String> basicsalary;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton clearButton;
    private com.toedter.calendar.JDateChooser datehired;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JComboBox<String> designation;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField id;
    private javax.swing.JLabel idlabel;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel lectureLbl;
    private javax.swing.JTextField nationalid;
    private javax.swing.JButton pictureBrowse;
    private javax.swing.JTextField postcode;
    private javax.swing.JRadioButton radiofemale;
    private javax.swing.JRadioButton radiomale;
    private javax.swing.JPanel registrationPanel;
    private javax.swing.JLabel staffLbl;
    private javax.swing.JTextField tp;
    // End of variables declaration//GEN-END:variables
}
