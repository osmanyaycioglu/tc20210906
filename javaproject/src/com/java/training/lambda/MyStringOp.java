package com.java.training.lambda;


public class MyStringOp {

    private String name;
    private String surname;

    public String mr() {
        return "Mr " + this.name + " " + this.surname;
    }

    public String dear() {
        return "Dear " + this.name + " " + this.surname;
    }

    public String ff() {
        return this.name + " " + this.surname + " FF";
    }


    public String getName() {
        return this.name;
    }


    public void setName(final String nameParam) {
        this.name = nameParam;
    }


    public String getSurname() {
        return this.surname;
    }


    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }


}
