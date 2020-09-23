import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertNotNull;

public class Vowels {
    // public static String input;
    String input;
    char[] vow = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
    int count = 0;

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        input = sc.nextLine();
        isVowel(input);
    }

    public Object isVowel(String vowel) {
        for (int i = 0; i < input.length(); i++) {
            for (char c : vow) {
                if (input.charAt(i) == c) {
                    count++;
                }
            }
        }
        System.out.println("Vowel Count " + count);
        return count;
    }

    @Test
    public void Test() {
        assertNotNull(isVowel(input));
    }
}
