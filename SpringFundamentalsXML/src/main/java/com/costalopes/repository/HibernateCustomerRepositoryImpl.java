package com.costalopes.repository;

import com.costalopes.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	private String dbUsername;
	
    public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	@Override
    public List<Customer> findAll() {

    	System.out.println("DB username: " + dbUsername);
    	
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Joao");
        customer.setLastName("Lopes");

        customers.add(customer);

        return customers;
    }

}
