package com.sezeme.chap08.polymorphism.level01.basic;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index;

    public void addShape(Shape shape){
        if(index >= shapes.length){
            Shape[] arr = new Shape[shapes.length * 2];
            System.arraycopy(shapes,0, arr, 0, index);
            shapes = arr;
        }
        shapes[index++] = shape;
    }

    public void removeShape(Shape shape) {
        boolean hasFound = false;
        for(int i = 0; i < index; i++){
            if(hasFound && i != index-1){
                shapes[i] = shapes[i+1];
            } else if(!hasFound && shapes[i].equals(shape)){
                hasFound = true;
                i--;
            }
        }
        index--;
    }

    public void printAllShapes() {
        for(int i = 0; i < index; i++){
            System.out.println(shapes[i]);
        }
    }

    public double getTotalArea() {
        double totalArea = 0;
        for(int i = 0; i < index; i++){
            totalArea += shapes[i].calculateArea();
        }
        return totalArea;
    }
    public double getTotalPerimeter() {
        double totalPerimeter = 0;
        for(int i = 0; i < index; i++){
            totalPerimeter += shapes[i].calculatePerimeter();
        }
        return totalPerimeter;
    }
}
