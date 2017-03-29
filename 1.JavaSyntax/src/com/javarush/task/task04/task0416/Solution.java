package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double minutes = Double.parseDouble(in.readLine());

        if (minutes % 5 < 3) {
            System.out.print("зелёный");
        } else if (minutes % 5 >= 3 && minutes % 5 < 4) {
            System.out.print("желтый");
        } else {
            System.out.print("красный");
        }
    }
}


