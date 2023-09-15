package com.ygallego.storemanagement.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Data
@NoArgsConstructor
public class FoodProduct  extends Product{

    private LocalDateTime expirationDate;

}
