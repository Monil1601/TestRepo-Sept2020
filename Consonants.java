import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vow = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        int count = 0;

        System.out.println("Enter a sentence");
        String input = sc.nextLine();
        char[] arr1 = input.toCharArray();
        int len = input.length();

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
}
