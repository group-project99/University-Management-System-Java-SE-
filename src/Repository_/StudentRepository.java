/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository_;

import Entity_.Course;
import Entity_.Employee;
import Entity_.Student;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Utility.DBConnection;
import java.sql.SQLException;

/**
 *
 * @author Shehan Tharaka
 */
public class StudentRepository {
    
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = null;
    ResultSet rs=null;
    
    
    public void nextId(Student s) {

        try {
            String sql = "select S_ID from student ORDER BY S_ID DESC LIMIT 1";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                s.setSid(rs.getInt("S_ID"));
                System.out.print(rs.getInt("S_ID"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    /**
     * check student
     * @param value
     * @return 
     */
    public boolean checkStudnt(String value){
       
        boolean check=false;
        
        try {
            String sql="SELECT S_ID FROM student WHERE S_ID = ?";
            ps=conn.prepareStatement(sql);
            ps.setString(1, value);
            rs = ps.executeQuery();

            if(rs.next()){
            
                check=true;
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
        return check;
    }
     
    
    /**
     * add new student
     * @param s 
     */
    public void save(Student s){

        try {
            String sql="INSERT INTO student(Student_Name,Age,NIC,Gender,Telephone,Email,Picture,Address,Trustee_Name,Branch,Academic_Year,C_ID,barcode)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps=conn.prepareStatement(sql);
            ps.setString(1, s.getsName());
            ps.setString(2, s.getAge());
            ps.setString(3, s.getNic());
            ps.setString(4, s.getGender());
            ps.setString(5, s.getTelephone());
            ps.setString(6, s.getEmail());
            InputStream img=new FileInputStream(new File(s.getImagePath()));
            ps.setBlob(7, img);
            ps.setString(8, s.getAddress());
            ps.setString(9, s.getTName());
            ps.setString(10, s.getBranch());
            ps.setString(11, s.getaYear());
            ps.setInt(12, s.getCid());    
            ps.setBytes(13, s.getBarcode());    
            
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "New student added");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    /**
     * get student details
     * @return student
     */
     public List<Student> getAll() {
        List<Student> student = new ArrayList<>();
        try {
            String sql="SELECT * FROM student";
            ps=conn.prepareStatement(sql);
            rs = ps.executeQuery();
         
            Student s;
            
            while(rs.next()){
                
                 s = new Student(rs.getInt("S_ID"),
                 rs.getString("Student_Name"),
                 rs.getString("Age"),
                 rs.getString("NIC"),
                 rs.getString("Gender"),
                 rs.getString("Telephone"),
                 rs.getString("Email"),
                 rs.getBytes("Picture"),
                 rs.getString("Address"),
                 rs.getString("Trustee_Name"),
                 rs.getString("Branch"),
                 rs.getString("Academic_Year"),
                 rs.getInt("C_ID"));  

                 student.add(s);
                 }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         return student;
    }
     
     
    /**
     * search student details
     * @return student
     */
     public List<Student> search(String value) {
         
        List<Student> student = new ArrayList<>();
        try {
            String sql="SELECT * FROM student WHERE S_id LIKE ? OR Student_Name LIKE '%"+value+"%'";
            ps=conn.prepareStatement(sql);
            ps.setString(1, value);
//            ps.setString(2, value);
            rs = ps.executeQuery();
         
            Student s;
            while(rs.next()){
                
                 s = new Student(rs.getInt("S_ID"),
                 rs.getString("Student_Name"),
                 rs.getString("Age"),
                 rs.getString("NIC"),
                 rs.getString("Gender"),
                 rs.getString("Telephone"),
                 rs.getString("Email"),
                 rs.getBytes("Picture"),
                 rs.getString("Address"),
                 rs.getString("Trustee_Name"),
                 rs.getString("Branch"),
                 rs.getString("Academic_Year"),
                 rs.getInt("C_ID"));

                 student.add(s);
                 }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }     
         return student;
    }
     
     
    /**
     * update student
     * @param s 
     */
    public void update(Student s){
     
        if(s.getImagePath()!=null){
            try {
                String sql="UPDATE student SET Student_Name=?,Age=?,NIC=?,Gender=?,Telephone=?,Email=?,Picture=?,Address=?,Trustee_Name=?,Branch=?,Academic_Year=?,C_ID=? WHERE S_id=?";
                ps=conn.prepareStatement(sql);
                ps.setString(1, s.getsName());
                ps.setString(2, s.getAge());
                ps.setString(3, s.getNic());
                ps.setString(4, s.getGender());
                ps.setString(5, s.getTelephone());
                ps.setString(6, s.getEmail());
                InputStream img=new FileInputStream(new File(s.getImagePath()));
                ps.setBlob(7, img);
                ps.setString(8, s.getAddress());
                ps.setString(9, s.getTName());
                ps.setString(10, s.getBranch());
                ps.setString(11, s.getaYear());
                ps.setInt(12, s.getCid());
                ps.setInt(13, s.getSid());

                ps.execute();
                JOptionPane.showMessageDialog(null,"Student data and student picture updated");


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            }
        else{
            try {
                String sql="UPDATE student SET Student_Name=?,Age=?,NIC=?,Gender=?,Telephone=?,Email=?,Address=?,Trustee_Name=?,Branch=?,Academic_Year=?,C_ID=? WHERE S_id=?";
                ps=conn.prepareStatement(sql);
                ps.setString(1, s.getsName());
                ps.setString(2, s.getAge());
                ps.setString(3, s.getNic());
                ps.setString(4, s.getGender());
                ps.setString(5, s.getTelephone());
                ps.setString(6, s.getEmail());
                ps.setString(7, s.getAddress());
                ps.setString(8, s.getTName());
                ps.setString(9, s.getBranch());
                ps.setString(10, s.getaYear());
                ps.setInt(11, s.getCid());
                ps.setInt(12, s.getSid());
             
                ps.execute();
                JOptionPane.showMessageDialog(null,"Student data updated");

             
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
     
     
    /**
     * delete student
     * @param s 
     */
     public void delete(Student s){
     
        try {
             String sql="DELETE FROM student WHERE S_id=?";
             ps=conn.prepareStatement(sql);
             ps.setInt(1, s.getSid());
             
             ps.execute();
             JOptionPane.showMessageDialog(null,"Deleted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
