import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Generate a random number between 1 and 100
        int secretNumber = (int) (Math.random() * 100) + 1;
        
        // Initialize the number of attempts
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (true) {
            // Ask the user for input
            System.out.print("Your guess: ");
            
            try {
                // Read the user's guess as an integer
                int guess = scanner.nextInt();

                // Increment the number of attempts
                attempts++;

                // Check if the guess is correct
                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + secretNumber +
                            " in " + attempts + " attempts.");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            } catch (Exception e) {
                // Handle non-integer input
                System.out.println("Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input to avoid an infinite loop
            }
        }

        // Close the scanner
        scanner.close();
    }
}
