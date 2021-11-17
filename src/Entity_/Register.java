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
public class Register {
    
    private int sid;
    private int cid;
    private String paymentPlan;
    private float courseFee;
    private float registationFee;
    private float libraryFee;
    private float developmentFee;
    private float otherFee; 
    private String date;
    
    public Register(int sid, int cid, String paymentPlan, float courseFee, float registationFee, float libraryFee, float developmentFee, float otherFee, String date) {
        this.sid = sid;
        this.cid = cid;
        this.paymentPlan = paymentPlan;
        this.courseFee = courseFee;
        this.registationFee = registationFee;
        this.libraryFee = libraryFee;
        this.developmentFee = developmentFee;
        this.otherFee = otherFee;
        this.date = date;
    }
    
    public Register() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getPaymentPlan() {
        return paymentPlan;
    }

    public void setPaymentPlan(String paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    public float getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(float courseFee) {
        this.courseFee = courseFee;
    }

    public float getRegistationFee() {
        return registationFee;
    }

    public void setRegistationFee(float registationFee) {
        this.registationFee = registationFee;
    }

    public float getLibraryFee() {
        return libraryFee;
    }

    public void setLibraryFee(float libraryFee) {
        this.libraryFee = libraryFee;
    }

    public float getDevelopmentFee() {
        return developmentFee;
    }

    public void setDevelopmentFee(float developmentFee) {
        this.developmentFee = developmentFee;
    }

    public float getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(float otherFee) {
        this.otherFee = otherFee;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
