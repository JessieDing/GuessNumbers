package com.jessie;

import java.util.List;

public class GuessNumberGame {
    public void run() {
        Printer printer = new Printer();
        RandomNumberGenerator generator = new RandomNumberGenerator();
        Answer answer = new Answer();
        GameValidator gameValidator = new GameValidator();
        List<String> randomNumbers = generator.generate(); //generate方法有返回值
        answer.setNumbers(randomNumbers);   //set方法没有返回值
        Player player = new Player();  //for循环外
        for (int i = 0; i < 6; i++) {
            printer.print("请输入4个不同的数(0~9):");
            Answer playerAnswer = player.guess();

            if (!gameValidator.isLengthValid(playerAnswer) || gameValidator.isRepeated(playerAnswer)) {
                continue;
            }

            String gameResult = answer.compareTo(playerAnswer);
            printer.print(gameResult);

            if (gameValidator.isCorrect(answer, playerAnswer)) {
                break;
            }
        }
        printer.print("正确答案是：" + String.join("", answer.getNumbers()));
    }
}
