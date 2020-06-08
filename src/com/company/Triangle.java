/*
 *
 * Classname: Rectangle
 *
 * 07 June 2020
 *
 * Copyright Serhii Tronevych KNUTE
 *
 * Module 2 task 2
 *
 * Create a child  from the class Rectangle.
 * Create another class as a super class for your one.
 * Or create a daughterly class for your one.
 *
 */
package com.company;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double Agnle;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(int side) {
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    //1. Method for finding the perimeter.
    public double getPerimeter(){
        return this.getSideA() + this.getSideB() + this.getSideC();
    }

    //2. Method for finding the area.
    public double getArea(){
        double p = (this.getSideA() + this.getSideB() + this.getSideC())/2;
        return Math.sqrt (p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
    }

    //3. Method for "Triangle is a equilateral triangle?"
    public boolean isEquilateraltriangle() {
        boolean result = true;
        if (this.getSideA() == this.getSideB()&&getSideA()==getSideC()&&getSideB()==getSideC()) {
            result = true;
        } else {
            result = false;
        }
        return result;

    }

    //4. Method for "Triangle is a Isosceles Triangle?"
    public boolean isIquilateraltriangle() {
        boolean result = true;
        if (this.getSideA() == this.getSideB()) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

// Method to string
    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

}