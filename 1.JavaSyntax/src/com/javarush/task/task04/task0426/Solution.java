package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int d = Integer.parseInt(in.readLine());

        String s="ноль";
        if(d!=0){
            if(d>0) s="положительное ";
            else s="отрицательное ";
            if(d % 2!=0) s+="не";
            s+="четное число";
        }
        System.out.print(s);

    }
}
