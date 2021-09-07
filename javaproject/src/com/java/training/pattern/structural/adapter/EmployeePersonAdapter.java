package com.java.training.pattern.structural.adapter;

import com.java.training.lib.Employee;
import com.java.training.lib.Person;

public class EmployeePersonAdapter extends Person {

    private final Employee employee;

    public EmployeePersonAdapter(final Employee employeeParam) {
        super();
        this.employee = employeeParam;
    }


    @Override
    public String getName() {
        String[] splitLoc = this.employee.getName()
                                         .split(" ");
        return splitLoc[0];
    }


    @Override
    public String getSurname() {
        String[] splitLoc = this.employee.getName()
                                         .split(" ");
        return splitLoc[1];
    }


    @Override
    public int getHeight() {
        return (int) (this.employee.getHeight() * 33D);
    }


    @Override
    public String toString() {
        return "EmployeePersonAdapter [employee=" + this.employee + "]";
    }


}
