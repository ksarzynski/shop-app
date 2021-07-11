package com.example.shopapp.service;

import com.example.shopapp.model.Keyboard;
import com.example.shopapp.repository.KeyboardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class KeyboardService {

    private final KeyboardRepository keyboardRepository;

    public List<Keyboard> findAll(){ return (List<Keyboard>) keyboardRepository.findAll(); }

    public Keyboard find(int id) { return keyboardRepository.findById(id).orElse(null); }

    public void save(Keyboard keyboard){ keyboardRepository.save(keyboard); }
}
