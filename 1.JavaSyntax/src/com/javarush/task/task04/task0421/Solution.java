package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String f_name = String.valueOf(in.readLine());
        String s_name = String.valueOf(in.readLine());

        if (f_name.equals(s_name)) {
            System.out.println("Имена идентичны");
        }
        if (!f_name.equals(s_name) && (f_name.length() == s_name.length())) {
            System.out.println("Длины имен равны");
        }
    }
}
