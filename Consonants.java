import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertNotNull;

public class Consonants {
    public static String input;
    char[] vow = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
    int count = 0;
    char[] arr1 = input.toCharArray();
    int len = input.length();

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        input = sc.nextLine();
        conso(input);
    }
    //Count consonants and replace them with *

    public Object conso(String sentence) {

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
        return (len - count);
    }

    @Test
    public void test() {
        assertNotNull(conso(input));
    }
}
