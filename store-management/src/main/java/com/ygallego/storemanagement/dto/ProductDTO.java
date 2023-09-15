package com.ygallego.storemanagement.dto;

import com.ygallego.storemanagement.model.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDTO {

    private Integer id;
    private String name;
    private double price;
    private String description;
    private String category;
    private Integer customerId; // Atributo para el ID del cliente
    private CustomerDTO customerDto; // Atributo para el DTO del cliente

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.description = product.getDescription();
        this.category = product.getCategory();
        this.customerId = product.getCustomer().getId(); // Configura el atributo customerId aquí
    }

    public void setCustomerDto(CustomerDTO customerDto) {
        this.customerDto = customerDto;
    }
}