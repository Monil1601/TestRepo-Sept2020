import org.junit.Test;

import java.util.Scanner;
import java.util.StringTokenizer;

import static org.junit.Assert.assertFalse;

public class LastLetterCount {

    static String input;
    int counter = 0;
    int word_s = 0;
    int word_y = 0;
    int count_s = 0, count_y = 0;

    public void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        input = sc.nextLine();
        // manipulate(input);


        //Counting number of words
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ')
                counter++;
        }
        counter++;

        String[][] word = new String[1][counter + 1];
        StringTokenizer str = new StringTokenizer(input);


        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (str.hasMoreTokens()) {
                    word[i][j] = str.nextToken(" ");
                    if (word[i][j].endsWith("s")) {
                        word_s++;
                        if (word_s == 1) {
                            count_s = j;
                            //  System.out.println(word[i][j]);
                        }
                    }
                    if (word[i][j].endsWith("y")) {
                        word_y++;
                        if (word_y == 1) {
                            count_y = j;
                            //  System.out.println(word[i][j]);
                        }
                    }
                }

            }

            //Swapping first instances
            String tmp = word[i][count_s];
            word[i][count_s] = word[i][count_y];
            word[i][count_y] = tmp;
        }

        System.out.println("Total words ending in s: " + word_s);
        System.out.println("Total words ending in y: " + word_y);

        for (String[] strings : word) {
            for (int j = 0; j < 3; j++) {
                if (!(strings[j] == null)) {
                    System.out.print(strings[j] + " ");
                }
            }
            System.out.println();
        }
    }

    @Test
    public void test() {
        assertFalse("No s or y words", (word_s <= 0));
    }
}
