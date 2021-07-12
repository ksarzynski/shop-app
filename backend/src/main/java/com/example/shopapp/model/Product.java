package com.example.shopapp.model;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public abstract class Product {
    
    Long id;
    String category;
    String name;
    double price;
    int amount;

    public abstract void setId(Long id);

    @Id
    public abstract Long getId();
}
