package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args) {
        double miles;
        double gallons;
        double milesPerGallon;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        miles = input.nextDouble();
        System.out.println("Enter the number of gallons of gasoline used: ");
        gallons = input.nextDouble();
        milesPerGallon = miles / gallons;
        System.out.println("Your car is getting " + milesPerGallon + " miles per gallon.");
    }
}
