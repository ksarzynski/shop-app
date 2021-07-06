package com.example.shopapp.controller;

import com.example.shopapp.repository.ComputerCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="ComputerCase")
public class ComputerCaseController {

    @Autowired
    private ComputerCaseRepository computerCaseRepository;
}
