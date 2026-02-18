package assignment;

import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctStudentNumber = "134671";
        String correctPassword = "pass123";

        String studentNumber;
        String password;

        do {
            System.out.print("Enter student number: ");
            studentNumber = input.nextLine();

            System.out.print("Enter password: ");
            password = input.nextLine();

            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.");
            }

        } while (!password.equals(correctPassword));

        System.out.println("Access Granted");
        input.close();
    }
}
