package com.example.shopapp.controller;

import com.example.shopapp.model.Headphones;
import com.example.shopapp.service.HeadphonesService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping(path="headphones")
@AllArgsConstructor
public class HeadphonesController {

    private final HeadphonesService headphonesService;

    @GetMapping
    public ResponseEntity<List<Headphones>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(headphonesService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Headphones> find(@PathVariable int id){
        return status(HttpStatus.OK).body(headphonesService.find(id));
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody Headphones headphones){
        headphonesService.save(headphones);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
