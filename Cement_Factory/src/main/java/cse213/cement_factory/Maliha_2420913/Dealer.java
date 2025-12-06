package cse213.cement_factory.Maliha_2420913;

import cse213.cement_factory.main.User;

import java.io.Serializable;

public class Dealer extends User implements Serializable {
    private int contact;
    private String address;
    private String name;



    public Dealer(int userId, String userType, String password,
                  int contact, String address, String name) {
        super(userId, userType, password);
        this.contact = contact;
        this.address = address;
        this.name = name;
    }

    public Dealer(int contact, String address, String name) {
        this.contact = contact;
        this.address = address;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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





}
