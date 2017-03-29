package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());
        int count = 0;

        if (a > 0) {
            count += 1;
        }
        if (b > 0) {
            count += 1;
        }
        if (c > 0) {
            count += 1;
        }
        System.out.println(count);


    }
}
