import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class Palindrome {

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
    public void PalindromeTest() {
        assertTrue(check("radar"));
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.next();

        if (check(input))
            System.out.println("String is a Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}


