package feb28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Write a Java program to implement HashMap. Take the data from the user.

public class HashMapExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> hashMap = new HashMap<String, String>();

		System.out.println("Enter a number of element you want in your HashMap: ");
		int limit = sc.nextInt();
		
		for(int i = 1; i <= limit; i++) {
			System.out.println("Enter a key: ");
			String key = sc.next();
			
			System.out.println("Enter a value:");
			String value = sc.next();
			
			hashMap.put(key, value);
		}

        System.out.println("HashMap contents:");
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + "\tValue: " + hashMap.get(key));
        }

        sc.close();
	}
}
