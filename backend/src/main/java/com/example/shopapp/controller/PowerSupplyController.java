package com.example.shopapp.controller;

import com.example.shopapp.model.PowerSupply;
import com.example.shopapp.service.PowerSupplyService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@Controller
@RequestMapping(path="power-supplies")
@AllArgsConstructor
public class PowerSupplyController {

    private final PowerSupplyService powerSupplyService;

    @GetMapping
    public ResponseEntity<List<PowerSupply>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(powerSupplyService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PowerSupply> find(@PathVariable int id){
        return status(HttpStatus.OK).body(powerSupplyService.find(id));
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody PowerSupply powerSupply){
        powerSupplyService.save(powerSupply);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
