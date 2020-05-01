package com.codewithDennis;


public class Circle implements Shape {
    private Point center;
    @Override
    public void draw() {
        System.out.println("Circle: Point is: " + center.getA() + ", "+center.getB());
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
