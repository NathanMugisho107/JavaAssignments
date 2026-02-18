package assignment;

import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = number; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        input.close();
    }
}
