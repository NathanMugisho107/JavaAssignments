package assignment2;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        int[][] marks = new int[3][3];
        String[] subjects = {"Maths", "English", "Science"};
        Scanner scanner = new Scanner(System.in);

        for (int student = 0; student < 3; student++) {
            System.out.println("Enter marks for Student " + (student + 1) + ":");
            for (int subject = 0; subject < 3; subject++) {
                System.out.print("  " + subjects[subject] + ": ");
                marks[student][subject] = scanner.nextInt();
            }
        }

        System.out.println("\nStudent Marks Table:");
        System.out.println("-----------------------------");

        for (int student = 0; student < 3; student++) {
            System.out.print("Student " + (student + 1) + ": ");
            for (int subject = 0; subject < 3; subject++) {
                System.out.print(marks[student][subject] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        scanner.close();
    }
}
