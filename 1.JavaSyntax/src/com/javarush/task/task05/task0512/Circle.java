package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {

    int centerX = 0, centerY = 0, radius = 0, width = 0, color = 0;

    /*
    — centerX, centerY, radius
    — centerX, centerY, radius, width
    — centerX, centerY, radius, width, color
    */
    public void initialize(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void initialize(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public void initialize(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
