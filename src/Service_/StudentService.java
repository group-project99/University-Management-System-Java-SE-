/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service_;

import Entity_.Student;
import java.util.List;
import Repository_.StudentRepository;

/**
 *
 * @author Shehan Tharaka
 */
public class StudentService {
    
    private StudentRepository sr = new StudentRepository();
    
    public void nextId(Student s) {
         sr.nextId(s);
    }
    
   /**
    * check student
    * @param value
    * @return 
    */
    public boolean checkStudent(String value){
        
        if(sr.checkStudnt(value)){
        
            return true;
        }
        else{
        
            return false;
        }

    }
    
    
    /**
     * add new student
     * @param s 
     */
    public void save(Student s){

        sr.save(s);
    }
    
    
    /**
     * get students details
     * @return data
     */
    public List<Student> getAll(){
       
        List<Student> data = sr.getAll();
        return data;
    }
    
    
    /**
     * search student details
     * @param value
     * @return data
     */
    public List<Student> search(String value){
       
        List<Student> data = sr.search(value);
        return data;
    }
    
    
    /**
     * update student
     * @param s 
     */
    public void update(Student s){
    
        sr.update(s);
    }
    
    
    /**
     * delete student
     * @param s 
     */
    public void delete(Student s){
    
        sr.delete(s);
    }
    
}
