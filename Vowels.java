import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        char[] vow = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            for (char c : vow) {
                if (input.charAt(i) == c) {
                    count++;
                }
            }
        }
        System.out.println("Vowel Count " + count);
    }
}
