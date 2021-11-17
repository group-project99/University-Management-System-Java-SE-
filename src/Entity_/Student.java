/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity_;

/**
 *
 * @author Shehan Tharaka
 */
public class Student {
    
    private int sid;
    private String sName;
    private String age;
    private String nic;
    private String gender;
    private String telephone;
    private String email;
    private String imagePath;
    private byte[] picture;
    private String address;
    private String tName;
    private String branch;
    private String aYear;
    private int cid;
    private byte[] barcode;
    
    private Course course;
    private Register Register;
    private Payment payment;

    public Student(int sid, String sName, String age, String nic, String gender, String telephone, String email, byte[] picture, String address, String tName, String branch, String aYear, int cid) {
        this.sid = sid;
        this.sName = sName;
        this.age = age;
        this.nic = nic;
        this.gender = gender;
        this.telephone = telephone;
        this.email = email;
        this.picture = picture;
        this.address = address;
        this.tName = tName;
        this.branch = branch;
        this.aYear = aYear;
        this.cid = cid;
    }

    public Student() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTName() {
        return tName;
    }

    public void setTName(String tName) {
        this.tName = tName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getaYear() {
        return aYear;
    }

    public void setaYear(String aYear) {
        this.aYear = aYear;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

     public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Register getRegister() {
        return Register;
    }

    public void setRegister(Register Register) {
        this.Register = Register;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public byte[] getBarcode() {
        return barcode;
    }

    public void setBarcode(byte[] barcode) {
        this.barcode = barcode;
    }
    
    
}