package com.java.training.model;


public class Customer {

    private String name;
    private String surname;
    private int    age;
    private int    height;

    public String getName() {
        return this.name;
    }

    public Customer setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public String getSurname() {
        return this.surname;
    }

    public Customer setSurname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

    public int getAge() {
        return this.age;
    }

    public Customer setAge(final int ageParam) {
        this.age = ageParam;
        return this;
    }

    public int getHeight() {
        return this.height;
    }

    public Customer setHeight(final int heightParam) {
        this.height = heightParam;
        return this;
    }


}
