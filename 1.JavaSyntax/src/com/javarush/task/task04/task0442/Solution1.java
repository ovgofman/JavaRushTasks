package com.javarush.task.task04.task0442;

/**
 * Created by hofa on 27.03.2017.
 */

import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader typeDigits = new BufferedReader(new InputStreamReader(System.in));

        int summ = 0, digit = 0;

        for (; digit != -1; digit = Integer.parseInt(typeDigits.readLine())) {
            summ += digit;
        }
        System.out.print(summ + digit);
    }
}
