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
public class GPU {
    private Long id;
    private String producer;
    private String chipsetProducer;
    private String model;
    private String memoryType;
    private int memorySize;
    private String cooling;
    private double Price;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
