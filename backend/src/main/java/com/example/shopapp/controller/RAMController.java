package com.example.shopapp.controller;

import com.example.shopapp.repository.RAMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="RAM")
public class RAMController {

    @Autowired
    private RAMRepository ramRepository;
}
