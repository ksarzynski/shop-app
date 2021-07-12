package com.example.shopapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HardDrive extends Product{

    private String producer;
    private String type;
    private int size;
    private String usbInterface;
    private String format;

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
