package com.example.shopapp.service;

import com.example.shopapp.model.HardDrive;
import com.example.shopapp.repository.HardDriveRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HardDriveService {

    private final HardDriveRepository hardDriveRepository;

    public List<HardDrive> findAll(){
        return (List<HardDrive>) hardDriveRepository.findAll();
    }

    public HardDrive find(int id) { return hardDriveRepository.findById(id).orElse(null); }

    public void save(HardDrive hardDrive){ hardDriveRepository.save(hardDrive); }
}
