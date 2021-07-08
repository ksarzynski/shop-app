package com.example.shopapp.service;

import com.example.shopapp.model.Headphones;
import com.example.shopapp.repository.HeadphonesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HeadphonesService {

    private final HeadphonesRepository headphonesRepository;

    public List<Headphones> findAllHeadphones(){ return (List<Headphones>) headphonesRepository.findAll(); }

    public Headphones findHeadphonesById(int id) { return headphonesRepository.findById(id).orElse(null); }

    public void save(Headphones headphones){ headphonesRepository.save(headphones); }
}
