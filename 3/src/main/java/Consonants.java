import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertFalse;

public class Consonants {
    
	int count = 0;
	public String input;
    public void main(String[] args) {
    	    char[] vow = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
    	    char[] arr1 = input.toCharArray();
    	    
        @SuppressWarnings("resource")
        
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        input = sc.nextLine();
        int len = input.length();

        //Count consonants and replace them with *

        for (int i = 0; i < len; i++) {
            for (char c : vow) {
                if (input.charAt(i) == c) {
                    count++;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            if (!(arr1[i] == 'a' || arr1[i] == 'e' || arr1[i] == 'i' || arr1[i] == 'o' || arr1[i] == 'u')) {
                arr1[i] = '*';
            }
        }

        for (char s : arr1) {
            System.out.print(s);
        }
        System.out.print("\n");
        System.out.println("Total consonants: " + (len - count));

    }
    
 
    @Test
    public void test() {
        assertFalse("No consonants", count<0);
        System.out.println("Test failed: - No consonants");
    }
}

