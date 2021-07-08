package com.example.shopapp.service;

import com.example.shopapp.model.ComputerCase;
import com.example.shopapp.repository.ComputerCaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ComputerCaseService {

    private final ComputerCaseRepository computerCaseRepository;

    public List<ComputerCase> findAllComputerCases(){
        return (List<ComputerCase>) computerCaseRepository.findAll();
    }

    public ComputerCase findComputerCaseById(int id) { return computerCaseRepository.findById(id).orElse(null); }

    public void save(ComputerCase computerCase){ computerCaseRepository.save(computerCase); }
}
