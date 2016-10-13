package com.jessie;


import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        String randomNumSet = new String();
        Random random = new Random();
        int n = 0;
        while (n < 4) {
            String temp = "";
            int i = random.nextInt(10);
            temp += (char) ('0' + i);
            if (!randomNumSet.contains(temp)) {
                randomNumSet += (char) ('0' + i);
                n++;
            }
        }
        String[] str1 = randomNumSet.split("");

        System.out.println("一起来玩儿猜数字游戏吧！");
        System.out.println("你有6次机会!每次输入四个(0-9)数字");
        System.out.println("预备，开始：");

        for (int i = 0; i < 6; i++) {

            Scanner scanner = new Scanner(System.in);
            String inputNum = scanner.nextLine();
            String[] str2 = inputNum.split("");

            int A = 0;
            int B = 0;

            if (str2.length != 4) {
                System.out.println("请输入四个数字");
                continue;
            }

            for (int x = 0; x < 4; x++) {
                if (Objects.equals(str1[x], str2[x])) {
                    A++;
                }
            }
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {
                    if (Objects.equals(str1[y], str2[z])) {
                        B++;

                        break;
                    }
                }
            }
            B -= A;
            System.out.println(A + "A" + B + "B");
        }
            System.out.println("很遗憾，正确答案是" + randomNumSet);
        }
    }
