package com.jessie;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomNumberGenerator {
    public List<String> generate() {
        Random random = new Random();
        List<String> numbers = new ArrayList<>();
        while (numbers.size() < 4) {
            int index = random.nextInt(10);
            if (!numbers.contains(String.valueOf(index))) {
                numbers.add(String.valueOf(index));
            }
        }
        return numbers;
    }
}

