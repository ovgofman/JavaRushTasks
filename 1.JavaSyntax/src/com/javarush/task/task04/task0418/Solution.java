package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        int num1 = Integer.parseInt(in.readLine());

        if (num < num1) {
            System.out.println(num);
        } else {
            System.out.println(num1);
        }
    }
}