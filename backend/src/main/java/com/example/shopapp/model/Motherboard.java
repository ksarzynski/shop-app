package com.example.shopapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Motherboard {
    private Long id;
    private String producer;
    private String socket;
    private String memoryType;
    private String chipsetType;
    private int memorySpace;
    private String standard;
    private double price;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
