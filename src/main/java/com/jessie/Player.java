package com.jessie;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    public Answer guess() {
        Input input = new Input();
        String numberString = input.getInputString();
        List<String> numbers = parseInputToSet(numberString);  //省略this.
        Answer answer = new Answer();
        answer.setNumbers(numbers);
        return answer; //有构造函数时，可直接 return new Answer（numbers）
    }

    private List<String> parseInputToSet(String input) {
        List<String> result = new ArrayList<>();
        String[] digits = input.split("");
        Collections.addAll(result, digits);
//        for (String stringNumber : digits) {
//            result.add(stringNumber);
//        }
        return result;
    }
}
