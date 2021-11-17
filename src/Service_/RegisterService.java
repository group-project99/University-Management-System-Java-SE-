/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service_;

import Entity_.Register;
import Entity_.Student;
import Repository_.RegisterRepository;

/**
 *
 * @author Shehan Tharaka
 */
public class RegisterService {
    
    private RegisterRepository rr = new RegisterRepository();
    
    
    /**
     * view course fee structure
     * @param r 
     * @return fee structure 
     */
    public String feeStructure(Student s){
   
        float courseFee;
        float instalment;
        float total;

        switch(s.getCourse().getaCourseName()){
        
            case "BScIT":
            courseFee= (float) 344000.00;

            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/8;
                    total=courseFee;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc (Hons) In Information Technology",4,"A","Pay by instalment(Free of interest)",8,instalment,total);
                }
                case "Plan B":{
                    float a = courseFee/16;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*16;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc (Hons) In Information Technology",4,"B","Pay by instalment",16,instalment,total);
                }
                case "Plan C":{
                    float a = courseFee/48;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*48;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc (Hons) In Information Technology",4,"C","Pay by monthly instalment",48,instalment,total);
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc (Hons) In Information Technology",4,"D","Full payment",1,instalment,total);
                }
                default:{
                    return String.format("Select a payment plan");
                }
            }
            
            case "BScCV":
            courseFee= (float) 192000.00;

            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/6;
                    total=courseFee;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc Eng (Hons) in Civil Engineering",3,"A","Pay by instalment(Free of interest)",6,instalment,total);
                }
                case "Plan B":{
                    float a = courseFee/12;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*12;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc Eng (Hons) in Civil Engineering",3,"B","Pay by instalment",12,instalment,total);
                }
                case "Plan C":{
                    float a = courseFee/36;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*36;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc Eng (Hons) in Civil Engineering",3,"C","Pay by monthly instalment",36,instalment,total);
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc Eng (Hons) in Civil Engineering",3,"D","Full payment",1,instalment,total);
                }
                default:{
                    return String.format("Select a payment plan");
                }
            }
            
            case "BScME":
            courseFee= (float) 150000.00;
               
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/6;
                    total=courseFee;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc Eng (Hons) in Mechanical Engineering",3,"A","Pay by instalment(Free of interest)",6,instalment,total);
                }
                case "Plan B":{
                    float a = courseFee/12;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*12;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc Eng (Hons) in Mechanical Engineering",3,"B","Pay by instalment",12,instalment,total);
                }
                case "Plan C":{
                    float a = courseFee/36;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*36;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc Eng (Hons) in Mechanical Engineering",3,"C","Pay by monthly instalment",36,instalment,total);
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc Eng (Hons) in Mechanical Engineering",3,"D","Full payment",1,instalment,total);
                }
                default:{
                    return String.format("Select a payment plan");
                }
            }
            
            case "BScQS":
            courseFee= (float) 108000.00;
                
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/6;
                    total=courseFee;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc Eng (Hons) in Quantity Surveying",3,"A","Pay by instalment(Free of interest)",6,instalment,total);
                }
                case "Plan B":{
                    float a = courseFee/12;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*12;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc Eng (Hons) in Quantity Surveying",3,"B","Pay by instalment",12,instalment,total);
                }
                case "Plan C":{
                    float a = courseFee/36;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*36;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc Eng (Hons) in Quantity Surveying",3,"C","Pay by monthly instalment",36,instalment,total);
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BSc Eng (Hons) in Quantity Surveying",3,"D","Full payment",1,instalment,total);
                }
                default:{
                    return String.format("Select a payment plan");
                }
            }
            
            case "BBAAF":
            courseFee= (float) 280000.00;
                
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/4;
                    total=courseFee;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BBA (Hons) Degree in Accounting & Finance",2,"A","Pay by instalment(Free of interest)",4,instalment,total);
                }
                case "Plan B":{
                    float a = courseFee/8;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*8;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BBA (Hons) Degree in Accounting & Finance",2,"B","Pay by instalment",8,instalment,total);
                } 
                case "Plan C":{
                    float a = courseFee/24;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*24;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BBA (Hons) Degree in Accounting & Finance",2,"C","Pay by monthly instalment",24,instalment,total);
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BBA (Hons) Degree in Accounting & Finance",2,"D","Full payment",1,instalment,total);
                }
                default:{
                    return String.format("Select a payment plan");
                }
            }
            
            case "BBABA":
            courseFee= (float) 220000.00;
                
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/4;
                    total=courseFee;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BBA (Hons) Degree in Business Analytics",2,"A","Pay by instalment(Free of interest)",4,instalment,total);
                }
                case "Plan B":{
                    float a = courseFee/8;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*8;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BBA (Hons) Degree in Business Analytics",2,"B","Pay by instalment",8,instalment,total);
                }
                case "Plan C":{
                    float a = courseFee/24;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*24;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BBA (Hons) Degree in Business Analytics",2,"C","Pay by monthly instalment",24,instalment,total);
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BBA (Hons) Degree in Business Analytics",2,"D","Full payment",1,instalment,total);
                }
                default:{
                    return String.format("Select a payment plan");
                }
            }
            
            case "BBAMM":
            courseFee= (float) 324000.00;
                
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    instalment = courseFee/4;
                    total=courseFee;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BBA (Hons) Degree in Marketing Management",2,"A","Pay by instalment(Free of interest)",4,instalment,total);
                }
                case "Plan B":{
                    float a = courseFee/8;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*8;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BBA (Hons) Degree in Marketing Management",2,"B","Pay by instalment",8,instalment,total);
                }
                case "Plan C":{
                    float a = courseFee/24;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*24;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BBA (Hons) Degree in Marketing Management",2,"C","Pay by monthly instalment",24,instalment,total);
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return String.format("%s - %d Years \n Plan %s - %s \n You need to pay %d instalment \n Rs:%.2f \n\n Total = Rs:%.2f","BBA (Hons) Degree in Marketing Management",2,"D","Full payment",1,instalment,total);
                }
                default:{
                    return String.format("Select a payment plan");
                }
            }
            
            default:
                return String.format("Slect a course");
        }
    }
    
    
    /**
     * search student details and course details
     * @param value
     * @return data
     */
     public Student search(String value){
       
        Student s = rr.search(value);
        return s;
    }
     
     
    /**
     * check student registration payment 
     * @param value
     * @return 
     */
    public boolean checkStudentRegistrationPayment(String value){
        
        if(rr.checkStudentRegistrationPayment(value)){
        
            return true;
        }
        else{
        
            return false;
        }

    }
    
    
    /**
     * view total course fee
     * @param r
     * @return total course fee
     */
    public float viewCourseFee(Student s){
   
        float courseFee;
        float instalment;
        float total;

        switch(s.getCourse().getaCourseName()){
        
            case "BScIT":
            courseFee= (float) 344000.00;

            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    total=courseFee;
                    return total;
                }
                case "Plan B":{
                    float a = courseFee/16;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*16;
                    return total;
                }
                case "Plan C":{
                    float a = courseFee/48;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*48;
                    return total;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return total;
                }
                default:{
                    return 0;
                }
            }
            
            case "BScCV":
            courseFee= (float) 192000.00;

            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    total=courseFee;
                    return total;
                }
                case "Plan B":{
                    float a = courseFee/12;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*12;
                    return total;
                }
                case "Plan C":{
                    float a = courseFee/36;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*36;
                    return total;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return total;
                }
                default:{
                    return 0;
                }
            }
            
            case "BScME":
            courseFee= (float) 150000.00;
               
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    total=courseFee;
                    return total;
                }
                case "Plan B":{
                    float a = courseFee/12;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*12;
                    return total;
                }
                case "Plan C":{
                    float a = courseFee/36;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*36;
                    return total;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return total;
                }
                default:{
                    return 0;
                }
            }
            
            case "BScQS":
            courseFee= (float) 108000.00;
                
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    total=courseFee;
                    return total;
                }
                case "Plan B":{
                    float a = courseFee/12;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*12;
                    return total;
                }
                case "Plan C":{
                    float a = courseFee/36;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*36;
                    return total;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return total;
                }
                default:{
                    return 0;
                }
            }
            
            case "BBAAF":
            courseFee= (float) 280000.00;
                
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    total=courseFee;
                    return total;
                }
                case "Plan B":{
                    float a = courseFee/8;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*8;
                    return total;
                } 
                case "Plan C":{
                    float a = courseFee/24;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*24;
                    return total;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return total;
                }
                default:{
                    return 0;
                }
            }
            
            case "BBABA":
            courseFee= (float) 220000.00;
                
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    total=courseFee;
                    return total;
                }
                case "Plan B":{
                    float a = courseFee/8;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*8;
                    return total;
                }
                case "Plan C":{
                    float a = courseFee/24;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*24;
                    return total;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return total;
                }
                default:{
                    return 0;
                }
            }
                   
            case "BBAMM":
            courseFee= (float) 324000.00;
                
            switch (s.getRegister().getPaymentPlan()){
                case "Plan A":{
                    total=courseFee;
                    return total;
                }
                case "Plan B":{
                    float a = courseFee/8;
                    float b =a*2/100;
                    instalment = a+b;
                    total=instalment*8;
                    return total;
                }
                case "Plan C":{
                    float a = courseFee/24;
                    float b = a*2/100;
                    instalment = a+b;
                    total=instalment*24;
                    return total;
                }
                case "Plan D":{
                    float a = courseFee*10/100;
                    instalment = courseFee-a;
                    total=instalment;
                    return total;
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
     * add student registration payment
     * @param r 
     */
    public void addStudentRegitrationPayment(Register r){
    
        rr.addStudentRegitrationPayment(r);
    }
    
}
    
    

