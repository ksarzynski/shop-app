package com.example.shopapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance
public class ComputerCase extends Product{

    private String producer;
    private String model;
    private String color;
    private int height;
    private int length;
    private int width;

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    @Id
    public Long getId() {
        return id;
    }
}
