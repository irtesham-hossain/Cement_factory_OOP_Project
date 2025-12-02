package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import cse213.cement_factory.main.User;



public class Plant_Manager extends User {
    private String department="Production";
    private String plantLocation;

    public Plant_Manager(int userId, String name, String userType, String password, String department, String plantLocation) {
        super(userId, name, userType, password);
        this.department = department;
        this.plantLocation = plantLocation;
    }

    public String getDepartment() {
        return department;
    }

    public String getPlantLocation() {
        return plantLocation;
    }

    public void setPlantLocation(String plantLocation) {
        this.plantLocation = plantLocation;
    }
}
