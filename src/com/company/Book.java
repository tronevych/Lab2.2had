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

public class Book extends Rectangle {
    private String material;
    private String color;
    private int pages;
    private boolean images;

    public Book(int length, int width, String material, String color, int pages, boolean images) {
        super(length, width);
        this.material = material;
        this.color = color;
        this.pages = pages;
        this.images = images;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isImages() {
        return images;
    }

    public void setImages(boolean images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Book{" +
                "length=" + getLength() +
                ", width=" + getWidth() +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", pages=" + pages +
                ", images=" + images +
                '}';
    }
}
