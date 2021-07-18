package com.example.shopapp.controller;

import com.example.shopapp.model.GPU;
import com.example.shopapp.service.GPUService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping(path="gpus")
@AllArgsConstructor
public class GPUController {

    private final GPUService gpuService;

    @GetMapping
    public ResponseEntity<List<GPU>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(gpuService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GPU> find(@PathVariable int id){
        return status(HttpStatus.OK).body(gpuService.find(id));
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody GPU gpu){
        gpuService.save(gpu);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
