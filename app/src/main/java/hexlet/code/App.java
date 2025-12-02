package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        final int greetings = 1;
        final int evenGame = 2;
        final int calcGame = 3;
        final int gcdGame = 4;
        final int progressionGame = 5;
        final int primeGame = 6;
        final int exit = 0;

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
            case greetings:
                Cli.greetings();
                break;
            case evenGame:
                Even.startGameEven();
                break;
            case calcGame:
                Calc.startGameCalc();
                break;
            case gcdGame:
                GCD.startGameGCD();
                break;
            case progressionGame:
                Progression.startGameProgression();
                break;
            case primeGame:
                Prime.startGamePrime();
                break;
            case exit:
                break;
            default:
                throw new IllegalArgumentException("Unknown choise number " + usersChoise);
            }
        }
    }
}
