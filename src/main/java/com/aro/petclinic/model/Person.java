package com.aro.petclinic.model;

public class Person  extends BaseEntity{
    private String firsttName;
    private String lastName;

    public String getFirsttName() {
        return firsttName;
    }

    public void setFirsttName(String firsttName) {
        this.firsttName = firsttName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
