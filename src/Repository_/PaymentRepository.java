/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository_;

import Entity_.Course;
import Entity_.Payment;
import Entity_.Register;
import Entity_.Student;
import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI
 */
public class PaymentRepository {
    
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = null;
    ResultSet rs=null;
    
    
    /**
     * check payment
     * @param value
     * @return 
     */
    public boolean checkPayment(String value){
       
        boolean check=false;
        
        try {
            String sql="SELECT * FROM payment WHERE S_ID = ?";
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
     * search student,course,register details
     * @param value
     * @return s
     */
    public Student search(String value) {
        
        Student s = null;
        try {
            String sql="SELECT student.S_ID,student.Student_Name,student.Email,course.C_ID,course.Abbreviated_of_Course_Name,register.Payment_Plan,register.Course_Fee "
                    + "FROM student,course,register WHERE student.S_ID = ? && student.S_ID=register.S_ID && student.C_ID=course.C_ID";
            ps=conn.prepareStatement(sql);
            ps.setString(1, value);
            rs = ps.executeQuery(); 

            Course c;
            Register r;
            Payment p;
            
            if(rs.next()){
               
                s = new Student();
                s.setSid(rs.getInt("S_ID"));
                s.setsName(rs.getString("Student_Name"));
                s.setEmail(rs.getString("Email"));
                
                c = new Course();
                c.setCid(rs.getInt("C_ID"));
                c.setaCourseName(rs.getString("Abbreviated_of_Course_Name"));
                
                r = new Register();
                r.setPaymentPlan(rs.getString("Payment_Plan"));
                r.setCourseFee(rs.getFloat("Course_Fee"));
             
                s.setCourse(c);
                s.setRegister(r);

                }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
      
         return s;
    }
    
    
    /**
     * search paid amount and balance
     * @param value 
     */
    public Payment getPaidAmount(String value){
    
        Payment p = null;

        try {
            String sql="SELECT Paid_Amount,Balance FROM payment WHERE S_ID = ? ORDER BY Time DESC LIMIT  1";
            ps=conn.prepareStatement(sql);
            ps.setString(1, value);
            rs = ps.executeQuery(); 

            if(rs.next()){
               
                p =  new Payment();
                p.setPaidAmount(rs.getFloat("Paid_Amount"));
                p.setBalance(rs.getFloat("Balance"));
                }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return p;    
    }
    
    
    /**
     * search payment details
     * @param value
     * @return payment
     */
    public List<Payment> getAll(String value) {
         
        List<Payment> payment = new ArrayList<>(); 

        try {
            String sql="SELECT * FROM payment WHERE S_ID = ?";
            ps=conn.prepareStatement(sql);
            ps.setString(1, value);
            rs = ps.executeQuery(); 

            Payment p;
            while(rs.next()){
              
                 p = new Payment();
                 p.setInstalment(rs.getFloat("Instalment"));
                 p.setPaidAmount(rs.getFloat("Paid_Amount"));
                 p.setBalance(rs.getFloat("Balance"));
                 p.setDate(rs.getString("Date"));
                
                payment.add(p);
                }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
                                   

        }
      
         return payment;
    }
    
    
    /**
     *add course payment
     * @param p 
     */
    public void addCoursePayment(Payment p){
    
        try {
            String sql="INSERT INTO payment(S_ID,C_ID,Instalment,Paid_Amount,Balance,Date,Time) VALUES (?,?,?,?,?,?,?)";
            ps=conn.prepareStatement(sql);
            ps.setInt(1, p.getSid());
            ps.setInt(2, p.getCid());
            ps.setFloat(3, p.getInstalment());
            ps.setFloat(4, p.getPaidAmount());
            ps.setFloat(5, p.getBalance());
            ps.setString(6, p.getDate());
            ps.setString(7, p.getTime());

            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Course Payment Added");

        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    
}
