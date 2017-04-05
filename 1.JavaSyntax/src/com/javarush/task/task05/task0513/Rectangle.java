package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top, left, width, height;

    public void initialize(int top, int left, int width, int height) {
        this.initialize(top, left, width, height);
    }

    public void initialize(int top, int left) {
        this.initialize(top, left, 0, 0);
    }

    public void initialize(int top, int left, int width) {
        this.initialize(top, left, width, width);
    }

    public void initialize(Rectangle anotherRectangle) {
        this.initialize(anotherRectangle.top, anotherRectangle.left, anotherRectangle.width, anotherRectangle.height);
    }


    public static void main(String[] args) {

    }
}
