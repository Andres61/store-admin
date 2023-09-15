package com.ygallego.storemanagement.service;

import com.ygallego.storemanagement.dto.ProductDTO;
import com.ygallego.storemanagement.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductFactoryService {

    public Product createProduct(ProductDTO productDTO){
        return new Product(productDTO);
    }

    public ProductDTO createProductDTO(Product product){
        return new ProductDTO(product);
    }
    public List<ProductDTO> createProductDTO(List<Product>products){
        List<ProductDTO>productDTOS = new ArrayList<>();
        products.stream().forEach(
                product -> {
                    productDTOS.add(new ProductDTO(product));
                }
        );
        return productDTOS;
    }
}
