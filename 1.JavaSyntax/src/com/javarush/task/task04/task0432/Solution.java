package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String text = in.readLine();
        int times = Integer.parseInt(in.readLine());

        while (times > 0) {
            System.out.println(text);
            times--;
        }

    }
}
