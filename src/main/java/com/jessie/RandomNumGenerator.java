package com.jessie;


import java.util.Random;

public class RandomNumGenerator {
    private static final int SIZE = 4;

    private String randomNum = "";

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

    public int getSize() {       // ???为什么getSize，因为外面拿不到size，SIZE是private的
        return SIZE;
    }
}