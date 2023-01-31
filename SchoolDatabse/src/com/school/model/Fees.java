
package com.school.model;


public class Fees {
    
    String class_name;
    String stu_id;
    String month_name;
    int month_fees;
    String exam_name;
    int exam_fees;

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getMonth_name() {
        return month_name;
    }

    public void setMonth_name(String month_name) {
        this.month_name = month_name;
    }

    public int getMonth_fees() {
        return month_fees;
    }

    public void setMonth_fees(int month_fees) {
        this.month_fees = month_fees;
    }

    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }

    public int getExam_fees() {
        return exam_fees;
    }

    public void setExam_fees(int exam_fees) {
        this.exam_fees = exam_fees;
    }
    
    
}
