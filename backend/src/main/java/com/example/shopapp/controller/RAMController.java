package com.example.shopapp.controller;

import com.example.shopapp.model.RAM;
import com.example.shopapp.service.RAMService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping(path="rams")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class RAMController {

    private final RAMService ramService;

    @GetMapping
    public ResponseEntity<List<RAM>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(ramService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RAM> find(@PathVariable int id){
        return status(HttpStatus.OK).body(ramService.find(id));
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody RAM ram){
        ramService.save(ram);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
