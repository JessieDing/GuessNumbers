package com.jessie;

import java.util.Arrays;
import java.util.Objects;

public class Application {
    public static void main(String[] args) {
        RandomNumGenerator randomNumGenerator = new RandomNumGenerator();
        String randomNumber = String.valueOf(randomNumGenerator.generate());
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入四个数字（0到9）：");
            // System.out.println("A表示数字位置均对，B表示含有该数字但位置不对");

            Input input = new Input();
            String inputNumber;
            inputNumber = input.readInput();
            String[] splitString = inputNumber.split("");
            Arrays.sort(splitString);
            for (int j = 1; j < splitString.length; j++) {
                if (Objects.equals(splitString[j], splitString[j - 1]) || splitString.length != 4) {
                    System.out.println("输入不正确，请重新输入：");
                }
                    GuessNumber guessNumber = new GuessNumber();
                    guessNumber.getResult(randomNumber, inputNumber);

            }


        }
    }
}