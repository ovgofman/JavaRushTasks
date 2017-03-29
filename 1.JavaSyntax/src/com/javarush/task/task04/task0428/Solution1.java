package com.javarush.task.task04.task0428;

/*
Положительное число
*/

import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(in.readLine()) > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
