/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service_;

import Entity_.jReportEntity;
import Repository_.jReportRepositary;

/**
 *
 * @author MY_PC
 */
public class jReportService {
    
    jReportRepositary jrr = new jReportRepositary();
    
    public void selectSlipDetailsService(jReportEntity jre) {
    
        jrr.selectSlipDetails(jre);
        System.out.print("Service OK !");
    
    }
    
}
