package org.launchcode.java.studio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String inputString = input.nextLine();
        inputString = inputString.toLowerCase();

        char[] charactersInString = inputString.toCharArray();

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char c : charactersInString) {
            if (c == ' ' || !Character.isLetter(c)) {
                continue;
            }
            Integer count = charMap.get(c);
            if (!charMap.containsKey(c)) {
                charMap.put(c, 1);
            } else {
                charMap.put(c, count + 1);
            }
        }

        for (Map.Entry<Character, Integer> character : charMap.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
