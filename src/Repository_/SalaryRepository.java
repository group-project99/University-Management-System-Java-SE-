/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository_;

import Entity_.Salary;
import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenova
 */
public class SalaryRepository {
    
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public void salarySave(Salary sal) {
        try {
            
            String sql = "INSERT INTO `salary`(`ID`, `IssuedID`, `Name`, `Designation`, `NumberWorkDays`, `AttendDays`, `Leaves`, `Date`, `Earnings`, `Deduction`, `ETF`, `EPF`, "
                    + "`NoPay`, `GrossSalary`, `NetSalary`, `BankAcc`) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, sal.getId());
            ps.setString(2, sal.getIssuedid());
            ps.setString(3, sal.getName());
            ps.setString(4, sal.getDesignation());
            ps.setString(5, sal.getNoOFDays());
            ps.setString(6, sal.getPresentDays());
            ps.setString(7, sal.getLeaves());
            ps.setString(8, sal.getDate());
            ps.setString(9, sal.getEarnings());
            ps.setString(10, sal.getDeduction());
            ps.setString(11, sal.getETF());
            ps.setString(12, sal.getEPF());
            ps.setString(13, sal.getNopay());
            ps.setString(14, sal.getGrossSalary());
            //ps.setString(15, sal.getTotalDeduction());
            ps.setString(15, sal.getNetSalary());
            ps.setString(16, sal.getBankAcc());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Record Added");
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
