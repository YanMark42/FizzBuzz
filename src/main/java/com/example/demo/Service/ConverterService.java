package com.example.demo.Service;

import com.example.demo.Converter.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ConverterService {

    @Autowired
    private List<Converter> converters;

    public ConverterService() {
//        converters = new ArrayList<>();
//        converters.add(new Contains3());
//        converters.add(new Contains5());
//        converters.add(new MultipleOf3());
//        converters.add(new MultipleOf5());
    }

//    public String convertNumbers(int i) {
//        for (Converter converter : converters) {
//            if (converter.accept(i)) {
//                return converter.convert(i);
//            }
//        }
//        return String.valueOf(i);
//    }

//    public String convertNumbers(int i) {
//        String convertedNumber = "";
//        for (Converter converter : converters) {
//            if (converter.accept(i)) {
//                convertedNumber += converter.convert(i);
//            }
//        }
//        return !convertedNumber.isEmpty() ? convertedNumber : String.valueOf(i);
//    }

    public String convertNumbers(int i) {
        Set<String> converted = new HashSet<>();

        for (Converter converter : converters) {
            if (converter.accept(i)) {
                converted.add(converter.convert(i));
            }
        }

        if (converted.isEmpty()) {
//            return String.valueOf(i);
            return "";
        } else {
            String result = "";
            for (String s : converted) {
                result += s;
            }
            return result;
        }
    }

}