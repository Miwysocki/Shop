package com.example.demo.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CustomerService {

    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomers() {
        LOGGER.info("Listing customers");
        return customerRepository.findAll();
    }

    public void addCustomer(Customer customer){
        LOGGER.info("Saving customer " + customer.getName());

        customerRepository.save(customer);
    }
}
