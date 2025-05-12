package com.example.demo.controller;

import com.example.demo.Service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/v1")
@CrossOrigin("*")
public class ConverterController {

    @Autowired
    private ConverterService converterService;

//    @GetMapping("/convert")
//    public void convert() {
//        for (int i = 0; i <= 100; i++) {
//            convertedStrings.add(converterService.convertNumbers(i));
//
//        }
//        for (String convertedString : convertedStrings) {
//            System.out.println(convertedString);
//        }
//
//    }

    @GetMapping("/convert")
    public void convert() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " -> " + converterService.convertNumbers(i));
        }
    }
}
