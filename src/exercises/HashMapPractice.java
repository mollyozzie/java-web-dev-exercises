package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentId;

        System.out.println("Enter your students (or ENTER to finish): ");

        do {

            System.out.println("Student ID: ");
            newStudentId = input.nextInt();

            if(!newStudentId.equals("")) {
                System.out.println("Name: ");
                String studentName = input.nextLine();
                students.put(newStudentId, studentName);

                input.nextLine();
            }

        } while(!newStudentId.equals(""));


        System.out.println("\nClass Roster:");

        for (Map.Entry<Integer,String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
