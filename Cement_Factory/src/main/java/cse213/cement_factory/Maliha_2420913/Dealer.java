package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.User;

public class Dealer extends User {
    private int contact;
    private String address;


    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "contact=" + contact +
                ", address='" + address + '\'' +
                ", userId=" + userId +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }

    public Dealer(int userId, String name, String userType, String password, int contact, String address) {
        super(userId, name, userType, password);
        this.contact = contact;
        this.address = address;
    }
}
