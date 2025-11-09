import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctAnswers = 0;

        // Arrays to hold questions, options, and correct answers
        String[] questions = {
            "1. What is a primary cause of global warming according to most scientists?",
            "2. Which gas is considered a major contributor to the greenhouse effect?",
            "3. What is one argument skeptics make about global warming?",
            "4. Which of the following is a potential consequence of global warming?",
            "5. Which international organization focuses on climate change science?"
        };

        String[][] options = {
            {"1) Deforestation", "2) Carbon dioxide emissions", "3) Volcanic eruptions", "4) Ocean currents"},
            {"1) Oxygen", "2) Nitrogen", "3) Carbon dioxide", "4) Hydrogen"},
            {"1) Global warming is a hoax", "2) Humans are partly responsible", "3) Ice caps are melting", "4) Sea levels are rising"},
            {"1) Rising sea levels", "2) Decreased sunlight", "3) Lower global temperatures", "4) Reduced greenhouse gases"},
            {"1) UN Intergovernmental Panel on Climate Change (IPCC)", "2) World Health Organization (WHO)", "3) International Monetary Fund (IMF)", "4) World Trade Organization (WTO)"}
        };

        int[] answers = {2, 3, 1, 1, 1}; // correct answers

        System.out.println("Global Warming Facts Quiz\n");

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (1-4): ");
            int userAnswer = input.nextInt();

            if (userAnswer == answers[i]) {
                correctAnswers++;
            }

            System.out.println();
        }

        // Display result message
        System.out.println("You got " + correctAnswers + " out of 5 correct.");

        if (correctAnswers == 5) {
            System.out.println("Excellent!");
        } else if (correctAnswers == 4) {
            System.out.println("Very good!");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("Some reliable sources for information:");
            System.out.println("- https://www.ipcc.ch/");
            System.out.println("- https://climate.nasa.gov/");
            System.out.println("- https://www.epa.gov/climate-change");
            System.out.println("- https://www.un.org/en/global-issues/climate-change");
        }

        input.close();
    }
}