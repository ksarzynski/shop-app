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
public class CPU {
    private Long id;
    private String producer;
    private String CPUFamily;
    private String Socket;
    private int threads;
    private int cores;
    private double frequency;
    private double price;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
