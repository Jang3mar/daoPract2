package com.example.pract2up.models;

public class Cars {
    private int carsID;
    private String carModel;
    private String carNumber;
    private double carCost;
    private String catColor;

    public Cars(int carsID, String carModel, String carNumber, double carCost, String catColor) {
        this.carsID = carsID;
        this.carModel = carModel;
        this.carNumber = carNumber;
        this.carCost = carCost;
        this.catColor = catColor;
    }

    public int getCarsID() {
        return carsID;
    }

    public void setCarsID(int carsID) {
        this.carsID = carsID;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public double getCarCost() {
        return carCost;
    }

    public void setCarCost(double carCost) {
        this.carCost = carCost;
    }

    public String getCatColor() {
        return catColor;
    }

    public void setCatColor(String catColor) {
        this.catColor = catColor;
    }
}
