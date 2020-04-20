package com.codewithDennis;

import java.util.List;

public class Triangle {
//    private String type;
//    private int height;
//
//    public Triangle(String type) {
//        this.type = type;
//    }
//
//    public Triangle(String type, int height) {
//        this.type = type;
//        this.height = height;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public String getType() {
//        return type;
//    }

//    public void setType(String type) {
//        this.type = type;
//    }
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private List<Point> points;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){
        System.out.println("PointA=("+getPointA().getA()+','+getPointA().getB()+")");
        System.out.println("PointB=("+getPointB().getA()+','+getPointB().getB()+")");
        System.out.println("PointC=("+getPointC().getA()+','+getPointC().getB()+")");
    }

}
