package assignment2;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values for a 2x3 matrix:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Enter value at [" + row + "][" + col + "]: ");
                matrix[row][col] = scanner.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {

            System.out.print(matrix[row][col] + "\t");
        }
        System.out.println();
    }

        scanner.close();
}
}
