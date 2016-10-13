package com.jessie;

import java.util.Arrays;

/**
 * Created by Woody on 2016/10/12.
 */
public class InputNumCheck {
    public String check(String inputNo) {  //???传参数
        String[] splitString = inputNo.split("");
        Arrays.sort(splitString);
        for (int i = 1; i < splitString.length; i++) {
            if (splitString[i] == splitString[i - 1]||splitString.length != 4) {
                System.out.println("输入不正确，请重新输入：");
            }
        }
        return "";
    }
}
