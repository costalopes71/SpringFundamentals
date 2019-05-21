package com.costalopes.service;

import java.util.List;

import com.costalopes.model.Customer;
import com.costalopes.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {

    }
    
    public CustomerServiceImpl(CustomerRepository repository) {
    		this.customerRepository = repository;
    }
    
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

//	public void setFooRepository(CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}
	
	@Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
