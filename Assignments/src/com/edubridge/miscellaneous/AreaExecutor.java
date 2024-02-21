package com.edubridge.miscellaneous;

// Importing the math library for PI value
import java.lang.Math;

// Abstract class Shape
abstract class Shape1 {
    // Abstract method to calculate area of rectangle
    abstract double rectangleArea(double length, double breadth);

    // Abstract method to calculate area of square
    abstract double squareArea(double side);

    // Abstract method to calculate area of circle
    abstract double circleArea(double radius);
}

// Class Area inheriting from Shape
class Area extends Shape1 {
    // Method to calculate area of rectangle
    double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate area of square
    double squareArea(double side) {
        return side * side;
    }

    // Method to calculate area of circle
    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

// Main class
public class AreaExecutor {
    public static void main(String[] args) {
        // Creating object of class Area
        Area areaCalculator = new Area();

        // Calculating and printing the area of rectangle
        double rectangleArea = areaCalculator.rectangleArea(5, 10);
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Calculating and printing the area of square
        double squareArea = areaCalculator.squareArea(7);
        System.out.println("Area of Square: " + squareArea);

        // Calculating and printing the area of circle
        double circleArea = areaCalculator.circleArea(3);
        System.out.println("Area of Circle: " + circleArea);
    }
}
