import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        int guess = 0;
        boolean validInput;

        do {
            System.out.print("Guess the number (1-10): ");
            if (input.hasNextInt()) {
                guess = input.nextInt();
                if (guess >= 1 && guess <= 10) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Guess must be between 1 and 10.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
                validInput = false;
            }
        } while (!validInput);

        System.out.println("Random number was: " + randomNumber);
        if (guess < randomNumber) {
            System.out.println("Your guess is too low.");
        } else if (guess > randomNumber) {
            System.out.println("Your guess is too high.");
        } else {
            System.out.println("Your guess is on the money!");
        }
    }
}
