package com.example.shopapp.controller;

import com.example.shopapp.model.Mouse;
import com.example.shopapp.service.MouseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@Controller
@RequestMapping(path="mouse")
@AllArgsConstructor
public class MouseController {

    private final MouseService mouseService;

    @GetMapping
    public ResponseEntity<List<Mouse>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(mouseService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mouse> find(@PathVariable int id){
        return status(HttpStatus.OK).body(mouseService.find(id));
    }

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody Mouse mouse){
        mouseService.save(mouse);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
