package com.example.shopapp.service;

import com.example.shopapp.model.Product;
import com.example.shopapp.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ComputerCaseRepository computerCaseRepository;
    private final CPURepository cpuRepository;
    private final GPURepository gpuRepository;
    private final HardDriveRepository hardDriveRepository;
    private final HeadphonesRepository headphonesRepository;
    private final KeyboardRepository keyboardRepository;
    private final MotherboardRepository motherboardRepository;
    private final MouseRepository mouseRepository;
    private final PowerSupplyRepository powerSupplyRepository;
    private final RAMRepository ramRepository;

    public List<Product> findAll(){
        List<Product> products = new ArrayList<>();
        products.addAll((Collection<? extends Product>) computerCaseRepository.findAll());
        products.addAll((Collection<? extends Product>) cpuRepository.findAll());
        products.addAll((Collection<? extends Product>) gpuRepository.findAll());
        products.addAll((Collection<? extends Product>) hardDriveRepository.findAll());
        products.addAll((Collection<? extends Product>) headphonesRepository.findAll());
        products.addAll((Collection<? extends Product>) keyboardRepository.findAll());
        products.addAll((Collection<? extends Product>) motherboardRepository.findAll());
        products.addAll((Collection<? extends Product>) mouseRepository.findAll());
        products.addAll((Collection<? extends Product>) powerSupplyRepository.findAll());
        products.addAll((Collection<? extends Product>) ramRepository.findAll());
        return products;
    }
}
