import java.util.Scanner;

public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables for expenses
        double housing, food, clothing, transportation, education, healthcare, vacations;

        System.out.println("Welcome to the FairTax Estimator!");
        System.out.println("Please enter your annual expenses for each category.");

        // Prompt the user for expenses
        System.out.print("Housing: $");
        housing = input.nextDouble();

        System.out.print("Food: $");
        food = input.nextDouble();

        System.out.print("Clothing: $");
        clothing = input.nextDouble();

        System.out.print("Transportation: $");
        transportation = input.nextDouble();

        System.out.print("Education: $");
        education = input.nextDouble();

        System.out.print("Health care: $");
        healthcare = input.nextDouble();

        System.out.print("Vacations: $");
        vacations = input.nextDouble();

        // Calculate total expenses
        double totalExpenses = housing + food + clothing + transportation + education + healthcare + vacations;

        // Calculate FairTax (23% of total expenses)
        double fairTax = totalExpenses * 0.23;

        // Display results
        System.out.printf("%nTotal expenses: $%.2f%n", totalExpenses);
        System.out.printf("Estimated FairTax (23%%): $%.2f%n", fairTax);

        input.close();
    }
}