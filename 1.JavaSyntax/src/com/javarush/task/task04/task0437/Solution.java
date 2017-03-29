package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int digit = 8;
        for (int y = 0; y < 10; y++) {
            System.out.print(digit);
            for (int x = 0; x < y; x++) {
                System.out.print(digit);
            }
            System.out.println();
        }
    }
}
