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
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.swing.JOptionPane;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class JavaMailUtil {
    
    /**
     * send free structure mail
     * @param recepient
     * @param course
     * @throws Exception 
     */
    private String courseFee;
    public static void sendFeeStructureMail(String recepient,String course) throws Exception{
    
        System.out.println("Preparing to send email");

        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "camppus.info@gmail.com";
        String password = "HNDIT1000";
        

        Session session = Session.getInstance(properties, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }   
        });

        Message message = prepareMessage(session, myAccountEmail, recepient, course);

        System.out.println("ssss");
       
        Transport.send(message);
        

        System.out.println("Message send successfilly");
}

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient, String course) {

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            
            MimeMultipart multipart = new MimeMultipart("related");
            BodyPart messageBodyPart = new MimeBodyPart();
            message.setSubject("Camppus Community-Payment Structure");
            
            switch(course){
                 case "BScIT":{
                     String bTech = "<html>\n" +
"\n" +
"<head>\n" +
"    <title>\n" +
"        Courses Details\n" +
"    </title>\n" +
"</head>\n" +
"\n" +
"<body style=\"text-align:center\">\n" +
"    <h2>BSc (Hons) In Information Technology Degree programme(4 years)</h2>\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plan&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Value of an installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Interest Rate(2%)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>Discount</th>\n" +
"            <th>Full Charge</th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan A -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"8\">Plan A : Pay by <br> instalment <br>(Free of interest)</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.43,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"8\">Rs.344,000.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.43,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.43,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.43,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.43,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.43,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.43,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.43,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan B -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"16\">Plan B : Pay by instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"16\">Rs.350,880.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>9th Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>10th Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>11th Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>12th Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>13th Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>14th Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>15th Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>16th Instalment</td>\n" +
"            <td>Rs.21,500.00</td>\n" +
"            <td>Rs.430.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan C -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"47\">Plan C : Pay by <br>monthly instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"47\">Rs.350,880.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>9th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>10th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>11th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>12th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>13th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>14th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>15th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>16th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>17th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>18th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>19th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>20th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>21th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>22th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>23th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>24th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>25th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>26th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>27th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>28th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>29th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>30th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>31th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>32th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>33th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>34th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>35th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>36th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>38th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>39th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>40th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>41th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>42th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>43th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>44th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>45th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>46th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>47th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>48th Instalment</td>\n" +
"            <td>Rs.7,166.00</td>\n" +
"            <td>Rs.143.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"\n" +
"\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan D -->\n" +
"        <tr>\n" +
"            <td>Plan D : One time payment</td>\n" +
"            <td>One time payment</td>\n" +
"            <td>Rs.344000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>Rs.34400.00 (10% Discount)</td>\n" +
"            <td>Rs.309600.00</td>\n" +
"        </tr>\n" +
"\n" +
"    </table>\n" +
                             
"\n"
                             + "<br><br>"
                             + "<h2 style=\"text-align:center\" align=\"center\">Initial Expenses Table</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Registration Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Library Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Development Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td rowspan=\"2\">Rs.10,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.5,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"        </tr>\n" +
"\n" +
"    </table>" +
"</body>\n" +
"\n" +
"</html>";
                            
                 
                     message.setContent(bTech,"text/html");
                     return message;
                 }
                 
                     
                      case "BScCV":{
                          
                          String bca ="<html>\n" +
"\n" +
"<head>\n" +
"    <title>Second Table(BCA Degree)</title>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <!-- BCA 3 year Degree cOURSE-->\n" +
"\n" +
"        \n" +
"        <h2 style=\"text-align:center\" align=\"center\">BSc Eng (Hons) in Civil Engineering Degree programme(3 years)</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plan&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Value of an installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Interest Rate(2%)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>Discount</th>\n" +
"            <th>Full Charge</th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan A -->\n" +
"\n" +
"       \n" +
"            <tr>\n" +
"            <td rowspan=\"6\">Plan A : Pay by <br> instalment <br>(Free of interest)</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.32,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"6\">Rs.192,000.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.32,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.32,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.32,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.32,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.32,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan B -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"12\">Plan B : Pay by <br> instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.16,000.00</td>\n" +
"            <td>Rs.320.00</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"12\">Rs.195,840.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.16,000.00</td>\n" +
"            <td>Rs.320.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.16,000.00</td>\n" +
"            <td>Rs.320.00</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.16,000.00</td>\n" +
"            <td>Rs.320.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.16,000.00</td>\n" +
"            <td>Rs.320.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.16,000.00</td>\n" +
"            <td>Rs.320.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.16,000.00</td>\n" +
"            <td>Rs.320.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.16,000.00</td>\n" +
"            <td>Rs.320.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>9th Instalment</td>\n" +
"            <td>Rs.16,000.00</td>\n" +
"            <td>Rs.320.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>10th Instalment</td>\n" +
"            <td>Rs.16,000.00</td>\n" +
"            <td>Rs.320.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>11th Instalment</td>\n" +
"            <td>Rs.16,000.00</td>\n" +
"            <td>Rs.320.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>12th Instalment</td>\n" +
"            <td>Rs.16,000.00</td>\n" +
"            <td>Rs.320.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"         <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan C -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"36\">Plan C : Pay by <br>monthly instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"36\">Rs.195,840.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>9th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>10th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>11th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>12th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>13th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>14th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>15th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>16th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>17th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>18th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>19th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>20th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>21th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>22th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>23th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>24th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>25th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>26th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"         \n" +
"        <tr>\n" +
"            <td>27th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>28th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>29th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>30th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>31th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>32th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>33th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>34th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>35th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>36th Instalment</td>\n" +
"            <td>Rs.5,333.00</td>\n" +
"            <td>Rs.107.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan D -->\n" +
"        <tr>\n" +
"            <td>Plan D : One time payment</td>\n" +
"            <td>One time payment</td>\n" +
"            <td>Rs.192,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>Rs.19,200.00 (10% Discount)</td>\n" +
"            <td>Rs.172,800.00</td>\n" +
"        </tr>\n" +
"\n" +
"\n" +
"    </table>\n"
                                  + "<br>br>"
                                  + "<h2 style=\"text-align:center\" align=\"center\">Initial Expenses Table</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Registration Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Library Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Development Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td rowspan=\"2\">Rs.10,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.5,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"        </tr>\n" +
"\n" +
"    </table>"+
"</body>\n" +
"\n" +
"</html>";
                          message.setContent(bca,"text/html");
                          return message;
                      }
                      
                          
                      case "BScME":{
                        
                          String bba = "<html>\n" +
"\n" +
"<head>\n" +
"    <title>Tird Table(BCA Degree)</title>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <!-- BBA 3 year Degree cOURSE-->\n" +
"\n" +
"        \n" +
"        <h2 style=\"text-align:center\" align=\"center\">BSc Eng (Hons) in Mechanical Engineering Degree programme(3 years)</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plan&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Value of an installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Interest Rate(2%)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>Discount</th>\n" +
"            <th>Full Charge</th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan A -->\n" +
"\n" +
"       \n" +
"            <tr>\n" +
"            <td rowspan=\"6\">Plan A : Pay by <br> instalment <br>(Free of interest)</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.25,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"6\">Rs.150,000.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.25,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.25,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.25,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.25,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.25,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan B -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"12\">Plan B : Pay by <br> instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.12,750.00</td>\n" +
"            <td>Rs.250.00</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"12\">Rs.153,000.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.12,750.00</td>\n" +
"            <td>Rs.250.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.12,750.00</td>\n" +
"            <td>Rs.250.00</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.12,750.00</td>\n" +
"            <td>Rs.250.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.12,750.00</td>\n" +
"            <td>Rs.250.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.12,750.00</td>\n" +
"            <td>Rs.250.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.12,750.00</td>\n" +
"            <td>Rs.250.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.12,750.00</td>\n" +
"            <td>Rs.250.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>9th Instalment</td>\n" +
"           <td>Rs.12,750.00</td>\n" +
"            <td>Rs.250.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>10th Instalment</td>\n" +
"            <td>Rs.12,750.00</td>\n" +
"            <td>Rs.250.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>11th Instalment</td>\n" +
"            <td>Rs.12,750.00</td>\n" +
"            <td>Rs.250.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>12th Instalment</td>\n" +
"            <td>Rs.12,750.00</td>\n" +
"            <td>Rs.250.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"         <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan C -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"36\">Plan C : Pay by <br>monthly instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"36\">Rs.153,000.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>9th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>10th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>11th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>12th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>13th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>14th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>15th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>16th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>17th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>18th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>19th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>20th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>21th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>22th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>23th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>24th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>25th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>26th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>27th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>28th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>29th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>30th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>31th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>32th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>33th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>34th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>35th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>36th Instalment</td>\n" +
"            <td>Rs.4,250.00</td>\n" +
"            <td>Rs.83.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan D -->\n" +
"        <tr>\n" +
"            <td>Plan D : One time payment</td>\n" +
"            <td>One time payment</td>\n" +
"            <td>Rs.135,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>Rs.15,000.00 (10% Discount)</td>\n" +
"            <td>Rs.135,000.00</td>\n" +
"        </tr>\n" +
"\n" +
"\n" +
"    </table>\n"
                                  + "<br><br>"
                                  + "<h2 style=\"text-align:center\" align=\"center\">Initial Expenses Table</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Registration Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Library Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Development Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td rowspan=\"2\">Rs.10,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.5,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"        </tr>\n" +
"\n" +
"    </table>" +
"</body>\n" +
"\n" +
"</html>";
                      message.setContent(bba,"text/html");
                      return message;
                      }
                      

                      case "BScQS":{
                          
                          String bsc = "<html>\n" +
"\n" +
"<head>\n" +
"    <title>Fourth Table(BCA Degree)</title>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <!-- Bsc3 year Degree cOURSE-->\n" +
"\n" +
"        \n" +
"        <h2 style=\"text-align:center\" align=\"center\">BSc Eng (Hons) in Quantity Surveying Degree programme(3 years)</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plan&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Value of an installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Interest Rate(2%)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>Discount</th>\n" +
"            <th>Full Charge</th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan A -->\n" +
"\n" +
"       \n" +
"            <tr>\n" +
"            <td rowspan=\"6\">Plan A : Pay by <br> instalment <br>(Free of interest)</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.18,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"6\">Rs.108,000.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"             <td>Rs.18,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"             <td>Rs.18,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"             <td>Rs.18,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"             <td>Rs.18,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"             <td>Rs.18,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan B -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"12\">Plan B : Pay by <br> instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.9,180.00</td>\n" +
"            <td>Rs.180.00</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"12\">Rs.110,160.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.9,180.00</td>\n" +
"            <td>Rs.180.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.9,180.00</td>\n" +
"            <td>Rs.180.00</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.9,180.00</td>\n" +
"            <td>Rs.180.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.9,180.00</td>\n" +
"            <td>Rs.180.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.9,180.00</td>\n" +
"            <td>Rs.180.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.9,180.00</td>\n" +
"            <td>Rs.180.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.9,180.00</td>\n" +
"            <td>Rs.180.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>9th Instalment</td>\n" +
"           <td>Rs.9,180.00</td>\n" +
"            <td>Rs.180.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>10th Instalment</td>\n" +
"            <td>Rs.9,180.00</td>\n" +
"            <td>Rs.180.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>11th Instalment</td>\n" +
"            <td>Rs.9,180.00</td>\n" +
"            <td>Rs.180.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>12th Instalment</td>\n" +
"            <td>Rs.9,180.00</td>\n" +
"            <td>Rs.180.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"         <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan C -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"36\">Plan C : Pay by <br>monthly instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"36\">Rs.110,160.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>9th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>10th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>11th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>12th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>13th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>14th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>15th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>16th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>17th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>18th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>19th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>20th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>21th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>22th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>23th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>24th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>25th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>26th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>27th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>28th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>29th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>30th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>31th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>32th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>33th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>34th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>35th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>36th Instalment</td>\n" +
"            <td>Rs.3,060.00</td>\n" +
"            <td>Rs.60.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan D -->\n" +
"        <tr>\n" +
"            <td>Plan D : One time payment</td>\n" +
"            <td>One time payment</td>\n" +
"            <td>Rs.97,200.00</td>\n" +
"            <td>-</td>\n" +
"            <td>Rs.10,800.00 (10% Discount)</td>\n" +
"            <td>Rs.97,200.00</td>\n" +
"        </tr>\n" +
"\n" +
"\n" +
"    </table>\n"
                                  + "<br><br>"
                                  + "<h2 style=\"text-align:center\" align=\"center\">Initial Expenses Table</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Registration Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Library Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Development Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td rowspan=\"2\">Rs.10,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.5,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"        </tr>\n" +
"\n" +
"    </table>" +
"</body>\n" +
"\n" +
"</html>";
                      message.setContent(bsc,"text/html");
                      return message;
                      }

                          
                      case "BBAAF":{
                          
                          String miba = "<html>\n" +
"\n" +
"<head>\n" +
"    <title>Five Table(BCA Degree)</title>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <!-- MIBA2 year Degree cOURSE-->\n" +
"\n" +
"        \n" +
"        <h2 style=\"text-align:center\" align=\"center\">BBA (Hons) Degree in Accounting & Finance Degree programme(2 years)</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plan&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Value of an installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Interest Rate(2%)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>Discount</th>\n" +
"            <th>Full Charge</th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan A -->\n" +
"\n" +
"       \n" +
"            <tr>\n" +
"            <td rowspan=\"4\">Plan A : Pay by <br> instalment <br>(Free of interest)</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.70,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"4\">Rs.280,000.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"             <td>Rs.70,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"             <td>Rs.70,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"             <td>Rs.70,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan B -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"8\">Plan B : Pay by <br> instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.35,700.00</td>\n" +
"            <td>Rs.700.00</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"8\">Rs.285,600.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.35,700.00</td>\n" +
"            <td>Rs.700.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.35,700.00</td>\n" +
"            <td>Rs.700.00</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.35,700.00</td>\n" +
"            <td>Rs.700.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.35,700.00</td>\n" +
"            <td>Rs.700.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.35,700.00</td>\n" +
"            <td>Rs.700.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.35,700.00</td>\n" +
"            <td>Rs.700.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.35,700.00</td>\n" +
"            <td>Rs.700.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        \n" +
"         <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan C -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"24\">Plan C : Pay by <br>monthly instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"24\">Rs.285,600.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>9th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>10th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>11th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>12th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>13th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>14th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>15th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>16th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>17th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>18th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>19th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>20th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>21th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>22th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>23th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>24th Instalment</td>\n" +
"            <td>Rs.11,900.00</td>\n" +
"            <td>Rs.233.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan D -->\n" +
"        <tr>\n" +
"            <td>Plan D : One time payment</td>\n" +
"            <td>One time payment</td>\n" +
"            <td>Rs.252,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>Rs.28,000.00 (10% Discount)</td>\n" +
"            <td>Rs.252,000.00</td>\n" +
"        </tr>\n" +
"\n" +
"\n" +
"    </table>\n"
                                  + "<br><br>"
                                  + "<h2 style=\"text-align:center\" align=\"center\">Initial Expenses Table</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Registration Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Library Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Development Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td rowspan=\"2\">Rs.10,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.5,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"        </tr>\n" +
"\n" +
"    </table>" +
"</body>"
 + "</html>";
                      message.setContent(miba,"text/html");
                      return message;
                      }
                        
                      case "BBABA":{
                          
                          String mca = "<html>\n" +
"\n" +
"<head>\n" +
"    <title>Six Table(BCA Degree)</title>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <!-- MCA2 year Degree cOURSE-->\n" +
"\n" +
"        \n" +
"        <h2 style=\"text-align:center\" align=\"center\">BBA (Hons) Degree in Business Analytics Degree programme(2 years)</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plan&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Value of an installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Interest Rate(2%)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>Discount</th>\n" +
"            <th>Full Charge</th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan A -->\n" +
"\n" +
"       \n" +
"            <tr>\n" +
"            <td rowspan=\"4\">Plan A : Pay by <br> instalment <br>(Free of interest)</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.55,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"4\">Rs.220,000.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"             <td>Rs.55,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"             <td>Rs.55,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"             <td>Rs.55,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan B -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"8\">Plan B : Pay by <br> instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.28,050.00</td>\n" +
"            <td>Rs.550.00</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"8\">Rs.224,400.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.28,050.00</td>\n" +
"            <td>Rs.550.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.28,050.00</td>\n" +
"            <td>Rs.550.00</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.28,050.00</td>\n" +
"            <td>Rs.550.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.28,050.00</td>\n" +
"            <td>Rs.550.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.28,050.00</td>\n" +
"            <td>Rs.550.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.28,050.00</td>\n" +
"            <td>Rs.550.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.28,050.00</td>\n" +
"            <td>Rs.550.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        \n" +
"         <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan C -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"24\">Plan C : Pay by <br>monthly instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"24\">Rs.224,400.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>9th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>10th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>11th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>12th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>13th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>14th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>15th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>16th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>17th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>18th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>19th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>20th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>21th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>22th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>23th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>24th Instalment</td>\n" +
"            <td>Rs.9,350.00</td>\n" +
"            <td>Rs.183.50</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan D -->\n" +
"        <tr>\n" +
"            <td>Plan D : One time payment</td>\n" +
"            <td>One time payment</td>\n" +
"            <td>Rs.198,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>Rs.22,000.00 (10% Discount)</td>\n" +
"            <td>Rs.198,000.00</td>\n" +
"        </tr>\n" +
"\n" +
"\n" +
"    </table>\n"
                                  + "<br><br>"
                                  + "<h2 style=\"text-align:center\" align=\"center\">Initial Expenses Table</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Registration Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Library Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Development Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td rowspan=\"2\">Rs.10,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.5,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"        </tr>\n" +
"\n" +
"    </table>" +
"</body>\n"+
"\n" +
"</html>";
                      message.setContent(mca,"text/html");
                      return message;
                      }

                      
                      case "BBAMM":{
                          
                          String mTech = "<html>\n" +
"\n" +
"<head>\n" +
"    <title>Seven Table(BCA Degree)</title>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <!-- MTech2 year Degree cOURSE-->\n" +
"\n" +
"        \n" +
"        <h2 style=\"text-align:center\" align=\"center\">BBA (Hons) Degree in Marketing Management Degree programme(2 years)</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Plan&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Value of an installment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Interest Rate(2%)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>Discount</th>\n" +
"            <th>Full Charge</th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan A -->\n" +
"\n" +
"       \n" +
"            <tr>\n" +
"            <td rowspan=\"4\">Plan A : Pay by <br> instalment <br>(Free of interest)</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.81,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"4\">Rs.324,000,000.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"             <td>Rs.81,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"             <td>Rs.81,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"             <td>Rs.81,000.00</td>\n" +
"            <td>-</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan B -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"8\">Plan B : Pay by <br> instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.41,310.00</td>\n" +
"            <td>Rs.810.00</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"8\">Rs.330,480.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.41,310.00</td>\n" +
"            <td>Rs.810.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.41,310.00</td>\n" +
"            <td>Rs.810.00</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.41,310.00</td>\n" +
"            <td>Rs.810.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.41,310.00</td>\n" +
"            <td>Rs.810.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.41,310.00</td>\n" +
"            <td>Rs.810.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.41,310.00</td>\n" +
"            <td>Rs.810.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.41,310.00</td>\n" +
"            <td>Rs.810.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        \n" +
"         <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan C -->\n" +
"\n" +
"        <tr>\n" +
"\n" +
"            <td rowspan=\"24\">Plan C : Pay by <br>monthly instalment</td>\n" +
"            <td>1st Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"            <td rowspan=\"24\">Rs.330,480.00</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>2nd Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>3rd Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>4th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>5th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>6th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>7th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>8th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>9th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>10th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>11th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>12th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>13th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>14th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>15th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>16th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>17th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>18th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>19th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>20th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>21th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>22th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>23th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td>24th Instalment</td>\n" +
"            <td>Rs.13,770.00</td>\n" +
"            <td>Rs.270.00</td>\n" +
"            <td>-</td>\n" +
"        </tr>\n" +
"\n" +
"        <tr>\n" +
"            <th colspan=\"6\"><br></th>\n" +
"        </tr>\n" +
"\n" +
"        <!-- This is Plan D -->\n" +
"        <tr>\n" +
"            <td>Plan D : One time payment</td>\n" +
"            <td>One time payment</td>\n" +
"            <td>Rs.291,600.00</td>\n" +
"            <td>-</td>\n" +
"            <td>Rs.32,400.00 (10% Discount)</td>\n" +
"            <td>Rs.291,600.00</td>\n" +
"        </tr>\n" +
"\n" +
"\n" +
"    </table>\n"
                                  + "<br><br>"
                                  + "<h2 style=\"text-align:center\" align=\"center\">Initial Expenses Table</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Registration Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Library Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Development Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td rowspan=\"2\">Rs.10,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.5,000.00</td>\n" +
"            <td rowspan=\"2\">Rs.1,000.00</td>\n" +
"        </tr>\n" +
"\n" +
"    </table>" +
                                 
"</body>\n"+
"\n" +
"</html>";
                      message.setContent(mTech,"text/html");
                      return message;
                      }

                      default:{}
                           
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
}
    
    /**
     * send registration mail
     * @param recepient
     * @param course
     * @throws Exception 
     */
    public static void sendRegistationMail(String recepient) throws Exception{
    
        System.out.println("Preparing to send email");

        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "camppus.info@gmail.com";
        String password = "HNDIT1000";
        

        Session session = Session.getInstance(properties, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }   
        });

        Message message1 = registationMessage(session, myAccountEmail, recepient);

        
       
        Transport.send(message1);
        

        System.out.println("Message send successfilly");
}

    private static Message registationMessage(Session session, String myAccountEmail, String recepient) {

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            
            MimeMultipart multipart = new MimeMultipart("related");
            BodyPart messageBodyPart = new MimeBodyPart();
            message.setSubject("Initail payments paid successfully !");                     
            String register = "<html>\n" +
"\n" +
"<head>\n" +
"    <title>register Table</title>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <!---->\n" +
"\n" +
"        \n" +
"        <h2 style=\"text-align:center\" align=\"center\">Initail payments paid successfully !</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Registration Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Library Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Development Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"        </tr>\n" +
"        <tr bgcolor=\"33FF9F\">\n" +
"            <td rowspan=\"2\" >Paid</td>\n" +
"            <td rowspan=\"2\">Paid</td>\n" +
"            <td rowspan=\"2\">Paid</td>\n" +
"            <td rowspan=\"2\">Paid</td>\n" +
"        </tr>\n" +
"\n" +
"    </table>\n" +
"</body>\n" +
"\n" +
"</html>";
                      message.setContent(register,"text/html");
                      return message;

}
      catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    
    }
    
    
    /**
     * send payment mail
     * @param recepient
     * @param course
     * @throws Exception 
     */
    public static void sendPaymentMail(String recepient, String courseFee, String instalment, String paidAmount, String balance) throws Exception{
    
        System.out.println("Preparing to send email");

        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "camppus.info@gmail.com";
        String password = "HNDIT1000";
        

        Session session = Session.getInstance(properties, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }   
        });

        Message message1 = paymentMessage(session, myAccountEmail, recepient, courseFee, instalment, paidAmount, balance);

        
       
        Transport.send(message1);
        

        System.out.println("Message send successfilly");
}

    private static Message paymentMessage(Session session, String myAccountEmail, String recepient, String courseFee, String instalment, String paidAmount, String balance) {

//        System.out.println(courseFee);
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            
            MimeMultipart multipart = new MimeMultipart("related");
            BodyPart messageBodyPart = new MimeBodyPart();
            message.setSubject("payment for the priod was received successfully!");                     
            String payment = "<html>\n" +
"\n" +
"<head>\n" +
"    <title>payment table</title>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <!---->\n" +
"\n" +
"        \n" +
"        <h2 style=\"text-align:center\" align=\"center\">payment for the priod was received successfully!</h2>\n" +
"        \n" +
"\n" +
"    <table border=\"1\" style=\"text-align:center\" align=\"center\">\n" +
"        <tr>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Course Fee&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Instalment&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Paid Amount&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"            <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Balance&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>\n" +
"        </tr>\n" +
"        <tr bgcolor=\"#5DADE2\">\n" +
"            <td rowspan=\"2\" >Rs: "+courseFee+"0</td>\n" +
"            <td rowspan=\"2\">Rs: "+instalment+"0</td>\n" +
"            <td rowspan=\"2\">Rs: "+paidAmount+"0</td>\n" +
"            <td rowspan=\"2\">Rs: "+balance+"0</td>\n" +
"        </tr>\n" +
"\n" +
"    </table>\n" +
"</body>\n" +
"\n" +
"</html>";
                      message.setContent(payment,"text/html");

                      return message;

}
      catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    
    }
     
    
    
}