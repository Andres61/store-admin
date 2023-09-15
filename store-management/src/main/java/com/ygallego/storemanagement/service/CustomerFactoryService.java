package com.ygallego.storemanagement.service;

import com.ygallego.storemanagement.dto.CustomerDTO;
import com.ygallego.storemanagement.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerFactoryService {

    public Customer createCustomer(CustomerDTO customerDTO) {
        return new Customer(customerDTO);
    }

    public CustomerDTO createCustomerDTO(Customer customer) {
        return new CustomerDTO(customer);
    }

    public List<CustomerDTO> createCustomersDTO(List<Customer> listCustomer) {
        List<CustomerDTO> customerDTOS = new ArrayList<>();
        listCustomer.forEach(customer -> customerDTOS.add(createCustomerDTO(customer)));
        return customerDTOS;
    }
}