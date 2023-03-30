package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class FiveLetterWord {

    public static void main(String[] args) {
        ArrayList<String> someWords = new ArrayList<>();
        someWords.add("hello");
        someWords.add("world");
        someWords.add("hell");
        someWords.add("alligator");
        someWords.add("chonk");

        printFive(someWords);
    }

    public static void printFive(ArrayList<String> wordArray) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length (number of letters): ");
        int wordLength = input.nextInt();

        for (String word : wordArray) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
