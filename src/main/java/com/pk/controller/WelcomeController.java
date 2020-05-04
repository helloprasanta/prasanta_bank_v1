package com.pk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping(value = {"", "/"})
    public String WelcomePrasantaBank() {
        return "Welcome to Prasanta Bank Service";
    }
}
