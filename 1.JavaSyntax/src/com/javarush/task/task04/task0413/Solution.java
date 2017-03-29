package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(in.readLine());

        System.out.println(day == 1 ? "понедельник" :
                day == 2 ? "вторник" :
                        day == 3 ? "среда" :
                                day == 4 ? "четверг" :
                                        day == 5 ? "пятница" :
                                                day == 6 ? "суббота" :
                                                        day == 7 ? "воскресенье" : "такого дня недели не существует");
    }
}