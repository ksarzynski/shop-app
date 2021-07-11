package com.example.shopapp.service;

import com.example.shopapp.model.GPU;
import com.example.shopapp.repository.GPURepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GPUService {

    private final GPURepository gpuRepository;

    public List<GPU> findAll(){
        return (List<GPU>) gpuRepository.findAll();
    }

    public GPU find(int id) { return gpuRepository.findById(id).orElse(null); }

    public void save(GPU gpu){ gpuRepository.save(gpu); }
}
