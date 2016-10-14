package com.jessie;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void print(String message) {
        System.out.println(message);
    }

    public static String generateAnswer() {   //public or private???
        String answer = "";  //这里的string 命名为answer，对下面主方法中的命名answer有无影响？
        Random random = new Random();
        int n = 0;
        while (n < 4) {
            int i = random.nextInt(10);
            String randomDigit = String.valueOf(i);
            if (!answer.contains(randomDigit)) {
                answer += randomDigit;
                n++;
            }
        }
        return answer;
    }

    public static String input() {     //public or private???
        Scanner scanner = new Scanner(System.in);   //    ？？不用写：String inputNum = scanner.nextLine();
        return scanner.nextLine();
    }

    public static String checkInputNumLength(String inputNum) {
        if (inputNum.length() != 4) {
            System.out.println("请输入四个数字");
        }
        return "";
    }

    public static String checkRepeatedInputNum(String inputNum) {
        String[] inputNumSet = input().split("");   //玩家通过input输入的字符串，分割为数组，命名为inputNumSet？
        for (int i = 0; i < inputNumSet.length; i++) {
            if (inputNum.contains(inputNumSet[i])) {     //如果该数组中任一元素等于input方法中获取的字符串，则为重复？
                System.out.println("数字重复，请重新输入");
            }
        }
        return "";  //这两处的return，是返回字符串内容，还是别的？
    }

    public static boolean runGame(String answerNumber, String guessNumber) {

        // 传入参数命名，如果名为answer，与之前getAnswer方法中的answer有无关联或影响？？

        boolean isSuccess = false;

        for (int i = 0; i < 6; i++) {
            int A = 0;
            int B = 0;
            String[] answerNumberSet = generateAnswer().split("");
            String[] guessNumberSet = input().split("");

            //上面四行放在第一个for循环内？

            for (int x = 0; x < 4; x++) {
                if (answerNumberSet[x].equals(guessNumberSet[x])) {
                    A++;
                }
            }
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {
                    if (answerNumberSet[y].equals(guessNumberSet[z])) {
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
        return isSuccess;
    }

    public static void printResult(boolean isWhat) {
        if (isWhat) {           //isWhat==true简写
            System.out.println("恭喜你答对了！" + generateAnswer());
        } else {
            System.out.println("很遗憾，六次机会已用完，正确答案是" + generateAnswer());
        }
    }

    public static void main(String[] args) {
        print("一起来玩儿猜数字游戏吧！");
        print("你有6次机会!每次输入四个(0-9)数字");
        print("预备，开始！");
        String answer = generateAnswer();
        String inputNumber = input();
        boolean isSuccess = runGame(answer, inputNumber);  //此处isSuccess与runGame方法中的isSucess重名，有无影响？
        printResult(isSuccess);
    }
}
