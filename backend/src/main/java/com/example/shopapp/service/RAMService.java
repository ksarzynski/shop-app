package com.example.shopapp.service;

import com.example.shopapp.model.RAM;
import com.example.shopapp.repository.RAMRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RAMService {

    private final RAMRepository ramRepository;

    public List<RAM> findAll(){ return (List<RAM>) ramRepository.findAll(); }

    public RAM find(int id) { return ramRepository.findById(id).orElse(null); }

    public void save(RAM powerSupply){ ramRepository.save(powerSupply); }
}
