package com.microservice.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    String sayHello() {
        return "Hello World from Payment Microservice";
    }

}
