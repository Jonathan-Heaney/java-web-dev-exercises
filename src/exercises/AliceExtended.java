package exercises;
import java.util.Scanner;
public class AliceExtended {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String aliceStr = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        aliceStr = aliceStr.toLowerCase();

        System.out.println("Enter a search term: ");
        String wordToRemove = input.nextLine();
        wordToRemove = wordToRemove.toLowerCase();

        System.out.println(aliceStr.indexOf(wordToRemove));
        System.out.println(wordToRemove.length());
        aliceStr = aliceStr.replaceFirst(wordToRemove, "");
        System.out.println(aliceStr);
    }
}
