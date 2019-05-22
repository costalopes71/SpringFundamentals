package com.costalopes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.costalopes.model.Customer;
import com.costalopes.repository.CustomerRepository;

@Service("customerService")
//@Scope("singleton")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CustomerServiceImpl implements CustomerService {
	
//	@Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {
    	
    }
    
//    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
    	System.out.println("Using constructor injection");
    	this.customerRepository = customerRepository;
    }
    
    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
    	System.out.println("Using setter injection");
    	this.customerRepository = customerRepository;
    }
    
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}