package com.turntabl.Main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> fibonacci(Integer number) {
        List<Integer> fibList = new ArrayList<>();
        Integer initialNum = 0;
        Integer currNum = 1;

        if (number <= 0) {
            throw new NumberFormatException("Number should be greater than Zero");
        }
        for (int i = 0; i < number; i++){
            Integer fib = initialNum + currNum;

            fibList.add(initialNum);

            initialNum = currNum;
            currNum = fib;
        }

        return fibList;
    }
}
