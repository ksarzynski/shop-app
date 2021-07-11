package com.example.shopapp.controller;

import com.example.shopapp.model.CPU;
import com.example.shopapp.service.CPUService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@Controller
@RequestMapping(path="cpus")
@AllArgsConstructor
public class CPUController {

    private final CPUService cpuService;

    @GetMapping
    public ResponseEntity<List<CPU>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(cpuService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CPU> find(@PathVariable int id){
        return status(HttpStatus.OK).body(cpuService.find(id));
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody CPU cpu){
        cpuService.save(cpu);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
