package com.example.demo;

import com.example.demo.Service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private ConverterService converterService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
