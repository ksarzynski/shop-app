package com.example.shopapp.controller;

import com.example.shopapp.repository.HeadphonesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="Headphones")
public class HeadphonesController {

    @Autowired
    private HeadphonesRepository headphonesRepository;
}
