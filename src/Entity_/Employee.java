/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity_;

/**
 *
 * @author Lenova
 */
public class Employee {

    private static int id;
    private String issuedid;
    private String firstname;
    private String lastname;
    private String dob;
    private String nationlid;
    private String gender;
    private String email;
    private String tp;
    private String adline1;
    private String adline2;
    private String postcode;
    private String department;
    private String designation;
    private String status;
    private String datehired;
    private String basicsalary;
    private byte[] image;
    private String imagepath;
    private String attenddate;
    private String attendintime;
    private String attendouttime;
    private String attendstatus;
    private String count;
    private byte[] barcode;
    private String allowance;
    private String deduction;
    private String finalsalary;

    public Employee(int id, String issuedid, String firstname, String lastname, String dob, String nationlid, String gender, String email, String tp, String adline1, String adline2, String postcode, String department, String designation, String status, String datehired, String basicsalary, byte[] image, String imagepath, String attenddate, String attendintime, String attendouttime, String attendstatus, String count) {
        this.id = id;
        this.issuedid = issuedid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.nationlid = nationlid;
        this.gender = gender;
        this.email = email;
        this.tp = tp;
        this.adline1 = adline1;
        this.adline2 = adline2;
        this.postcode = postcode;
        this.department = department;
        this.designation = designation;
        this.status = status;
        this.datehired = datehired;
        this.basicsalary = basicsalary;
        this.image = image;
        this.imagepath = imagepath;
        this.attenddate = attenddate;
        this.attendintime = attendintime;
        this.attendouttime = attendouttime;
        this.attendstatus = attendstatus;
        this.count = count;
    }

    public Employee(String issuedid, String firstname, String lastname, String attendstatus) {
        this.issuedid = issuedid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.attendstatus = attendstatus;
    }
    
    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIssuedid() {
        return issuedid;
    }

    public void setIssuedid(String issuedid) {
        this.issuedid = issuedid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return dob;
    }

    public String getNationlid() {
        return nationlid;
    }

    public void setNationlid(String nationlid) {
        this.nationlid = nationlid;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getAdline1() {
        return adline1;
    }

    public void setAdline1(String adline1) {
        this.adline1 = adline1;
    }

    public String getAdline2() {
        return adline2;
    }

    public void setAdline2(String adline2) {
        this.adline2 = adline2;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDatehired() {
        return datehired;
    }

    public void setDatehired(String datehired) {
        this.datehired = datehired;
    }

    public String getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(String basicsalary) {
        this.basicsalary = basicsalary;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getAttenddate() {
        return attenddate;
    }

    public void setAttenddate(String attenddate) {
        this.attenddate = attenddate;
    }

    public String getAttendstatus() {
        return attendstatus;
    }

    public void setAttendstatus(String attendstatus) {
        this.attendstatus = attendstatus;
    }

    public String getAttendintime() {
        return attendintime;
    }

    public void setAttendintime(String attendintime) {
        this.attendintime = attendintime;
    }

    public String getAttendouttime() {
        return attendouttime;
    }

    public void setAttendouttime(String attendouttime) {
        this.attendouttime = attendouttime;
    }

    public byte[] getBarcode() {
        System.err.println("sdsdsd");
        return barcode;
    }

    public void setBarcode(byte[] barcode) {
        this.barcode = barcode;
        System.err.println("1 212121");
    }

    public String getAllowance() {
        return allowance;
    }

    public void setAllowance(String allowance) {
        this.allowance = allowance;
    }

    public String getDeduction() {
        return deduction;
    }

    public void setDeduction(String deduction) {
        this.deduction = deduction;
    }

    public String getFinalsalary() {
        return finalsalary;
    }

    public void setFinalsalary(String finalsalary) {
        this.finalsalary = finalsalary;
    }
    
    

}
