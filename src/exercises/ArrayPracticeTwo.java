package exercises;

import java.util.Arrays;

public class ArrayPracticeTwo {
    public static void main(String [] args) {
        String newString = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = newString.split(" ");
        System.out.println(Arrays.toString(words));
    }
}
