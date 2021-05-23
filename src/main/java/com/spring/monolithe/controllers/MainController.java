package com.spring.monolithe.controllers;

import com.spring.monolithe.clients.ConfigurationClient;
import com.spring.monolithe.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/main")
public class MainController {



    @GetMapping
    public String getHello() {
        return "Hello!";
    }


    
    
}
