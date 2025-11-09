public class ProductOfOdds {
    public static void main(String[] args) {
        int product = 1; // Initialize product variable

        // Loop through numbers from 1 to 15
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) { // Check if number is odd
                product *= i; // Multiply product by the odd number
            }
        }

        // Display the result
        System.out.println("The product of the odd integers from 1 to 15 is: " + product);
    }
}