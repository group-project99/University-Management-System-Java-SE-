/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity_;

/**
 *
 * @author MY_PC
 */
public class jReportEntity {
    
    private String empID;
    private String date;
    private String fullName;
    private String designation;
    private String noOfDays;
    private String presentDays;
    private String leaves;
    private String earnings;
    private String deductions;
    private String grossSal;
    private String totDeduct;
    private String netSal;
    private String epf;
    private String etf;
    private String nopay;
    private String bankAcc;

    public jReportEntity(String empID, String date, String fullName, String designation, String noOfDays, String presentDays, String leaves, String earnings, String deductions, String grossSal, String totDeduct, String netSal, String epf, String etf, String nopay, String bankAcc) {
        this.empID = empID;
        this.date = date;
        this.fullName = fullName;
        this.designation = designation;
        this.noOfDays = noOfDays;
        this.presentDays = presentDays;
        this.leaves = leaves;
        this.earnings = earnings;
        this.deductions = deductions;
        this.grossSal = grossSal;
        this.totDeduct = totDeduct;
        this.netSal = netSal;
        this.epf = epf;
        this.etf = etf;
        this.nopay = nopay;
        this.bankAcc = bankAcc;
    }

    public String getNopay() {
        return nopay;
    }

    public void setNopay(String nopay) {
        this.nopay = nopay;
    }

    public jReportEntity() {
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(String noOfDays) {
        this.noOfDays = noOfDays;
    }

    public String getPresentDays() {
        return presentDays;
    }

    public void setPresentDays(String presentDays) {
        this.presentDays = presentDays;
    }

    public String getLeaves() {
        return leaves;
    }

    public void setLeaves(String leaves) {
        this.leaves = leaves;
    }

    public String getEarnings() {
        return earnings;
    }

    public void setEarnings(String earnings) {
        this.earnings = earnings;
    }

    public String getDeductions() {
        return deductions;
    }

    public void setDeductions(String deductions) {
        this.deductions = deductions;
    }

    public String getGrossSal() {
        return grossSal;
    }

    public void setGrossSal(String grossSal) {
        this.grossSal = grossSal;
    }

    public String getTotDeduct() {
        return totDeduct;
    }

    public void setTotDeduct(String totDeduct) {
        this.totDeduct = totDeduct;
    }

    public String getNetSal() {
        return netSal;
    }

    public void setNetSal(String netSal) {
        this.netSal = netSal;
    }

    public String getEpf() {
        return epf;
    }

    public void setEpf(String epf) {
        this.epf = epf;
    }

    public String getEtf() {
        return etf;
    }

    public void setEtf(String etf) {
        this.etf = etf;
    }

    public String getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc;
    }
    
    
    
}
