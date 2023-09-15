package com.ygallego.storemanagement.model;

import com.ygallego.storemanagement.dto.ProductDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double price;
    private String description;
    private String category;
    @ManyToOne
    private Customer customer;

    public Product(ProductDTO productDTO){
        this.id = productDTO.getId();
        this.name = productDTO.getName();
        this.price = productDTO.getPrice();
        this.description = productDTO.getDescription();
        this.category = productDTO.getCategory();


    }
}
