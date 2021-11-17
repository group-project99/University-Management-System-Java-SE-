/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenova
 */
public class DBConnection {
    public static Connection getConnection(){
        
    Connection conn=null;
    
    //String dbhost = "jdbc:mysql://localhost:3306/employee";
    String dbhost = "jdbc:mysql://localhost:3306/university";
    
    String user = "root";
    String password = "";
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(dbhost, user, password);
            System.out.println("=====DB Connected=====");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    return conn;
    }
}