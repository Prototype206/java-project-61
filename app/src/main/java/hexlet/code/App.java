package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        final int GREETINGS = 1;
        final int EVEN_GAME = 2;
        final int CALC_GAME = 3;
        final int GCD_GAME = 4;
        final int PROGRESSION_GAME = 5;
        final int PRIME_GAME = 6;
        final int EXIT = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.print(
                    "1 - Greet\n2 - Even\n3 - Cacl\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
            int usersChoise = 0;

            try {
                usersChoise = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong input! You need to enter a number");
            }

            switch (usersChoise) {
            case GREETINGS:
                Cli.greetings();
                break;
            case EVEN_GAME:
                Even.startGameEven();
                break;
            case CALC_GAME:
                Calc.startGameCalc();
                break;
            case GCD_GAME:
                GCD.startGameGCD();
                break;
            case PROGRESSION_GAME:
                Progression.startGameProgression();
                break;
            case PRIME_GAME:
                Prime.startGamePrime();
                break;
            case EXIT:
                break;
            default:
                throw new IllegalArgumentException("Unknown choise number " + usersChoise);
            }
        }
    }
}
