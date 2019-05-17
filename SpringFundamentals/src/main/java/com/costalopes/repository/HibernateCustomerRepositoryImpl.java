package com.costalopes.repository;

import com.costalopes.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Joao");
        customer.setLastName("Lopes");

        customers.add(customer);

        return customers;
    }

}
