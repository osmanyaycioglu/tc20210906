package com.java.training.pattern.structural.facade;

import com.java.training.model.Customer;

public class CustomerManager {

    private final CustomerFacade cf = new CustomerFacade();


    public void provision(final Customer customer) {
        Customer fillCutomerLoc = this.cf.fillCutomer(customer);
        this.cf.registerCutomer(customer);

    }

}
