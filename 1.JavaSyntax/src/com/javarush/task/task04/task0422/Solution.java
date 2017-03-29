package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name = String.valueOf(in.readLine());
        int age = Integer.parseInt(in.readLine());

        if (age <= 17) {
            System.out.println("Подрасти еще");
        }

    }

}
