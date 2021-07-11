package com.example.shopapp.service;

import com.example.shopapp.model.Motherboard;
import com.example.shopapp.repository.MotherboardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MotherboardService {

    private final MotherboardRepository motherboardRepository;

    public List<Motherboard> findAll(){ return (List<Motherboard>) motherboardRepository.findAll(); }

    public Motherboard find(int id) { return motherboardRepository.findById(id).orElse(null); }

    public void save(Motherboard motherboard){ motherboardRepository.save(motherboard); }
}
