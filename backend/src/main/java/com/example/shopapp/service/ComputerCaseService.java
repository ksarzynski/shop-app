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
}
