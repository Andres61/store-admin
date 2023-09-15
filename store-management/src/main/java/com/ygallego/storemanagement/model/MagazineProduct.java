package com.ygallego.storemanagement.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class MagazineProduct extends Product{

    private int issueNumber;
}
