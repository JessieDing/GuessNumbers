package com.jessie;


import java.util.Random;

public class RandomNumGenerator {
    private String randomNum = "";
    private static final int SIZE = 4;

    public String getRandomNum() {
        Random random = new Random();
        int n = 0;
        while (n < SIZE) {
            String temp = "";
            int i = random.nextInt(10);
            temp += (char)('0' + i);
            if (!randomNum.contains(temp)){
                randomNum+=(char)('0'+i);
                n++;
            }
        }
        return"";
    }
    public int getSize() {       // ???为什么getSize
        return SIZE;
    }
}