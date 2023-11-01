package com.example.pract2up.models;

import java.util.Date;

public class People {
    private int peopleID;
    private String fullName;
    private int personAge;
    private String email;
    private String personBirth;

    public People(int peopleID, String fullName, int personAge, String email, String personBirth) {
        this.peopleID = peopleID;
        this.fullName = fullName;
        this.personAge = personAge;
        this.email = email;
        this.personBirth = personBirth;
    }

    public int getPeopleID() {
        return peopleID;
    }

    public void setPeopleID(int peopleID) {
        this.peopleID = peopleID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonBirth() {
        return personBirth;
    }

    public void setPersonBirth(String personBirth) {
        this.personBirth = personBirth;
    }
}
