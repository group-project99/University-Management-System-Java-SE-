/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service_;

import Entity_.Employee;
import Repository_.EmployeeRepository;
import View_.subInterf.oneOrMoreFieldEmpty_new;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenova
 */
public class EmployeeService {

    private EmployeeRepository emprep = new EmployeeRepository();

    
    
    public void nextId(Employee emp, String choice) {
        emprep.nextId(emp, choice);
    }

    public void save(Employee emp, String choice) {
        if (emp.getFirstname().equals("") || emp.getLastname().equals("") || emp.getDob().equals("") || emp.getNationlid().equals("") || emp.getGender().equals("") || emp.getEmail().equals("")
                || emp.getTp().equals("") || emp.getAdline1().equals("") || emp.getAdline2().equals("") || emp.getPostcode().equals("") || emp.getDepartment().equals("")
                || emp.getDesignation().equals("") || emp.getDatehired().equals("") || emp.getBasicsalary().equals("")
                || emp.getImage() == null) {
            //JOptionPane.showMessageDialog(null, "One or more fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
            oneOrMoreFieldEmpty_new var = new oneOrMoreFieldEmpty_new();
            var.setVisible(true);
            emp.setFirstname("");
        }
        else if(!emp.getEmail().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"))
        {
             JOptionPane.showMessageDialog(null, "Invalid Email Address", "Error", JOptionPane.ERROR_MESSAGE);
             emp.setEmail("");
        }
        else {
            emprep.saveEmployee(emp, choice);
        }
    }

    public void search(Employee emp, String choice) {
        emprep.search(emp, choice);

    }

    public void update(Employee emp, String choice) {
        if (emp.getFirstname().equals("") || emp.getLastname().equals("") || emp.getDob().equals("") || emp.getNationlid().equals("") || emp.getGender().equals("") || emp.getEmail().equals("")
                || emp.getTp().equals("") || emp.getAdline1().equals("") || emp.getAdline2().equals("") || emp.getPostcode().equals("") || emp.getDepartment().equals("")
                || emp.getDesignation().equals("") || emp.getDatehired().equals("") || emp.getBasicsalary().equals("")) {
            JOptionPane.showMessageDialog(null, "One or more fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            emprep.update(emp, choice);
        }
    }

    public void delete(Employee emp, String choice) {
        emprep.delete(emp, choice);
    }

    public void inAttend(Employee emp) {
        emprep.inAttend(emp);
    }

    public void outAttend(Employee emp) {
        emprep.outAttend(emp);
    }

    public void checkAbsent(Employee emp) {
        emprep.checkAbsent(emp);
    }

    public void abcentCal(Employee emp, String startdate, String enddate) {
        emprep.abcentCal(emp, startdate, enddate);
    }
    
    public List<Employee> attTable(String date){
        List<Employee> data = emprep.attTable(date);
        return data;
    }
    
    public void salarySave(Employee emp){
        emprep.salarySave(emp);
    }
}
