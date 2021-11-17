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
public class Salary {
    
    private int id;
    private String issuedid;
    private String name;
    private String Designation;
    private String noOFDays;
    private String presentDays;
    private String leaves;
    private String Date;
    private String earnings;
    private String deduction;
    private String ETF;
    private String EPF;
    private String nopay;
    private String grossSalary;
    private String totalDeduction;
    private String netSalary;
    private String BankAcc;

    public Salary(int id, String issuedid, String name, String Designation, String noOFDays, String presentDays, String leaves, String Date, String earnings, String deduction, String ETF, String EPF, String nopay, String grossSalary, String totalDeduction, String netSalary, String BankAcc) {
        this.id = id;
        this.issuedid = issuedid;
        this.name = name;
        this.Designation = Designation;
        this.noOFDays = noOFDays;
        this.presentDays = presentDays;
        this.leaves = leaves;
        this.Date = Date;
        this.earnings = earnings;
        this.deduction = deduction;
        this.ETF = ETF;
        this.EPF = EPF;
        this.nopay = nopay;
        this.grossSalary = grossSalary;
        this.totalDeduction = totalDeduction;
        this.netSalary = netSalary;
        this.BankAcc = BankAcc;
    }
    
    public Salary()
    {
        
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public String getNoOFDays() {
        return noOFDays;
    }

    public void setNoOFDays(String noOFDays) {
        this.noOFDays = noOFDays;
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

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getEarnings() {
        return earnings;
    }

    public void setEarnings(String earnings) {
        this.earnings = earnings;
    }

    public String getDeduction() {
        return deduction;
    }

    public void setDeduction(String deduction) {
        this.deduction = deduction;
    }

    public String getETF() {
        return ETF;
    }

    public void setETF(String ETF) {
        this.ETF = ETF;
    }

    public String getEPF() {
        return EPF;
    }

    public void setEPF(String EPF) {
        this.EPF = EPF;
    }

    public String getNopay() {
        return nopay;
    }

    public void setNopay(String nopay) {
        this.nopay = nopay;
    }

    public String getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(String grossSalary) {
        this.grossSalary = grossSalary;
    }

    public String getTotalDeduction() {
        return totalDeduction;
    }

    public void setTotalDeduction(String totalDeduction) {
        this.totalDeduction = totalDeduction;
    }

    public String getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(String netSalary) {
        this.netSalary = netSalary;
    }

    public String getBankAcc() {
        return BankAcc;
    }

    public void setBankAcc(String BankAcc) {
        this.BankAcc = BankAcc;
    }
    
    
    
}
