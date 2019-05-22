package com.costalopes.repository;

import com.costalopes.model.Customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
    @Override
    public List<Customer> findAll() {

    	System.out.println("DBUsername: " + dbUsername);
    	
    	List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Joao");
        customer.setLastName("Lopes");

        customers.add(customer);

        return customers;
    }

}
