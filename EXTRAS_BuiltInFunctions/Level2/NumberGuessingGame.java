import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    public static String getUserFeedback(Scanner scanner, int guess) {
        System.out.print("Is the guess " + guess + " too high, too low, or correct? (high/low/correct): ");
        return scanner.nextLine().trim().toLowerCase();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it. Provide feedback: high, low, or correct.");

        while (!guessedCorrectly && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getUserFeedback(scanner, guess);

            switch (feedback) {
                case "low":
                    low = guess + 1;
                    break;
                case "high":
                    high = guess - 1;
                    break;
                case "correct":
                    guessedCorrectly = true;
                    System.out.println("Yay! I guessed your number correctly: " + guess);
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Hmm... Something went wrong. Did you follow the rules?");
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}
