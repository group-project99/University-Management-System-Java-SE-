/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_;

import Entity_.Employee;
import Entity_.User;
import Service_.EmployeeService;
import View_.subInterf.searchFail;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author MY_PC
 */
public class search extends javax.swing.JFrame {

    User u;
    Employee emp;
    private EmployeeService empSrv = new EmployeeService();
    String gender = null;
    String filename = null;
    byte[] personimage = null;
    SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
    boolean choice;

    public search() {
        initComponents();
        this.setLocationRelativeTo(null);
        srcBtn.requestFocus();
        lblResetColor(staffLbl);
        lblResetColor(lectureLbl);
        id.setEditable(false);
        sdisable();
        search.requestFocus();
        srcBtn.setEnabled(false);

    }

    //All the Text Fields andd Buttons Enable - False
    public void sdisable() {

        id.setEnabled(false);
        image.setEnabled(false);
        pictureBrowse.setEnabled(false);
        updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        
        basicsalary.setEnabled(false);
        datehired.setEnabled(false);
        designation.setEnabled(false);
        department.setEnabled(false);
        postcode.setEnabled(false);
        adline2.setEnabled(false);
        adline1.setEnabled(false);
        email.setEnabled(false);
        tp.setEnabled(false);
        radiomale.setEnabled(false);
        radiofemale.setEnabled(false);
        nationalid.setEnabled(false);
        dob.setEnabled(false);
        lastname.setEnabled(false);
        firstname.setEnabled(false);

    }

    //All the Text Fields andd Buttons Enable - TRUE
    public void senable() {

        id.setEnabled(true);
        image.setEnabled(true);
        pictureBrowse.setEnabled(true);
        updateBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        
        basicsalary.setEnabled(true);
        datehired.setEnabled(true);
        designation.setEnabled(true);
        department.setEnabled(true);
        postcode.setEnabled(true);
        adline2.setEnabled(true);
        adline1.setEnabled(true);
        email.setEnabled(true);
        tp.setEnabled(true);
        radiomale.setEnabled(true);
        radiofemale.setEnabled(true);
        nationalid.setEnabled(true);
        dob.setEnabled(true);
        lastname.setEnabled(true);
        firstname.setEnabled(true);
        srcBtn.setEnabled(true);
    }

    //Clear All the Text Fields
    public void clear() {
        
        search.setText("");
        id.setText("");
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
        image.setIcon(null);
        search.requestFocus();
        
        
    }

    public void delete() {
        emp = new Employee();
        emp.setId(Integer.parseInt(String.valueOf(id.getText().charAt(1))));

        if (choice) {
            empSrv.delete(emp, "staff");
        } else {
            empSrv.delete(emp, "lecturer");
        }

        clear();
    }

    public void update() {
        if (radiomale.isSelected()) {
            gender = "Male";
        } else if (radiofemale.isSelected()) {
            gender = "Female";
        }
        emp = new Employee();
        emp.setId(Integer.parseInt(String.valueOf(id.getText().charAt(1))));
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
        //emp.setImage(personimage);

        if (choice) {
            empSrv.update(emp, "staff");
        } else {
            empSrv.update(emp, "lecturer");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        searchPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lectureLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        staffLbl = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        srcBtn = new javax.swing.JButton();
        var = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        idlabel = new javax.swing.JLabel();
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
        jSeparator1 = new javax.swing.JSeparator();
        id = new javax.swing.JTextField();
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
        image = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        pictureBrowse = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        clearButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 52, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 230, 230));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_search_client_96px.png"))); // NOI18N
        jLabel2.setText("NSBM");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, 90));

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
        jPanel2.add(lectureLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 210, 30));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(230, 230, 230));
        jLabel7.setText("Emp.Search");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 220, 60));

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
        jPanel2.add(staffLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 210, 30));

        search.setBackground(new java.awt.Color(51, 52, 54));
        search.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(240, 240, 240));
        search.setBorder(null);
        search.setOpaque(false);
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 250, 40));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 280, 20));

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

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("X");
        jLabel25.setToolTipText("close");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 30, 30));

        srcBtn.setBackground(new java.awt.Color(51, 52, 54));
        srcBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        srcBtn.setForeground(new java.awt.Color(51, 52, 54));
        srcBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_search_30px.png"))); // NOI18N
        srcBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        srcBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        srcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcBtnActionPerformed(evt);
            }
        });
        jPanel2.add(srcBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 50, 40));

        var.setBackground(new java.awt.Color(51, 52, 54));
        var.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        var.setForeground(new java.awt.Color(255, 255, 255));
        var.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        var.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(var, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 30, 40));

        searchPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 260));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idlabel.setForeground(new java.awt.Color(51, 52, 54));
        idlabel.setText("ID");
        jPanel3.add(idlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 52, 54));
        jLabel6.setText("First Name");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 79, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 52, 54));
        jLabel8.setText("Last Name");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 79, 14));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 52, 54));
        jLabel9.setText("Date Of Birth");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 180, 90, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 52, 54));
        jLabel10.setText("National ID");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 79, 14));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 52, 54));
        jLabel11.setText("Gender");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 60, 14));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 52, 54));
        jLabel12.setText("Telephone");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 79, 14));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 52, 54));
        jLabel13.setText("E-mail");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 79, 14));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 52, 54));
        jLabel14.setText("Address Line 1");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 110, 14));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Address Line 2");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 110, 14));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 52, 54));
        jLabel16.setText("Post Code");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 80, 14));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 52, 54));
        jLabel20.setText("Department");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 90, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 52, 54));
        jLabel21.setText("Designation");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 90, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 52, 54));
        jLabel23.setText("Date Hire");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 90, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 52, 54));
        jLabel24.setText("Basic Salary");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 90, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 200, 10));

        id.setBackground(new java.awt.Color(250, 250, 250));
        id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        id.setBorder(null);
        id.setOpaque(false);
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 200, 30));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 200, 10));

        nationalid.setBackground(new java.awt.Color(250, 250, 250));
        nationalid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nationalid.setBorder(null);
        nationalid.setOpaque(false);
        jPanel3.add(nationalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 200, 30));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 200, 10));

        tp.setBackground(new java.awt.Color(250, 250, 250));
        tp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tp.setBorder(null);
        tp.setOpaque(false);
        jPanel3.add(tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 200, 30));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 200, 10));

        email.setBackground(new java.awt.Color(250, 250, 250));
        email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        email.setBorder(null);
        email.setOpaque(false);
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 200, 30));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 200, 10));

        adline1.setBackground(new java.awt.Color(250, 250, 250));
        adline1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        adline1.setBorder(null);
        adline1.setOpaque(false);
        jPanel3.add(adline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 200, 30));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 200, 10));

        adline2.setBackground(new java.awt.Color(250, 250, 250));
        adline2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        adline2.setBorder(null);
        adline2.setOpaque(false);
        jPanel3.add(adline2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 200, 30));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 200, 10));

        firstname.setBackground(new java.awt.Color(250, 250, 250));
        firstname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstname.setBorder(null);
        firstname.setOpaque(false);
        jPanel3.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 200, 30));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 200, 10));

        lastname.setBackground(new java.awt.Color(250, 250, 250));
        lastname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastname.setBorder(null);
        lastname.setOpaque(false);
        jPanel3.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 200, 30));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 200, 10));

        postcode.setBackground(new java.awt.Color(250, 250, 250));
        postcode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        postcode.setBorder(null);
        postcode.setOpaque(false);
        jPanel3.add(postcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 200, 30));
        jPanel3.add(datehired, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 200, -1));
        jPanel3.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 200, -1));

        basicsalary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "15000", "25000", "45000", "55000" }));
        basicsalary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(basicsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 200, 30));

        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Information Technology", "Civil Engineering", "Mechanical Engineering", "Quantity Surveying", "Accounting & Finance", "Business Analytics", "Marketing Management", " " }));
        department.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 200, 30));

        designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Supervisor", "Administrator", "Clerk", "Accountant", "Lecturer", " ", " " }));
        designation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 200, 30));

        buttonGroup1.add(radiofemale);
        radiofemale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radiofemale.setText("female");
        radiofemale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radiofemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiofemaleActionPerformed(evt);
            }
        });
        jPanel3.add(radiofemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        buttonGroup1.add(radiomale);
        radiomale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radiomale.setText("male");
        radiomale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radiomale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiomaleActionPerformed(evt);
            }
        });
        jPanel3.add(radiomale, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        image.setBackground(new java.awt.Color(255, 255, 255));
        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 160, 160));

        updateBtn.setBackground(new java.awt.Color(69, 70, 71));
        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update Record");
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel3.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, 160, 40));

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
        jPanel3.add(pictureBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, 160, 40));

        deleteBtn.setBackground(new java.awt.Color(69, 70, 71));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete Record");
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel3.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, 160, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_back_arrow_50px.png"))); // NOI18N
        jLabel3.setToolTipText(" Back");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 430, 50, 40));

        clearButton1.setBackground(new java.awt.Color(69, 70, 71));
        clearButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearButton1.setForeground(new java.awt.Color(255, 255, 255));
        clearButton1.setText("Clear");
        clearButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(clearButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, 160, 40));

        searchPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1090, 480));

        getContentPane().add(searchPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        //ask_update updateobj = new ask_update();
        //updateobj.setVisible(true);

        int check = JOptionPane.showConfirmDialog(null, "Are you sure you want to update record?", "Update", JOptionPane.YES_NO_OPTION);

        //update();
        if (check == 0) {
            update();
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    private void pictureBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pictureBrowseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_DEFAULT));
        image.setIcon(imageIcon);

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

    private void staffLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffLblMouseClicked
        // TODO add your handling code here:
        lblSetColor(staffLbl);
        lblResetColor(lectureLbl);
        senable();
        var.setText("E");
        department.setSelectedIndex(8);
        department.setEnabled(false);
        idlabel.setText("Staff ID");
        choice = true;
        clear();

    }//GEN-LAST:event_staffLblMouseClicked

    private void lectureLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lectureLblMouseClicked
        // TODO add your handling code here:
        lblSetColor(lectureLbl);
        lblResetColor(staffLbl);
        senable();
        var.setText("L");
        choice = false;
        designation.setSelectedIndex(5);
        designation.setEnabled(false);
        idlabel.setText("Lecturer ID");
        choice = false;
        clear();
    }//GEN-LAST:event_lectureLblMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        //ask_delete deleteobj = new ask_delete();
        //deleteobj.setVisible(true);
        int check = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?", "Delete", JOptionPane.YES_NO_OPTION);
        if (check == 0) {
            //delete();
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        PayrollMain var = new PayrollMain();
        var.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        this.setState(login.ICONIFIED);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
        clear();
    }//GEN-LAST:event_clearButton1ActionPerformed

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

    private void srcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcBtnActionPerformed
        emp = new Employee();
        if(search.getText().equals(""))
        {
            searchFail var = new searchFail();
            var.setVisible(true);
            search.requestFocus();
        }
        emp.setId(Integer.parseInt(search.getText()));
        if (choice) {
            empSrv.search(emp, "staff");
        } else {
            empSrv.search(emp, "lecturer");
        }

        id.setText(String.valueOf(emp.getIssuedid()));
        firstname.setText(emp.getFirstname());
        lastname.setText(emp.getLastname());

        try {
            dob.setDate(dateformat.parse(emp.getDob()));
        } catch (ParseException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }

        nationalid.setText(emp.getNationlid());
        email.setText(emp.getEmail());
        tp.setText(emp.getTp());
        adline1.setText(emp.getAdline1());
        adline2.setText(emp.getAdline2());
        postcode.setText(emp.getPostcode());
        department.setSelectedItem(emp.getDepartment());
        designation.setSelectedItem(emp.getDesignation());

        try {
            datehired.setDate(dateformat.parse(emp.getDatehired()));
        } catch (ParseException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }

        basicsalary.setSelectedItem(emp.getBasicsalary());

        if (emp.getGender().equals("Male")) {
            radiomale.setSelected(true);
            radiofemale.setSelected(false);
        } else {
            radiofemale.setSelected(true);
            radiomale.setSelected(false);
        }

        ImageIcon imageIcon = new ImageIcon(new ImageIcon(emp.getImage()).getImage().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH));
        image.setIcon(imageIcon);

    }//GEN-LAST:event_srcBtnActionPerformed

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

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchKeyPressed

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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adline1;
    private javax.swing.JTextField adline2;
    private javax.swing.JComboBox<String> basicsalary;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearButton1;
    private com.toedter.calendar.JDateChooser datehired;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JComboBox<String> designation;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField id;
    private javax.swing.JLabel idlabel;
    private javax.swing.JLabel image;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
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
    private javax.swing.JTextField search;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JButton srcBtn;
    private javax.swing.JLabel staffLbl;
    private javax.swing.JTextField tp;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton var;
    // End of variables declaration//GEN-END:variables
}
