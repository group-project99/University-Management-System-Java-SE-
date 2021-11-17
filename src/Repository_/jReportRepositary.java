/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository_;

import Entity_.jReportEntity;
import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author MY_PC
 */
public class jReportRepositary {

    Connection conn = DBConnection.getConnection();
    PreparedStatement pst = null;
    ResultSet rs = null;
    jReportEntity jre = new jReportEntity();

    public void selectSlipDetails(jReportEntity jre) {
        try {
            String sql = "SELECT * FROM salary WHERE ID = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, jre.getEmpID());
            rs = pst.executeQuery();

            while (rs.next()) {
                jre.setEmpID(rs.getString("IssuedID"));
                jre.setFullName(rs.getString("Name"));
                jre.setDesignation(rs.getString("Designation"));
                jre.setNoOfDays(rs.getString("NumberWorkDays"));
                jre.setPresentDays(rs.getString("AttendDays"));
                jre.setLeaves(rs.getString("Leaves"));
                jre.setDate(rs.getString("Date"));
                jre.setEarnings(rs.getString("Earnings"));
                jre.setDeductions(rs.getString("Deductions"));
                jre.setEpf(rs.getString("EPF"));
                jre.setEtf(rs.getString("ETF"));
                jre.setNopay(rs.getString("NoPay"));
                jre.setGrossSal(rs.getString("GrossSalary"));
                jre.setTotDeduct(rs.getString("Deduction"));
                jre.setNetSal(rs.getString("NetSalary"));
                jre.setBankAcc(rs.getString("BankAcc"));
                
                System.out.print("Repositary OK !");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
