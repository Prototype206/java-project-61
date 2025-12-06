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
        final int minValue = 3;
        final int evenDivisor = 2;

        for (String[] pairs : questionsAndAnswers) {
            int number = RANDOM.nextInt(MAX_RANDOM_VALUE);
            int maxValue = (int) (Math.ceil(Math.sqrt(number)));
            pairs[0] = String.valueOf(number);

            if (number == evenDivisor) {
                pairs[1] = "yes";
            } else if (number < evenDivisor || number % evenDivisor == 0) {
                pairs[1] = "no";
            } else {
                pairs[1] = evenCheck(minValue, maxValue, number);
            }
        }
        return questionsAndAnswers;
    }

    public static String evenCheck(int minValue, int maxValue, int number) {
        for (int j = minValue; j <= maxValue; j++) {
            if (number % j == 0) {
                return "no";
            }
        }
        return "yes";
    }

}
