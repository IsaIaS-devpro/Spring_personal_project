package com.example.spring_project.controller;

import com.example.spring_project.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
@Autowired
    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }


    // GET = /hello-world
    @GetMapping
    public String helloWorld() {
        return helloWorldService.getHelloMessage(" isaias"); // Chama o método correto do serviço
    }
}
