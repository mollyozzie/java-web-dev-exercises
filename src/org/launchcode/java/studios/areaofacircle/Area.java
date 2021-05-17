package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        double radius = 0;
        System.out.println("Enter a radius: ");

            if (input.hasNextDouble()) {
                radius = input.nextDouble();

                while(radius < 0) {
                    System.out.println("Enter a positive radius: ");
                    radius = input.nextDouble();
                }

                double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
            } else {
                System.out.println("Invalid input.");
                return;
            }
        }
    }

