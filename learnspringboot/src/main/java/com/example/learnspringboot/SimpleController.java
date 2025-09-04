package com.example.learnspringboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SimpleController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
