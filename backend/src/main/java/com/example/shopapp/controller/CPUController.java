package com.example.shopapp.controller;

import com.example.shopapp.repository.CPURepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="CPU")
public class CPUController {

    @Autowired
    private CPURepository cpuRepository;
}
