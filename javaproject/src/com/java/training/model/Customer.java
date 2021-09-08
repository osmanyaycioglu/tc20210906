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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + this.age;
        result = (prime * result) + this.height;
        result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
        result = (prime * result) + ((this.surname == null) ? 0 : this.surname.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Customer other = (Customer) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!this.name.equals(other.name)) {
            return false;
        }
        if (this.surname == null) {
            if (other.surname != null) {
                return false;
            }
        } else if (!this.surname.equals(other.surname)) {
            return false;
        }
        return true;
    }


}
