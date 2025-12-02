package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public final class Engine {
    public static final Random RANDOM = new Random();
    public static final int NUMBER_OF_ARRAY_PAIRS = 3;
    public static final int NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS = 2;
    public static final int MAX_RANDOM_VALUE = 100;

    private static int scoreCounter = 0;
    private static int scoreToWin = 3;
    private static StringBuilder usersAnswer = new StringBuilder();

    private Engine() {
        throw new AssertionError("Utility class instantiation prohibited");
    }

    public static void runGame(String gameDescription, String[][] questionsAndAnswers) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("\nWelcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String userName = scanner.nextLine();
            System.out.println("Hello, " + userName + "!");

            System.out.println(gameDescription);
            for (int i = 0; i < scoreToWin; i++) {
                usersAnswer.setLength(0);
                System.out.println("Question: " + questionsAndAnswers[i][0]);

                System.out.print("Your answer: ");
                usersAnswer.append(scanner.nextLine());
                if (usersAnswer.toString().equals(questionsAndAnswers[i][1])) {
                    System.out.println("Correct!");
                    scoreCounter++;
                } else {
                    System.out.println(usersAnswer + " is wrong answer ;(. Correct answer was "
                            + questionsAndAnswers[i][1] + ".\nLet\'s try again, " + userName + "!");
                    break;
                }
            }
            if (scoreCounter == scoreToWin) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
