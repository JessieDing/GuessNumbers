package com.jessie;


import java.util.Objects;

public class GuessNumber_old {
    private int A = 0;
    private int B = 0;
    RandomNumGenerator_old randomNumGeneratorOld = new RandomNumGenerator_old();
    int size = randomNumGeneratorOld.getSize();

    public void getResult(String randomNum, String inputNum) {  //？？？返回值为什么不是String
        A = 0;
        B = 0;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(inputNum.charAt(i), randomNum.charAt(i))) {
                A++;
            }
        }
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                if (Objects.equals(inputNum.charAt(j), randomNum.charAt(k))) {
                    B++;
                    break;  //???为什么要用break
                }
            }
        }
        B -= A;
        System.out.println(A + "A" + B + "B");
    }

    public int getA() {   //???为什么要getA
        return A;
    }
}
