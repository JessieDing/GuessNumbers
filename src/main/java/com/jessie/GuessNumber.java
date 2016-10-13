package com.jessie;


public class GuessNumber {
    private int a = 0;
    private int b = 0;
    // RandomNumGenerator randomNumGenerator = new RandomNumGenerator();

    public String getResult(String randomNum, String inputNum) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < 4; i++) {
            if (randomNum.charAt(i) == inputNum.charAt(i)) {
                a++;
            }
        }
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                if (randomNum.charAt(j) == inputNum.charAt(k)) {
                    b++;
                }
            }
        }
        b -= a;
        System.out.println(a+"A"+b+"B");
        return "";
    }
}
