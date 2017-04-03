package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader typeDigits = new BufferedReader(new InputStreamReader(System.in));

        double summary = 0, next = 0, counter = 0;
        for (; next != -1; next = Double.parseDouble(typeDigits.readLine())) {
            counter++;
            summary += next;
        }
        System.out.println(summary / --counter);
    }
}

