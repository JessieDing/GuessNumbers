package com.jessie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameValidator {
    private Printer printer = new Printer();

    public boolean isLengthValid(Answer answer) {
        List<String> numbers = answer.getNumbers();
        if (numbers.size() != 4) {
            printer.print("提示：请输入四个数字");
            return false;
        } else {
            return true;
        }
    }

    public boolean isRepeated(Answer answer) {
        List<String> numbers = answer.getNumbers();
        int size = numbers.size();
        String[] verifyNumbersArr = numbers.toArray(new String[size]);
        Arrays.sort(verifyNumbersArr);
        for (int i = 1; i < size; i++) {
            if (verifyNumbersArr[i].equals(verifyNumbersArr[i - 1])) {
                printer.print("提示：请勿输入重复数字");
                return true;
            }
        }
        return false;
    }

    public boolean isCorrect(Answer answer, Answer playerAnswer) {
        ArrayList answerNumbers = (ArrayList) answer.getNumbers();
        ArrayList playerNumbers = (ArrayList) playerAnswer.getNumbers();
        if (!answerNumbers.equals(playerNumbers)) {
            return false;
        } else {
            printer.print("恭喜你答对了！");
            return true;
        }
    }
}
