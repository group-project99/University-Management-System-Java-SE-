/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository_;

import Entity_.Course;
import Entity_.Register;
import Entity_.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Utility.DBConnection;

/**
 *
 * @author Shehan Tharaka
 */
public class RegisterRepository {
    
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = null;
    ResultSet rs=null;
    
    
    /**
     * search student details and course details
     * @param value
     * @return register
     */
    public Student search(String value) {
         
        Student s = null;

        try {
            String sql="SELECT student.S_ID,student.Student_Name,student.Email,student.Academic_Year,course.C_ID,course.Abbreviated_of_Course_Name FROM student,course WHERE student.S_ID= ? && student.C_ID=course.C_ID";
            ps=conn.prepareStatement(sql);
            ps.setString(1, value);
            rs = ps.executeQuery();

            Course c;   
            if(rs.next()){
                 s = new Student();
                 s.setSid(rs.getInt("S_ID"));
                 s.setsName(rs.getString("Student_Name"));
                 s.setEmail(rs.getString("Email"));
                 s.setaYear(rs.getString("Academic_Year"));
                 
                 c = new Course();
                 c.setCid(rs.getInt("C_ID"));
                 c.setaCourseName(rs.getString("Abbreviated_of_Course_Name"));
                 
                 s.setCourse(c);

                 }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
      
         return s;
    }
    
    
    /**
     * check student registration payment 
     * @param value
     * @return 
     */
    public boolean checkStudentRegistrationPayment(String value){
       
        boolean check=false;
        
        try {
            String sql="SELECT * FROM register WHERE S_Id = ?";
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
     * add student registration payment
     * @param r 
     */
    public void addStudentRegitrationPayment(Register r){
    
        try {
            String sql="INSERT INTO register(S_ID,C_ID,Payment_Plan,Course_Fee,Registation_Fee,Library_Fee,Development_Fee,Other_Fee,Date) VALUES(?,?,?,?,?,?,?,?,?)";
            ps=conn.prepareStatement(sql);
            ps.setInt(1, r.getSid());
            ps.setInt(2, r.getCid());
            ps.setString(3, r.getPaymentPlan());
            ps.setFloat(4, r.getCourseFee());
            ps.setFloat(5, r.getRegistationFee());
            ps.setFloat(6, r.getLibraryFee());
            ps.setFloat(7, r.getDevelopmentFee());
            ps.setFloat(8, r.getOtherFee());
            ps.setString(9, r.getDate());

            ps.execute();
            
            JOptionPane.showMessageDialog(null, "New Resiter Payment Added");
                    System.out.print("repository");

            
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
       
}
