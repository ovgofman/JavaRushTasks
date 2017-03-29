package com.javarush.task.task04.task0425;

/*
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());


        System.out.println((a > 0 && b > 0) ? "1" : (a < 0 && b > 0) ? "2" : (a < 0 && b < 0) ? "3" : (a > 0 && b < 0) ? "4" : "");
    }
}
