package com.example.springboot.controller;

import com.example.springboot.domain.GarlicBear;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hello")
public class GarlicController {
    @GetMapping()
    public GarlicBear get() {
        return new GarlicBear(0, "Hello Spring Boot!");
    }
}