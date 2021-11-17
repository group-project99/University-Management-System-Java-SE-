/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service_;

import Entity_.Payment;
import Entity_.Student;
import Repository_.PaymentRepository;
import java.util.List;

/**
 *
 * @author MSI
 */
public class PaymentService {
    
    private PaymentRepository pr = new PaymentRepository();

      
    /**
     * check payment
     * @param value
     * @return 
     */
    public boolean checkPayment(String value){
        
        if(pr.checkPayment(value)){
        
            return true;
        }
        else{
        
            return false;
        }

    }
    
    
    /**
     * search student,course,register details
     * @param value
     * @return s
     */
     public Student search(String value){
       
        Student s = pr.search(value);       
        return s;
    }
     
     
    /**
    * search paid amount and balance
    * @param value 
    */
    public Payment getPaidAmount(String value){
     
        Payment p = pr.getPaidAmount(value);
        return p;
    }
    
    
    /**
     * search payment details
     * @param value
     * @return data
     */
     public List<Payment> getAll(String value){
       
        List<Payment> data = pr.getAll(value);       
        return data;
    }
     
     
    /**
     * view instalment
     * @param p
     * @return instalment 
     */
    public float viewInstalment(Student s){
   
        float courseFee;
        float instalment;

        switch(s.getCourse().getaCourseName()){
        
            case "BScIT":
            courseFee= (float) 344000.00;

            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/8;
                    return instalment;
                }
                case "Plan B":{
                    float a = courseFee/16;
                    float b =a*2/100;
                    instalment = a+b;
                    return instalment;
                }
                case "Plan C":{
                    float a = courseFee/48;
                    float b = a*2/100;
                    instalment = a+b;
                    return instalment;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    return instalment;
                }
                default:{
                    return 0;
                }
            }
            
            case "BScCV":
            courseFee= (float) 192000.00;

            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/6;
                    return instalment;
                }
                case "Plan B":{
                    float a = courseFee/12;
                    float b =a*2/100;
                    instalment = a+b;
                    return instalment;
                }
                case "Plan C":{
                    float a = courseFee/36;
                    float b = a*2/100;
                    instalment = a+b;
                    return instalment;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    return instalment;
                }
                default:{
                    return 0;
                }
            }
            
            case "BScME":
            courseFee= (float) 150000.00;
               
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/6;
                    return instalment;
                }
                case "Plan B":{
                    float a = courseFee/12;
                    float b =a*2/100;
                    instalment = a+b;
                    return instalment;
                }
                case "Plan C":{
                    float a = courseFee/36;
                    float b = a*2/100;
                    instalment = a+b;
                    return instalment;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    return instalment;
                }
                default:{
                    return 0;
                }
            }
            
            case "BScQS":
            courseFee= (float) 108000.00;
                
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/6;
                    return instalment;
                }
                case "Plan B":{
                    float a = courseFee/12;
                    float b =a*2/100;
                    instalment = a+b;
                    return instalment;
                }
                case "Plan C":{
                    float a = courseFee/36;
                    float b = a*2/100;
                    instalment = a+b;
                    return instalment;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    return instalment;
                }
                default:{
                    return 0;
                }
            }
            
            case "BBAAF":
            courseFee= (float) 280000.00;
                
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/4;
                    return instalment;
                }
                case "Plan B":{
                    float a = courseFee/8;
                    float b =a*2/100;
                    instalment = a+b;
                    return instalment;
                } 
                case "Plan C":{
                    float a = courseFee/24;
                    float b = a*2/100;
                    instalment = a+b;
                    return instalment;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    return instalment;
                }
                default:{
                    return 0;
                }
            }
            
            case "BBABA":
            courseFee= (float) 220000.00;
                
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/4;
                    return instalment;
                }
                case "Plan B":{
                    float a = courseFee/8;
                    float b =a*2/100;
                    instalment = a+b;
                    return instalment;
                }
                case "Plan C":{
                    float a = courseFee/24;
                    float b = a*2/100;
                    instalment = a+b;
                    return instalment;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    return instalment;
                }
                default:{
                    return 0;
                }
            }
            
            case "BBAMM":
            courseFee= (float) 324000.00;
                
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/4;
                    return instalment;
                }
                case "Plan B":{
                    float a = courseFee/8;
                    float b =a*2/100;
                    instalment = a+b;
                    return instalment;
                }
                case "Plan C":{
                    float a = courseFee/24;
                    float b = a*2/100;
                    instalment = a+b;
                    return instalment;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    return instalment;
                }
                default:{
                    return 0;
                }
            }
            default:
                    return 0;
        }
    }
    
    
     /**
     * view paid amount
     * @param p
     * @return paidAmount
     */
    public float viewPaidAmount(Payment p){
    
        float paidAmount;
        paidAmount = p.getPaidAmount() + p.getInstalment();
        
        return paidAmount;
    }
    
    
    /**
     * view balance
     * @param p
     * @return balance
     */
    public float viewBalance(Student s){
    
        float balance;
        balance=s.getRegister().getCourseFee() - s.getPayment().getPaidAmount();
        
        return balance;
    }
    
    
    /**
      * add course payment
      * @param p 
      */
     public void addCoursePayment(Payment p){
     
         pr.addCoursePayment(p);
     }
     
     
}
