package assignment2;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 22, 19};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Number found at index " + i);
                found = true;

                break;
            }
        }

        if (!found) {
            System.out.println("Number not found in the array");
        }

        scanner.close();
    }
}
