package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int positiveCounter = 0;
        int negativeCounter = 0;

        for (int i = 0; i < 3; i++) {
            int x = Integer.parseInt(in.readLine());
            if (x > 0) {
                positiveCounter++;
            }
            if (x < 0) {
                negativeCounter++;
            }
        }
        System.out.println("количество отрицательных чисел: " + negativeCounter);
        System.out.println("количество положительных чисел: " + positiveCounter);

    }
}
