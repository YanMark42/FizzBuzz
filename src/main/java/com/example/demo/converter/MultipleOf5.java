package com.example.demo.converter;

import org.springframework.stereotype.Component;

@Component
public class MultipleOf5 implements Converter {

    @Override
    public boolean accept(int number) {
        return number % 5 == 0;
    }

    @Override
    public String convert(int number) {
        return "Buzz";
    }
}
