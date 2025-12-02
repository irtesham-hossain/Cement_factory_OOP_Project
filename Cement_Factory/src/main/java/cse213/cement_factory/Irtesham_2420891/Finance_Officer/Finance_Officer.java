package cse213.cement_factory.Irtesham_2420891.Finance_Officer;

import cse213.cement_factory.main.User;

public class Finance_Officer extends User {
    private String department="Finance";

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Finance_Officer(int userId, String name, String userType, String password, String department) {
        super(userId, name, userType, password);
        this.department = department;
    }
}
