package com.example.shopapp.controller;

import com.example.shopapp.model.HardDrive;
import com.example.shopapp.service.HardDriveService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping(path="hard-drives")
@AllArgsConstructor
public class HardDriveController {

    private final HardDriveService hardDriveService;

    @GetMapping
    public ResponseEntity<List<HardDrive>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(hardDriveService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HardDrive> find(@PathVariable int id){
        return status(HttpStatus.OK).body(hardDriveService.find(id));
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody HardDrive hardDrive){
        hardDriveService.save(hardDrive);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
