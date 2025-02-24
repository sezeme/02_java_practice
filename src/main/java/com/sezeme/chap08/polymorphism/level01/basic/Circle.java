package com.sezeme.chap08.polymorphism.level01.basic;

public class Circle extends Shape implements Resizable {
    double radius;

    Circle(double radius) {this.radius = radius; }
    //Circle() {} 기본생성자 없으면 자동생성 해주나?

    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }
    @Override
    double calculatePerimeter() {
        return radius * Math.PI * 2;
    }

    @Override
    public void resize(double factor){
        radius *= factor;
    }

}
