
import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        boolean continueInput = true;
        while (continueInput) {
            System.out.print("Enter a number (or type 'done' to finish): ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                smallest = Math.min(smallest, number);
                largest = Math.max(largest, number);
                sum += number;
                count++;
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    continueInput = false;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'done'.");
                }
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}