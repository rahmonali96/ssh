package com.example.ssh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Controller
public class MyController {
    @GetMapping
    public String test() {
        return "index";
    }

    @GetMapping("/pwd")
    @ResponseBody
    public String pwd(ProcessBuilder processBuilder) {
        try {
            return new String(processBuilder.command("${pwd}").start().getInputStream().readAllBytes());
        } catch (IOException e) {
            return "exception";
        }
    }
}
