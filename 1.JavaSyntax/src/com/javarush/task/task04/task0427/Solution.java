package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(in.readLine());

        if (v > 0 && v < 1000) {
            String s = v % 2 == 0 ? "четное " : "нечетное ";
            s += v/100 > 0 ? "трехзначное" : v/10 > 0 ? "двузначное" : "однозначное";

            System.out.print(s);
            System.out.println(" число");
        }
    }
}
