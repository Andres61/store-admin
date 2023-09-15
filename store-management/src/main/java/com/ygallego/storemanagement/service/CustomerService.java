package com.ygallego.storemanagement.service;

import com.ygallego.storemanagement.dto.CustomerDTO;
import com.ygallego.storemanagement.model.Customer;
import com.ygallego.storemanagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private  CustomerFactoryService customerFactoryService;
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerDTO save(CustomerDTO customerDTO){
        return customerFactoryService.createCustomerDTO(customerRepository.save(customerFactoryService.createCustomer(customerDTO)));
    }
    public List<CustomerDTO> findAll(){
        return customerFactoryService.createCustomersDTO(customerRepository.findAll());
    }
    public CustomerDTO findById(Integer id){
        return customerFactoryService.createCustomerDTO(customerRepository.findById(id).get());
    }
    public void deleteById(Integer id){
        customerRepository.deleteById(id);
    }
}
