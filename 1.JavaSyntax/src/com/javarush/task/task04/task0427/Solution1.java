package com.javarush.task.task04.task0427;

/*
Описываем числа
*/

import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int i = s.length();
        int value = Integer.parseInt(s);


        if (value % 2 == 0) {
            System.out.print("четное");
        } else {
            System.out.print("нечетное");
        }
        if ((value > 0) && (value < 1000)) {

            if (i == 1) {
                System.out.print(" однозначное");
            }
            if (i == 2) {
                System.out.print(" двузначное");
            }
            if (i == 3)
                System.out.print(" трехзначное");
            System.out.println(" число");
        }
    }
}