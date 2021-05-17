package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search: ");
        String searchTerm = input.nextLine().toLowerCase();
        boolean returnStatement = alice.toLowerCase().contains(searchTerm);
        if (returnStatement == true) {
            int index = alice.indexOf(searchTerm);
            int length = searchTerm.length();
            System.out.println("Your search term first appeared at index " + index + ". Your term is " + length + " characters long");
            String modifiedSentence = alice.replace(searchTerm, "");
            System.out.println(modifiedSentence);
        } else {
            System.out.println(returnStatement);
        }
    }
}
