//write a java code to accept infinite number from the user and display count of negative numbers 
//and positive numbers displayed by the user,sentinel value should be -1

import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int positiveCount = 0;
        int negativeCount = 0;

        System.out.println("Enter numbers (enter -1 to stop):");

        while (true) {
            number = input.nextInt();

            // Sentinel value check
            if (number == -1) {
                break;
            }

            // Count positives and negatives
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
        }

        System.out.println("\nResults:");
        System.out.println("Total positive numbers entered: " + positiveCount);
        System.out.println("Total negative numbers entered: " + negativeCount);

        input.close();
    }
}
