package com.example.ssh.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class MyService {
    public String test() throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        Process process = processBuilder.command("echo ${pwd}").start();
        InputStream inputStream = process.getInputStream();
        return new String(inputStream.readAllBytes());
    }
}
