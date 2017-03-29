package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());

        int[] arr = {a, b, c};
        for (int i = 0; i < arr.length; i++) {

            Arrays.sort(arr);
        }
        System.out.print(arr[2] + " " + arr[1] + " " + arr[0] + " ");


    }
}
