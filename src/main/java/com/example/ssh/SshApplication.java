package com.example.ssh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SshApplication {
    @GetMapping
    public String test() {
        return "test";
    }

    public static void main(String[] args) {
        SpringApplication.run(SshApplication.class, args);
    }

}
