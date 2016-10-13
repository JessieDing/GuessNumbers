package com.jessie;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumGenerator {
    private String RandomNum = "";
    private static final int SIZE = 4;

    public Set<Integer> generate() {
        Set<Integer> numberSet = new HashSet<>();
        int n = 0;
        while (n < SIZE) {
            numberSet.add(new Random().nextInt(10));
        }
        return numberSet;
    }
}