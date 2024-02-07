package com.edubridge.miscellaneous;

// Date: 6th February 2024
// Write a Java program to create a base class Sports with a method called play(). 
// Create three subclasses: Football, Basketball, and Rugby. 
// Override the play() method in each subclass to play a specific statement 
// for each sport.

class Sports {
    // Method to play sports
    public void play() {
        System.out.println("Playing generic sports");
    }
}

// Subclass Football
class Football extends Sports {
    // Override play method for Football
    @Override
    public void play() {
        System.out.println("Playing football");
    }
}

// Subclass Basketball
class Basketball extends Sports {
    // Override play method for Basketball
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

// Subclass Rugby
class Rugby extends Sports {
    // Override play method for Rugby
    @Override
    public void play() {
        System.out.println("Playing rugby");
    }
}

public class PolymorphismAssignment {

	public static void main(String[] args) {
		// Create instances of each sport
        Sports sports = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        // Demonstrate playing each sport
        sports.play();      // Output: Playing generic sports
        football.play();    // Output: Playing football
        basketball.play();  // Output: Playing basketball
        rugby.play();       // Output: Playing rugby
	}
}