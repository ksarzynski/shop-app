package com.example.shopapp.controller;

import com.example.shopapp.model.Keyboard;
import com.example.shopapp.service.KeyboardService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@Controller
@RequestMapping(path="keyboards")
@AllArgsConstructor
public class KeyboardController {

    private final KeyboardService keyboardService;

    @GetMapping
    public ResponseEntity<List<Keyboard>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(keyboardService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Keyboard> find(@PathVariable int id){
        return status(HttpStatus.OK).body(keyboardService.find(id));
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody Keyboard keyboard){
        keyboardService.save(keyboard);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
