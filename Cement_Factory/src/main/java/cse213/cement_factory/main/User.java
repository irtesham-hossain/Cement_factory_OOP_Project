package cse213.cement_factory.main;

import java.io.Serializable;

public abstract class User implements Serializable {
    protected final int userId;
    protected String password;
    protected final String name;
    protected final String userType;


    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUserType() {
        return userType;
    }

    public User(int userId, String name, String userType, String password) {
        this.userId = userId;
        this.name = name;
        this.userType = userType;
        this.password = password;
    }
}

