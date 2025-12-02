package hexlet.code.games;

import static hexlet.code.Engine.MAX_RANDOM_VALUE;
import static hexlet.code.Engine.NUMBER_OF_ARRAY_PAIRS;
import static hexlet.code.Engine.NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS;
import static hexlet.code.Engine.RANDOM;

import hexlet.code.Engine;

public final class Prime {
    private Prime() {
        throw new AssertionError("Utility class instantiation prohibited");
    }

    public static void startGamePrime() {
        String gameDescription = "Answer \'yes\' if given number is prime. Otherwise answer \'no\'.";
        String[][] questionsAndAnswers = new String[NUMBER_OF_ARRAY_PAIRS][NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS];
        Engine.runGame(gameDescription, generateQuestionAnswer(questionsAndAnswers));
    }

    public static String[][] generateQuestionAnswer(String[][] questionsAndAnswers) {
        final int MIN_VALUE = 3;
        final int EVEN_DIVISOR = 2;
        int numberOfIterations = questionsAndAnswers.length;

        for (int i = 0; i < numberOfIterations; i++) {
            int number = RANDOM.nextInt(MAX_RANDOM_VALUE);
            int maxValue = (int) (Math.ceil(Math.sqrt(number)));
            questionsAndAnswers[i][0] = String.valueOf(number);

            if (number == EVEN_DIVISOR) {
                questionsAndAnswers[i][1] = "yes";
            } else if (number < EVEN_DIVISOR || number % EVEN_DIVISOR == 0) {
                questionsAndAnswers[i][1] = "no";
            } else {
                for (int j = MIN_VALUE; j < maxValue; j++) {
                    if (number % j == 0) {
                        questionsAndAnswers[i][1] = "no";
                        break;
                    }
                }
            }
            if (questionsAndAnswers[i][1] == null) {
                questionsAndAnswers[i][1] = "yes";
            }
        }
        return questionsAndAnswers;
    }

}
