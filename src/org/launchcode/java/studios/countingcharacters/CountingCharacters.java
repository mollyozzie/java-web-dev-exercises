package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String [] args) {

        HashMap<Character, Integer> letterMap = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String someString = input.nextLine().toLowerCase();
        char[] charactersInString = someString.toCharArray();

        for (int i=0; i < charactersInString.length; i++) {
            if (letterMap.containsKey(charactersInString[i]) && Character.isAlphabetic(charactersInString[i])) {
                letterMap.put(charactersInString[i], letterMap.get(charactersInString[i]) + 1);
            } else if (Character.isAlphabetic(charactersInString[i])) {
                letterMap.put(charactersInString[i], 1);
            }
        }

        for (Character key : letterMap.keySet()) {
            System.out.println(key + ": " + letterMap.get(key));
        }
    }
}
