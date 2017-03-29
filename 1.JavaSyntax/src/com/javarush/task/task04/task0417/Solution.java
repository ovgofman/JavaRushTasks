package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());

        if (a == b || a == c) {
            System.out.print(a+" ");
        }
        if (b == a || b == c) {
            System.out.print(b+" ");
        }
        if (c == a || c == b) {
            System.out.print(c);
        }
    }
}