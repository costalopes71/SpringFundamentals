package com.costalopes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costalopes.model.Customer;
import com.costalopes.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

//	@Autowired -- using member class autowire
    private CustomerRepository customerRepository;

    @Autowired // using setter injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Using setter injection!");
    		this.customerRepository = customerRepository;
	}

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
