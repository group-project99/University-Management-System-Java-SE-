/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity_;

/**
 *
 * @author MSI
 */
public class Payment {
    
    private int sid;
    private int cid;
    private float instalment;
    private float paidAmount;
    private float balance;
    private String date;
    private String time;

    public Payment(int sid, int cid, float instalment, float paidAmount, float balance, String date, String time) {
        this.sid = sid;
        this.cid = cid;
        this.instalment = instalment;
        this.paidAmount = paidAmount;
        this.balance = balance;
        this.date = date;
        this.time = time;
    }

    public Payment() {
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

    public float getInstalment() {
        return instalment;
    }

    public void setInstalment(float instalment) {
        this.instalment = instalment;
    }

    public float getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(float paidAmount) {
        this.paidAmount = paidAmount;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
