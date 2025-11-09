public class Factorials {
    public static void main(String[] args) {
        System.out.printf("%-10s%-25s%n", "Number", "Factorial");
        System.out.println("-------------------------------------");

        // Loop from 1 to 20
        for (int i = 1; i <= 20; i++) {
            long factorial = 1; // Reset factorial for each i

            // Calculate factorial
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            // Display result in table format
            System.out.printf("%-10d%-25d%n", i, factorial);
        }
    }
}