public class FacebookGrowth {
    public static void main(String[] args) {
        double currentUsers = 1_000_000_000; // 1 billion
        double growthRate = 0.04;            // 4% per month
        double target1 = 1_500_000_000;      // 1.5 billion
        double target2 = 2_000_000_000;      // 2 billion

        int monthsToTarget1 = (int) Math.ceil(Math.log(target1 / currentUsers) / Math.log(1 + growthRate));
        int monthsToTarget2 = (int) Math.ceil(Math.log(target2 / currentUsers) / Math.log(1 + growthRate));

        System.out.println("Months to reach 1.5 billion users: " + monthsToTarget1);
        System.out.println("Months to reach 2 billion users: " + monthsToTarget2);
    }
}