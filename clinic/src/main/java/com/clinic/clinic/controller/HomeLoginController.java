package com.clinic.clinic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeLoginController {

    @GetMapping("/")
    public String loginMessage() {
        return "Please log in/ sign in";
    }
}
