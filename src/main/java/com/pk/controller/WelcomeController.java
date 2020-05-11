package com.pk.controller;

//import org.kopitubruk.util.json.JSONUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.service.utility.json.JsonUtil;

@RestController
public class WelcomeController {
    @RequestMapping(value = {"", "/"})
    public String WelcomePrasantaBank() {
        return "Welcome to Prasanta Bank Service";

    }
}
