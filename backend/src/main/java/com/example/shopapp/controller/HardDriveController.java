package com.example.shopapp.controller;

import com.example.shopapp.repository.HardDriveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="HardDrive")
public class HardDriveController {

    @Autowired
    private HardDriveRepository hardDriveRepository;
}
