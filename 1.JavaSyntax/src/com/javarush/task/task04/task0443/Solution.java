package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader typeYourOwnInformation = new BufferedReader(new InputStreamReader(System.in));

        String name = typeYourOwnInformation.readLine();
        int yy = Integer.parseInt(typeYourOwnInformation.readLine());
        int mm = Integer.parseInt(typeYourOwnInformation.readLine());
        int dd = Integer.parseInt(typeYourOwnInformation.readLine());


        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + dd + "." + mm + "." + yy);
    }
}
