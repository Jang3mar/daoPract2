package com.example.pract2up.models;

public class Animals {
    private int animalID;
    private String type;
    private String animalName;
    private int animalAge;
    private String animalColor;

    public Animals(int animalID, String type, String animalName, int animalAge, String animalColor) {
        this.animalID = animalID;
        this.type = type;
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.animalColor = animalColor;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }
}
