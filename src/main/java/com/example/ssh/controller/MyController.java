package com.example.ssh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping
    public String test() {
        return "auto deploy";
    }
}
