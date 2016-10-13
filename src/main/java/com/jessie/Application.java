package com.jessie;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("你有6次机会!每次输入四个(0-9)数字:");

        int count = 6;
        int i;
        String inputNum;
        String randomNum;
        Scanner scanner = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        RandomNumGenerator randomNumGenerator = new RandomNumGenerator();
        randomNum = randomNumGenerator.getRandomNum();
        for (i = 0; i < count; i++) {
            inputNum = scanner.next();
            if (inputNum.length() != randomNumGenerator.getSize()) {
                System.out.println("请输入四个数字");
                continue;   //???为什么用continue
            }
            guessNumber.getResult(randomNum,inputNum);
            if (guessNumber.getA() == randomNumGenerator.getSize()) {
                System.out.println("恭喜你猜中了！");
            } else {
                int j = count - i - 1;
                System.out.println("你还有" + j + "次机会");
            }
        }
        if (i >= count) {
            System.out.println("很遗憾，正确答案是" + randomNum);
        }
    }
}
//        RandomNumGenerator randomNumGenerator = new RandomNumGenerator();
//        String randomNumber = String.valueOf(randomNumGenerator.generate());
//        for (int i = 0; i < 6; i++) {
//            System.out.println("请输入四个数字（0到9）：");
//
//            Input input = new Input();
//            String inputNumber;
//            inputNumber = input.readInput();
//            String[] splitString = inputNumber.split("");
//            Arrays.sort(splitString);
//            for (int j = 1; j < splitString.length; j++) {
//                if (Objects.equals(splitString[j], splitString[j - 1]) || splitString.length != 4) {
//                    System.out.println("输入不正确，请重新输入：");
//                }
//                    GuessNumber guessNumber = new GuessNumber();
//                    guessNumber.getResult(randomNumber, inputNumber);

//            }
//
//
//        }