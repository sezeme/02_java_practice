package com.sezeme.chap08.polymorphism.level01.basic;

public class Rectangle extends Shape implements Resizable {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return width*2 + height*2;
    }
}
