/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository_;

import Entity_.Employee;
import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenova
 */
public class EmployeeRepository {

    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void nextId(Employee emp, String choice) {

        try {
            String sql = "select ID from " + choice + " ORDER BY ID DESC LIMIT 1";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                emp.setId(rs.getInt("ID"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void saveEmployee(Employee emp, String choice) {
        System.out.println("repository");
        try {

            String sql = "INSERT INTO " + choice + "(FirstName,LastName,DateofBirth,Gender,Email,Telephone,AddressLine1,"
                    + "AddressLine2,PostCode,Department,Designation,DateHired,BasicSalary,Picture,NationalID,IssuedID,Barcode)"
                    + "Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, emp.getFirstname());
            ps.setString(2, emp.getLastname());
            ps.setString(3, emp.getDob());
            ps.setString(4, emp.getGender());
            ps.setString(5, emp.getEmail());
            ps.setString(6, emp.getTp());
            ps.setString(7, emp.getAdline1());
            ps.setString(8, emp.getAdline1());
            ps.setString(9, emp.getPostcode());
            ps.setString(10, emp.getDepartment());
            ps.setString(11, emp.getDesignation());
            ps.setString(12, emp.getDatehired());
            ps.setString(13, emp.getBasicsalary());
            ps.setBytes(14, emp.getImage());
            ps.setString(15, emp.getNationlid());
            ps.setString(16, emp.getIssuedid());
            ps.setBytes(17, emp.getBarcode());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Record Added");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void search(Employee emp, String choice) {
        try {
            String sql = "select * from " + choice + " where ID=? ";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, emp.getId());
            rs = ps.executeQuery();

            while (rs.next()) {
                emp.setId(rs.getInt("ID"));
                emp.setIssuedid(rs.getString("IssuedID"));
                emp.setFirstname(rs.getString("FirstName"));
                emp.setLastname(rs.getString("LastName"));
                emp.setDob(rs.getString("DateofBirth"));
                emp.setNationlid(rs.getString("NationalID"));
                emp.setGender(rs.getString("Gender"));
                emp.setEmail(rs.getString("Email"));
                emp.setTp(rs.getString("Telephone"));
                emp.setAdline1(rs.getString("AddressLine1"));
                emp.setAdline2(rs.getString("AddressLine2"));
                emp.setPostcode(rs.getString("PostCode"));
                emp.setDepartment(rs.getString("Department"));
                emp.setDesignation(rs.getString("Designation"));
                emp.setDatehired(rs.getString("DateHired"));
                emp.setBasicsalary(rs.getString("BasicSalary"));
                emp.setImage(rs.getBytes("Picture"));

                System.out.println("Searching Complete");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void update(Employee emp, String choice) {
        try {
            String sql = "UPDATE " + choice + " SET `FirstName`=?,`LastName`=?,`DateofBirth`=?,"
                    + "`Gender`=?,`Email`=?,`Telephone`=?,`AddressLine1`=?,`AddressLine2`=?,`PostCode`=?,`Department`=?,"
                    + "`Designation`=?,`DateHired`=?,`BasicSalary`=?, NationalID=?"
                    + " WHERE `ID`='" + emp.getId() + "'";
            //`Picture`=?
            ps = conn.prepareStatement(sql);
            ps.setString(1, emp.getFirstname());
            ps.setString(2, emp.getLastname());
            ps.setString(3, emp.getDob());
            ps.setString(4, emp.getGender());
            ps.setString(5, emp.getEmail());
            ps.setString(6, emp.getTp());
            ps.setString(7, emp.getAdline1());
            ps.setString(8, emp.getAdline1());
            ps.setString(9, emp.getPostcode());
            ps.setString(10, emp.getDepartment());
            ps.setString(11, emp.getDesignation());
            ps.setString(12, emp.getDatehired());
            ps.setString(13, emp.getBasicsalary());
            ps.setString(14, emp.getNationlid());
            //ps.setBytes(15,emp.getImage());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Record Updated");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void delete(Employee emp, String choice) {
        try {
            String sql = "DELETE FROM " + choice + " WHERE `ID`='" + emp.getId() + "'";
            ps = conn.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Record Deleted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void inAttend(Employee emp) {
        try {
            String sql = "INSERT INTO attendance(ID,IssuedID,Status,FirstName,LastName,Attendance,Date,InTime,OutTime) VALUES (?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, String.valueOf(emp.getId()));
            ps.setString(2, emp.getIssuedid());
            ps.setString(3, emp.getStatus());
            ps.setString(4, emp.getFirstname());
            ps.setString(5, emp.getLastname());
            ps.setString(6, emp.getAttendstatus());
            ps.setString(7, emp.getAttenddate());
            ps.setString(8, emp.getAttendintime());
            ps.setString(9, emp.getAttendouttime());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void outAttend(Employee emp) {
        try {
            String sql = "UPDATE `attendance` SET `OutTime`=? WHERE ID=? and Date = ? and Status = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, emp.getAttendouttime());
            ps.setString(2, String.valueOf(emp.getId()));
            ps.setString(3, emp.getAttenddate());
            ps.setString(4, emp.getStatus());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void checkAbsent(Employee emp) {
        int num = emp.getId();
        for (int i = 1; i <= num; i++) {
            try {
                String sql1 = "select * from attendance where ID=? and Date = ? and Status = ?";
                ps = conn.prepareStatement(sql1);
                ps.setString(1, String.valueOf(i));
                ps.setString(2, emp.getAttenddate());
                ps.setString(3, emp.getStatus());
                rs = ps.executeQuery();
                if (rs.next()) {
                    System.out.println(i + "in");
                } else {
                    try {
                        String fname = null;
                        String lname = null;
                        String issuedid = null;
                        String sql2 = "select * from " + emp.getStatus() + " where ID=? ";
                        ps = conn.prepareStatement(sql2);
                        ps.setInt(1, i);
                        rs = ps.executeQuery();
                        while (rs.next()) {
                            fname = rs.getString("FirstName");
                            lname = rs.getString("LastName");
                            issuedid = rs.getString("IssuedID");

                        }

                        String sql3 = "INSERT INTO attendance(ID,IssuedID,Status,FirstName,LastName,Attendance,Date,InTime,OutTime) VALUES (?,?,?,?,?,?,?,?,?)";
                        ps = conn.prepareStatement(sql3);
                        ps.setInt(1, i);
                        ps.setString(2, issuedid);
                        ps.setString(3, emp.getStatus());
                        ps.setString(4, fname);
                        ps.setString(5, lname);
                        ps.setString(6, "abcent");
                        ps.setString(7, emp.getAttenddate());
                        ps.setString(8, "null");
                        ps.setString(9, "null");
                        ps.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public void abcentCal(Employee emp, String startdate, String enddate) {
        System.out.println(emp.getIssuedid());
        System.out.println(emp.getId());
        int count = 0;
        try {
            String sql = "COUNT(ID) From attendance Where ID=? and Attendance=abcent and Date between ? and ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, emp.getIssuedid());
            ps.setString(2, startdate);
            ps.setString(3, enddate);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
                System.out.println(count);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public List<Employee> attTable(String date) {
        List<Employee> employee = new ArrayList<>();
        try {
            String sql = "SELECT * FROM attendance WHERE Date=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, date);
            rs = ps.executeQuery();
            Employee emp;
            while (rs.next()) {
                /*
                System.out.println(rs.getString("IssuedID"));
                System.out.println(rs.getString("FirstName"));
                System.out.println(rs.getString("LastName"));
                System.out.println(rs.getString("Attendance"));
                 */
                emp = new Employee(rs.getString("IssuedID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("Attendance"));
                System.out.println("sdadasdsa");
                employee.add(emp);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return employee;
    }

    public void salarySave(Employee emp) {
        try {
            String sql = "INSERT INTO `salary`(`ID`, `IssuedID`, `FirstName`, `LastName`, `BasicSalary`, `Allowance`, `Deduction`, `FinalSalary`) "
                    + "VALUES (?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getIssuedid());
            ps.setString(3, emp.getFirstname());
            ps.setString(4, emp.getLastname());
            ps.setString(5, emp.getBasicsalary());
            ps.setString(6, emp.getAllowance());
            ps.setString(7, emp.getDeduction());
            ps.setString(8, emp.getFinalsalary());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Record Added");
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
        }
    }
}
