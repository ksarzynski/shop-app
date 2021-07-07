package com.example.shopapp.controller;

import com.example.shopapp.model.ComputerCase;
import com.example.shopapp.service.ComputerCaseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="computer-cases")
@AllArgsConstructor
public class ComputerCaseController {

    @Autowired
    private final ComputerCaseService computerCaseService;

    @GetMapping
    public ResponseEntity<List<ComputerCase>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(computerCaseService.findAllComputerCases());
    }
}
