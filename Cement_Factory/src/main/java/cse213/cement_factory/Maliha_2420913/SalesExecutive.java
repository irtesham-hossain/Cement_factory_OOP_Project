package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.User;

public class SalesExecutive extends User {
    private String contact;

    public SalesExecutive(int userId, String name, String userType, String password, String contact) {
        super(userId, name, userType, password);
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "SalesExecutive{" +
                "contact='" + contact + '\'' +
                ", userId=" + userId +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
