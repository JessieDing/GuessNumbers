package com.jessie;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumGenerator {
    public Set<Integer> generate() {
        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < 4) {
            numberSet.add(new Random().nextInt(10));
        }
        return numberSet;
    }
}