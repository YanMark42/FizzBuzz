package com.example.demo.Converter;

import org.springframework.stereotype.Component;

@Component
public class Contains5 implements Converter {

    @Override
    public boolean accept(int number) {
        return String.valueOf(number).contains("5");
    }

    @Override
    public String convert(int number) {
        return "Buzz";
    }
}
