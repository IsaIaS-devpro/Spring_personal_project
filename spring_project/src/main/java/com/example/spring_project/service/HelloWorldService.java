package com.example.spring_project.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String getHelloMessage(String name) {
        return "Hello, World: " + name;
    }
}
