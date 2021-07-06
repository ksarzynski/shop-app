package com.example.shopapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ComputerCase {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
