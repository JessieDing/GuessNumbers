package com.jessie;

import java.util.List;

public class GuessNumberGame {
    public void run() {
        Printer printer = new Printer();
        RandomNumberGenerator generator = new RandomNumberGenerator();
        List<String> randomNumbers = generator.generate(); //generate方法有返回值
        Answer answer = new Answer();
        answer.setNumbers(randomNumbers);   //set方法没有返回值
        printer.print("请输入4个不同的数(0~9):");
        Player player = new Player();
        Answer playAnswer = player.guess();
        String gameResult = answer.compareTo(playAnswer);
        printer.print(gameResult);
        printer.print("正确答案是：" + String.join("", answer.getNumbers()));
    }
}
