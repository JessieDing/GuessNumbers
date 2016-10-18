package com.jessie;


import java.util.*;


public class RandomNumberGenerator {
    public List<String> generate() {
        Random random = new Random();
        Set<String> numberSet = new HashSet<>();
        while (numberSet.size() < 4) {
            int index = random.nextInt(10);
            numberSet.add(String.valueOf(index));
        }
        return new ArrayList<>(numberSet);
    }
}
