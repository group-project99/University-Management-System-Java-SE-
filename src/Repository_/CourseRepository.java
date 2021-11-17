/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository_;

import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author MSI
 */
public class CourseRepository {
    
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = null;
    ResultSet rs=null;
    
    
    /**
     * generate course details report
     */
    public void report(){
        
     try {

            String report="C:\\Users\\MY_PC\\Music\\Final\\EMP_Mgt_System\\courseDetails.jrxml";
            JasperDesign jd = JRXmlLoader.load(report);

            String sql = "SELECT C_ID AS Course_No,Abbreviated_of_Course_Name,Detailed_of_Course_Name,Years_of_Course FROM course";
            JRDesignQuery newQuery =  new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            
            JasperReport jr = JasperCompileManager.compileReport(jd);

            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
