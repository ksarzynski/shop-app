package com.example.shopapp.service;

import com.example.shopapp.model.Mouse;
import com.example.shopapp.repository.MouseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MouseService {

    private final MouseRepository mouseRepository;

    public List<Mouse> findAll(){ return (List<Mouse>) mouseRepository.findAll(); }

    public Mouse find(int id) { return mouseRepository.findById(id).orElse(null); }

    public void save(Mouse mouse){ mouseRepository.save(mouse); }
}
