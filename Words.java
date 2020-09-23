import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertNull;

public class Words {
    public static String input;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        input = sc.nextLine();
        Countwords(input);
    }

    public static Object Countwords(String word) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ')
                count++;
        }
        count++; // Accounting for last word
        System.out.println("Number of words: " + count);
        return count;
    }

    @Test
    public void test() {
        assertNull(Countwords(input));
    }
}

