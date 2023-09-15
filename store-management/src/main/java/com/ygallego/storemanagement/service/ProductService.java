package com.ygallego.storemanagement.service;

import com.ygallego.storemanagement.dto.ProductDTO;
import com.ygallego.storemanagement.model.Customer;
import com.ygallego.storemanagement.repository.CustomerRepository;
import com.ygallego.storemanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductFactoryService productFactoryService;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerFactoryService customerFactoryService;

    public ProductDTO save(ProductDTO productDTO) {
        Customer customer = customerRepository.findById(productDTO.getCustomerId())
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        productDTO.setCustomerDto(customerFactoryService.createCustomerDTO(customer));

        return productFactoryService.createProductDTO(productRepository.save(productFactoryService.createProduct(productDTO)));
    }

    public List<ProductDTO> findAll(){
        return productFactoryService.createProductDTO(productRepository.findAll());
    }

    public ProductDTO findById(Integer id){
        return productFactoryService.createProductDTO(productRepository.findById(id).orElseThrow(null));
    }

    public void deleteById(Integer id){
        productRepository.deleteById(id);
    }
}