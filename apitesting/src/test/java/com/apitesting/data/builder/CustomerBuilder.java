package com.apitesting.data.builder;

import com.apitesting.data.models.Customer;
import com.apitesting.data.secret.Secrets;

public class CustomerBuilder {
    private String name;

    public static CustomerBuilder aCustomer() {
        return new CustomerBuilder();
    }

    public CustomerBuilder named(String name) {
        this.name = name;
        return this;
    }

    public Customer build(){
        String email = name.toLowerCase()+ "@tripstack.test";
        String password = Secrets.get(name.toUpperCase()+ "_PASSWORD");
        return new Customer(email,password);
    }
}
