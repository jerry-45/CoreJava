package january.twentyfive;

import java.util.Scanner;

public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0;j <= i; j++) {
				System.out.print((i+j) % 2 + " ");
			}
			System.out.println();
		}
		s.close();
	}

}