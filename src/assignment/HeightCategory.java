package assignment;

import java.util.Scanner;

public class HeightCategory {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in feet: ");
        double height = input.nextDouble();

        if (height >= 6.0) {
            System.out.println("Tall");
        } else if (height >= 5.7) {
            System.out.println("Average");
        } else {
            System.out.println("Short");
        }

        input.close();
    }
}
