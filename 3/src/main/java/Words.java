import org.junit.Test;

import java.util.Scanner;

//import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertTrue;

public class Words {
    public static String input;
    static int count = 0;

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        input = sc.nextLine();


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ')
                count++;
        }
        count++; // Accounting for last word
        System.out.println("Number of words: " + count);
        
    }
    
    @Test
    public void wordtest() {
        assertTrue(true);
        System.out.println("Test complete");
    }
}

