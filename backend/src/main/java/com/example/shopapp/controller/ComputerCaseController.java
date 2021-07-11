package com.example.shopapp.controller;

import com.example.shopapp.model.ComputerCase;
import com.example.shopapp.service.ComputerCaseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping(path="computer-cases")
@AllArgsConstructor
public class ComputerCaseController {

    private final ComputerCaseService computerCaseService;

    @GetMapping
    public ResponseEntity<List<ComputerCase>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(computerCaseService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ComputerCase> find(@PathVariable int id){
        return status(HttpStatus.OK).body(computerCaseService.find(id));
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody ComputerCase computerCase){
        computerCaseService.save(computerCase);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
