package com.ygallego.storemanagement.model;

import com.ygallego.storemanagement.dto.CustomerDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String phoneNumber;
    private String membershipType;
    @CreationTimestamp
    private LocalDateTime registrationDate;
    @OneToMany(mappedBy = "customer")
    private List<Product>products;

    public Customer(CustomerDTO customerDTO){
        this.id = customerDTO.getId();
        this.name = customerDTO.getName();
        this.email = customerDTO.getEmail();
        this.phoneNumber = customerDTO.getPhoneNumber();
        this.membershipType = customerDTO.getMembershipType();
        this.registrationDate = customerDTO.getRegistrationDate();

    }
}
