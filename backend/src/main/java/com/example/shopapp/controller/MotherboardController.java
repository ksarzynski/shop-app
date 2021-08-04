package com.example.shopapp.controller;

import com.example.shopapp.model.Motherboard;
import com.example.shopapp.service.MotherboardService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping(path="motherboards")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class MotherboardController {

    private final MotherboardService motherboardService;

    @GetMapping
    public ResponseEntity<List<Motherboard>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(motherboardService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Motherboard> find(@PathVariable int id){
        return status(HttpStatus.OK).body(motherboardService.find(id));
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody Motherboard motherboard){
        motherboardService.save(motherboard);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
