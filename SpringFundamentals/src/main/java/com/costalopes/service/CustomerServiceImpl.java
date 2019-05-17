package com.costalopes.service;

import com.costalopes.model.Customer;
import com.costalopes.repository.CustomerRepository;
import com.costalopes.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
