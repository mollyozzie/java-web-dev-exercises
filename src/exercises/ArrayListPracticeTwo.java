package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;


public class ArrayListPracticeTwo {
    public static void main(String [] args) {
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        List<String> greenEggsAndHam = new ArrayList<String>(Arrays.asList(greenEggs.split(" ")));

        int numberToSearch;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a number of letters: ");
        numberToSearch = input.nextInt();

        numberLetterWords(greenEggsAndHam, numberToSearch);
    }
    public static void numberLetterWords(List<String> words, int numberToSearch) {
        for (String word: words) {
            if (word.length() == numberToSearch) {
                System.out.println(word);
            }
        }
    }
}
