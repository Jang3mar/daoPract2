package com.example.pract2up.models;

public class Houses {

    private int housesID;
    private String address;
    private int houseNumFloor;
    private String houseColor;
    private double houseCost;

    public Houses(int housesID, String address, int houseNumFloor, String houseColor, double houseCost) {
        this.housesID = housesID;
        this.address = address;
        this.houseNumFloor = houseNumFloor;
        this.houseColor = houseColor;
        this.houseCost = houseCost;
    }

    public int getHousesID() {
        return housesID;
    }

    public void setHousesID(int housesID) {
        this.housesID = housesID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHouseNumFloor() {
        return houseNumFloor;
    }

    public void setHouseNumFloor(int houseNumFloor) {
        this.houseNumFloor = houseNumFloor;
    }

    public String getHouseColor() {
        return houseColor;
    }

    public void setHouseColor(String houseColor) {
        this.houseColor = houseColor;
    }

    public double getHouseCost() {
        return houseCost;
    }

    public void setHouseCost(double houseCost) {
        this.houseCost = houseCost;
    }
}
