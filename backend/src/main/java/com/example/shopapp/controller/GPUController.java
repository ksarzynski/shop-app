package com.example.shopapp.controller;

import com.example.shopapp.repository.GPURepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="GPU")
public class GPUController {

    @Autowired
    private GPURepository gpuRepository;
}
