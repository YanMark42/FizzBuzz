package com.example.demo.Converter;

import org.springframework.stereotype.Component;

@Component
public class Contains3 implements Converter {

    @Override
    public boolean accept(int number) {
        return String.valueOf(number).contains("3");
    }

    @Override
    public String convert(int number) {
        return "Fizz";
    }
}
