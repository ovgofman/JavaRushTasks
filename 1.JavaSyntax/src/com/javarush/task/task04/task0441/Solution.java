package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader digit = new BufferedReader(new InputStreamReader(System.in));
        double num1 = Integer.parseInt(digit.readLine());
        double num2 = Integer.parseInt(digit.readLine());
        double num3 = Integer.parseInt(digit.readLine());

        double arr [] = {num1, num2, num3};
        Arrays.sort(arr);

        System.out.println(arr[1]);
    }
}
