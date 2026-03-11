package assignment2;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] numbers = {13, 61, 8, 43, 54};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
