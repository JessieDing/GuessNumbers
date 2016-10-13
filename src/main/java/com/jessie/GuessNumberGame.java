package com.jessie;


import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        String randomNumSet = "";
        Random random = new Random();
        int n = 0;
        while (n < 4) {
            int i = random.nextInt(10);
            String temp = String.valueOf(i);
            if (!randomNumSet.contains(temp)) {
                randomNumSet += temp;
                n++;
            }
        }
        String[] answer = randomNumSet.split("");

        System.out.println("一起来玩儿猜数字游戏吧！");
        System.out.println("你有6次机会!每次输入四个(0-9)数字");
        System.out.println("预备，开始：");

        boolean isSuccess = false;
        for (int i = 0; i < 6; i++) {
            Scanner scanner = new Scanner(System.in);
            String inputNum = scanner.nextLine();
            String[] guessNumber = inputNum.split("");

            int A = 0;
            int B = 0;

            if (guessNumber.length != 4) {
                System.out.println("请输入四个数字");
                continue;
            }

            for (int x = 0; x < 4; x++) {
                if (answer[x].equals(guessNumber[x])) {
                    A++;
                }
            }
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {
                    if (answer[y].equals(guessNumber[z])) {
                        B++;
                        break;
                    }
                }
            }
            B -= A;
            System.out.println(A + "A" + B + "B");
            if (A == 4 & B == 0) {
                isSuccess = true;
                break;
            }
        }
        if (isSuccess) {
            System.out.println("恭喜你答对了！" + randomNumSet);
        }
        else {
            System.out.println("很遗憾，六次机会已用完，正确答案是" + randomNumSet);
        }
    }
}
