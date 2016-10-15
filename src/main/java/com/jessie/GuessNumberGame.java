package com.jessie;

import java.util.Arrays;
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

    public static boolean checkInputNumLength(String inputNum) {
        String[] inputNumArr = inputNum.split("");
        if (inputNumArr.length != 4) {
            print("请输入四个数字");
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkRepeatedInputNum(String inputNo) {
        String[] inputNoArr = inputNo.split("");   //玩家通过input输入的字符串，分割为数组，命名为inputNumSet？
        Arrays.sort(inputNoArr);
        for (int i = 1; i < inputNoArr.length; i++) {
            if (inputNoArr[i].equals(inputNoArr[i - 1])) {
                print("数字重复，请重新输入");
                return false;
                /*
                 //return 就会跳出整个方法，不会继续下面的代码
                 break 只是跳出当前循环
                 */
            }
        }
        return true;
    }

    public static boolean runGame(String answerNumber) {  //guessNumber可用通过input()拿到，所以不用作为参数传递进去

        // 传入参数命名，如果名为answer，与之前getAnswer方法中的answer有无关联或影响？？ 或：各方法中传入参数的命名可否相同？？

        boolean isSuccess = false;

        for (int i = 0; i < 6; i++) {

            String guessNumber = input();   //在这里input
            if (!checkInputNumLength(guessNumber) || !checkRepeatedInputNum(guessNumber)) {
                continue;
                /*
                //之前只用了input()，没有拿到input（）方法的返回值
                所以没有更新guessNumber
                 */
            }

            int A = 0;
            int B = 0;
            String[] answerNumberArr = answerNumber.split("");
            String[] guessNumberArr = guessNumber.split("");

            //上面四行放在第一个for循环内？

            for (int x = 0; x < 4; x++) {
                if (answerNumberArr[x].equals(guessNumberArr[x])) {
                    A++;
                }
            }
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {
                    if (answerNumberArr[y].equals(guessNumberArr[z])) {
                        B++;
                        break;
                    }
                }
            }
            B -= A;
            System.out.println(A + "A" + B + "B"); //运行程序时，每次运行这行都会打印？

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
        String answer = generateAnswer();
        print("一起来玩儿猜数字游戏吧！");
        print("你有6次机会!每次输入四个(0-9)数字");
        print("预备，开始！");
        boolean isSuccess = runGame(answer);  //此处isSuccess与runGame方法中的isSucess重名，有无影响？
        printResult(isSuccess);
    }
    // 怎么用check方法？在6次循环内？需要break否？
    //第一次就猜对了，还会继续剩下5次循环？？
}

