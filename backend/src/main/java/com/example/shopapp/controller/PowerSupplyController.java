package com.example.shopapp.controller;

import com.example.shopapp.repository.PowerSupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="PowerSupply")
public class PowerSupplyController {

    @Autowired
    private PowerSupplyRepository powerSupplyRepository;
}
