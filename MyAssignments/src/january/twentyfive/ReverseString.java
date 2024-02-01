package january.twentyfive;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = s.next();
		
		for(int i = str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
}