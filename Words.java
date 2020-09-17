import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a sentence");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ')
                count++;
        }
        count++; // Accounting for last word
        System.out.println("Number of words: " + count);
    }
}
