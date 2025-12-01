
package week07;
//Scanner, Random

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100);
        int guessingNumber;
        int tries = 0;
        do {
            System.out.println("Guess the secret number:");

            guessingNumber = input.nextInt();
            if (guessingNumber > secretNumber) {
                System.out.println("Too big");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Too small");
            } else {
                System.out.println("Congratulations, you won!");
                break;
            }
            tries++;
            if (tries == 5) {
                System.out.println("You lost! Secret number = " + secretNumber);
                break;
            }

        } while(guessingNumber != secretNumber);

        System.out.println("Game Over");
        input.close();
    }
}
