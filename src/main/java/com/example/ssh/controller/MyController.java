package com.example.ssh.controller;

import com.example.ssh.model.ListNode;
import com.example.ssh.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/{name}")
    public ListNode test(@PathVariable String name) {
        return myService.makeFromString(name);
    }
}
