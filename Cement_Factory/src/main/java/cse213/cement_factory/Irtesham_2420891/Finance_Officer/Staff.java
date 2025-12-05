package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import java.io.Serializable;

public class Staff implements Serializable {
    private int staffID;
    private int staffSalary;
    private String Department;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getStaffSalary() {
        return staffSalary;
    }

    public void setStaffSalary(int staffSalary) {
        this.staffSalary = staffSalary;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public Staff(int staffID, int staffSalary, String department) {
        this.staffID = staffID;
        this.staffSalary = staffSalary;
        Department = department;
    }
}
