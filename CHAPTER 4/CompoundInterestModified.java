public class CompoundInterestModified {
    public static void main(String[] args) {
        double principal = 1000.0; // Example principal
        int years = 10;            // Example duration in years

        System.out.printf("%-10s%-20s%n", "Rate (%)", "Future Value");
        System.out.println("------------------------------");

        // Loop through interest rates from 5% to 10%
        for (int ratePercent = 5; ratePercent <= 10; ratePercent++) {
            double rate = ratePercent / 100.0; // Convert percentage to decimal
            double futureValue = principal * Math.pow(1 + rate, years);

            System.out.printf("%-10d$%-20.2f%n", ratePercent, futureValue);
        }
    }
}