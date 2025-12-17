package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int NUMBER_OF_ARRAY_PAIRS = 3;
    public static final int NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS = 2;

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
            int scoreCounter = 0;
            StringBuilder usersAnswer = new StringBuilder();
            for (String[] pairs : questionsAndAnswers) {
                usersAnswer.setLength(0);
                System.out.println("Question: " + pairs[0]);

                System.out.print("Your answer: ");
                usersAnswer.append(scanner.nextLine());
                if (usersAnswer.toString().equals(pairs[1])) {
                    System.out.println("Correct!");
                    scoreCounter++;
                } else {
                    System.out.println(usersAnswer + " is wrong answer ;(. Correct answer was " + pairs[1]
                            + ".\nLet\'s try again, " + userName + "!");
                    break;
                }
            }
            if (scoreCounter == NUMBER_OF_ARRAY_PAIRS) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
