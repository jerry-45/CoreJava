package january.twentynine;

import java.util.Scanner;

public class PatternThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs]
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
//		System.out.println(n);
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				System.out.print(2*j-1);
				if(j < n)
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
