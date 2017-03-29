package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());

        if (a == b) {
            System.out.println("3");
        } else {
            if (b == c) {
                System.out.println("1");
            } else {
                if (a == c) {
                    System.out.println("2");
                } else {
                    if (a != b && b != c) {
                        System.out.println("ky-ky moi mal`chik");
                    }
                }
            }
        }
    }
}
