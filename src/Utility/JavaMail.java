/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

/**
 *
 * @author Shehan Tharaka
 */
public class JavaMail {
    
    /**
     * send fee structure mail
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception{
    

        JavaMailUtil.sendFeeStructureMail("camppus.info@gmail.com","course");
        
        JavaMailUtil.sendRegistationMail("camppus.info@gmail.com");
        
        JavaMailUtil.sendPaymentMail("camppus.info@gmail.com", "courseFee", "instalment", "paidAmount", "balance");

        
    }
}
