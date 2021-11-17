/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository_;

import Entity_.User;
import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenova
 */
public class UserRepository {
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public void login(User u) {
        try {
            String sql = "select * from user where UserName=? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, u.getUsername());
            rs = ps.executeQuery();

            while (rs.next()) {
                u.setPassword(rs.getString("Password"));
                System.out.println("Searching Complete");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public boolean checkuser(String value){
       
        boolean check=false;
        
        try {
            String sql="SELECT ID FROM user WHERE ID = ?";
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
    
    public boolean checkuserbyUname(String value){
       
        boolean check=false;
        
        try {
            String sql="SELECT UserName FROM user WHERE UserName = ?";
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
    
    public void searchUser(User u , String value) {
        try {
            String sql = "select * from user where ID=? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, value);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                u.setUsername(rs.getString("UserName"));
                u.setPassword(rs.getString("Password"));
            }
            System.out.println("HERE");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void addUser(User u) {
        try {
            String sql = "INSERT INTO `user`(`ID`, `UserName`, `Password`) VALUES (?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, u.getID());
            ps.setString(2, u.getUsername());
            ps.setString(3, u.getPassword());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Record Added");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void nextAdmin(User u) {

        try {
            String sql = "select UserName from user ORDER BY uID DESC LIMIT 1";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                u.setUsername(rs.getString("UserName"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
}

