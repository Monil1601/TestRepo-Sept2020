import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

public class Vowels {
	 public static String input;
	// String input;
	// char[] vow = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
	// int count = 0;

	public static void main(String[] args) {
		// @SuppressWarnings("resource")
		int count = 0;
		char[] vow = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		input = sc.nextLine();
		//  isVowel(input);
		// }

		// public Object isVowel(String vowel) {
		for (int i = 0; i < input.length(); i++) {
			for (char c : vow) {
				if (input.charAt(i) == c) {
					count++;
				}
			}
		}
		System.out.println("Vowel Count " + count);
		// return count;
		//  }
		Test();
		
	}
	@Test
	 public static void Test() {  
		assertEquals("Hello",input);
		System.out.println("Test Failed: Expected Input - Hello");
	}
	
}
	


