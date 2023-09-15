package com.ygallego.storemanagement.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ClothingProduct extends Product{
    private String size;
}
