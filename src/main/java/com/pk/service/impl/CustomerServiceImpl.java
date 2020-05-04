package com.pk.service.impl;

import com.pk.model.Customer;
import com.pk.repository.AccountRepository;
import com.pk.repository.CustomerRepository;
import com.pk.service.business.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer insertCustomer(Customer customer) {
        return null;
    }
}
