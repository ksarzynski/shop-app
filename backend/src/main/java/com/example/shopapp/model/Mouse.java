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
public class Mouse extends Product{

    private String producer;
    private String type;
    private String connectionType;
    private String sensor;
    private int buttons;
    private String color;

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
