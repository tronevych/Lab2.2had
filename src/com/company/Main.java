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


public class Main {

    public static void main(String[] args) {

        Book myBook = new Book(2, 4, "paper", "red", 200, true);
        System.out.println(myBook);

        Triangle myIsoscelesTriangle = new IsoscelesTriangle(4, 2);
        System.out.println(myIsoscelesTriangle);
    }
}
