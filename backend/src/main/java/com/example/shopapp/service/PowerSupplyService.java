package com.example.shopapp.service;

import com.example.shopapp.model.PowerSupply;
import com.example.shopapp.repository.PowerSupplyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PowerSupplyService {

    private final PowerSupplyRepository powerSupplyRepository;

    public List<PowerSupply> findAll(){ return (List<PowerSupply>) powerSupplyRepository.findAll(); }

    public PowerSupply find(int id) { return powerSupplyRepository.findById(id).orElse(null); }

    public void save(PowerSupply powerSupply){ powerSupplyRepository.save(powerSupply); }
}
