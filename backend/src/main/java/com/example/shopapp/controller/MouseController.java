package com.example.shopapp.controller;

import com.example.shopapp.repository.MouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="mouse")
public class MouseController {

    @Autowired
    private MouseRepository mouseRepository;
}
