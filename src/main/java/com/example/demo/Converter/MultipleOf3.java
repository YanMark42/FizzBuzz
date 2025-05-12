package com.example.demo.Converter;

import org.springframework.stereotype.Component;

@Component
public class MultipleOf3 implements Converter {

    @Override
    public boolean accept(int number) {
        return number % 3 == 0;
    }

    @Override
    public String convert(int number) {
        return "Fizz";
    }
}
