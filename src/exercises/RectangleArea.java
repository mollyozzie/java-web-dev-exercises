package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main (String[] args) {
        int length;
        int width;
        int area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = input.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        width = input.nextInt();
        area = length * width;
        System.out.println("The area of your rectangle is " + area + " units squared.");
    }
}
