package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String s = "S";
        int x = 10;
        while (x > 0) {
            int y = 10;
            while (y > 0) {
                System.out.print(s);
                y--;
            }
            System.out.print("\n");
            x--;

        }
    }
}