package january.twentynine;

import java.util.Scanner;

public class RemoveThe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String input = s.nextLine();
		
		String result = input.replaceAll("the", "");
		
		System.out.println(result);
	}

}
