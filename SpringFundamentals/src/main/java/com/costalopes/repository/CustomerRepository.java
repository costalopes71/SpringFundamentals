package com.costalopes.repository;

import com.costalopes.model.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();

}
