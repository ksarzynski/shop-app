package com.example.shopapp.controller;

import com.example.shopapp.repository.KeyboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="Keyboard")
public class KeyboardController {

    @Autowired
    private KeyboardRepository keyboardRepository;
}
