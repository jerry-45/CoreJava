package com.edubridge.miscellaneous;

import java.util.Scanner;

/*
	Date: 29th January 2024

	Remove "the" occurrence
	In the certain area there was a camp of polio drops team. They need to 
	search every baby in the particular area. They want to find the baby and 
	take out the baby for polio drops. Help them to find the baby to avoid 
	polio attacks. (remove the occurrence of “the” word from entered string). 
	[Hint: To get a whole sentence use the following statement: scanf("%[^\n]",a);]

	Input Format:
	Input consists of a string.

	Output Format:
	remove "the" occurrence of the word from entered string.

	Sample Input:	
	the height of Mt.Everest is 8448 m.

	Sample Output:
	height of Mt.Everest is 8448 m.
*/

public class RemoveTheOccurrence {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string with spaces
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove occurrences of "the"
        String resultString = removeTheOccurrence(inputString);

        // Print the string after removing occurrences of "the"
        System.out.println("Output: " + resultString);

        scanner.close();
    }

    // Function to remove occurrences of "the" from a string
    private static String removeTheOccurrence(String input) {
        // Use a case-insensitive regex to remove occurrences of "the"
        return input.replaceAll("(?i)\\bthe\\b", "");
    }
}