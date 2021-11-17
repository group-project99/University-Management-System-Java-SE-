/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity_;

import java.util.List;

/**
 *
 * @author MSI
 */
public class Course {
    
    private int cid;
    private String aCourseName;
    private String dCourseName;
    private String yCourse;

    public Course(int cid, String aCourseName, String dCourseName, String yCourse) {
        this.cid = cid;
        this.aCourseName = aCourseName;
        this.dCourseName = dCourseName;
        this.yCourse = yCourse;
    }

    public Course() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getaCourseName() {
        return aCourseName;
    }

    public void setaCourseName(String aCourseName) {
        this.aCourseName = aCourseName;
    }

    public String getdCourseName() {
        return dCourseName;
    }

    public void setdCourseName(String dCourseName) {
        this.dCourseName = dCourseName;
    }

    public String getyCourse() {
        return yCourse;
    }

    public void setyCourse(String yCourse) {
        this.yCourse = yCourse;
    }

}
