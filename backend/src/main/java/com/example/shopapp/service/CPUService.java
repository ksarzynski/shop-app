package com.example.shopapp.service;

import com.example.shopapp.model.CPU;
import com.example.shopapp.repository.CPURepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CPUService {

    private final CPURepository cpuRepository;

    public List<CPU> findAllCPUs(){
        return (List<CPU>) cpuRepository.findAll();
    }

    public CPU findCPUById(int id) { return cpuRepository.findById(id).orElse(null); }

    public void save(CPU cpu){ cpuRepository.save(cpu); }
}
