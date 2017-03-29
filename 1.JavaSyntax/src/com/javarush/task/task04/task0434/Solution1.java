package com.javarush.task.task04.task0434;


/*
Таблица умножения
*/

import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        int x = 1, y = 1;
        while (10 >= x) {
            y++;
            while (10>=y) {
                ++x;
                System.out.print(x * y + " ");
            }
        }

    }
}
