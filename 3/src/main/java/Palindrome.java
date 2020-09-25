import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Palindrome {
     static String input;
    static boolean check(String input) {
        int i = 0;
        int j = input.length() - 1;

        while (i < j) {
            //Compare the first character with the last character and return false if they are not equal
            // String is not a palindrome if the program returns false
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    @Test
    public static void PalindromeTest() {
        assertEquals(check(input),true);
        System.out.println("Test Passed: Input=Output");
    }

    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        input = sc.next();

        if (check(input))
            System.out.println("String is a Palindrome");
        else
            System.out.println("Not a Palindrome");
        
        PalindromeTest();
    }
}


