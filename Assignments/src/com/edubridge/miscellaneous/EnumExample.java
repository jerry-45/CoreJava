package com.edubridge.miscellaneous;

/*
	Date: 2nd February 2024
	
	Write a Java program to implement an enum called "Direction" with constants 
	representing the cardinal directions (North, South, East, West).
*/

//Enum definition for Direction
enum Direction {
	NORTH,
	SOUTH,
	EAST,
	WEST
}

public class EnumExample {
	public static void main(String[] args) {
        // Using the enum constants
        Direction myDirection = Direction.NORTH;

        // Switch statement to demonstrate usage
        switch (myDirection) {
            case NORTH:
                System.out.println("Heading North");
                break;
            case SOUTH:
                System.out.println("Heading South");
                break;
            case EAST:
                System.out.println("Heading East");
                break;
            case WEST:
                System.out.println("Heading West");
                break;
            default:
                System.out.println("Invalid direction");
        }
    }
}