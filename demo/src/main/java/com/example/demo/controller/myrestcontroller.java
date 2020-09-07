package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myrestcontroller {
    @GetMapping("/hello")
    public String Hello(){
        return "anees";
    }
}
