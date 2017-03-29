package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        convertEurToUsd(5, 1.2);
        convertEurToUsd(25, 1.2);


    }

    public static double convertEurToUsd(int eur, double course) {
double us = eur*course;
        return us;
    }
}