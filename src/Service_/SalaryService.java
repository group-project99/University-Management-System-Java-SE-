/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service_;

import Entity_.Salary;
import Repository_.SalaryRepository;

/**
 *
 * @author Lenova
 */
public class SalaryService {
    private SalaryRepository salrep = new SalaryRepository();
    
    public void salarySave(Salary sal){
        salrep.salarySave(sal);
    }
}
