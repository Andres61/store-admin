package com.ygallego.storemanagement.dto;

import com.ygallego.storemanagement.model.Customer;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class CustomerDTO {
    private Integer id;
    private String name;
    private String email;
    private String phoneNumber;
    private String membershipType;
    @CreationTimestamp
    private LocalDateTime registrationDate;
    private List<ProductDTO> productDTOS;

    public CustomerDTO(Customer customer) {
        this.id = customer.getId();
        this.name = customer.getName();
        this.email = customer.getEmail();
        this.phoneNumber = customer.getPhoneNumber();
        this.membershipType = customer.getMembershipType();
        this.registrationDate = customer.getRegistrationDate();


        this.productDTOS = new ArrayList<>();
        customer.getProducts().forEach(
                product -> productDTOS.add(new ProductDTO(product))
        );

    }
}
