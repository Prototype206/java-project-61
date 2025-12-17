package hexlet.code.games;

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
        final int maxRandomValue = 100;
        for (String[] pairs : questionsAndAnswers) {
            int number = RANDOM.nextInt(maxRandomValue);
            pairs[0] = String.valueOf(number);
            pairs[1] = isPrime(number) ? "yes" : "no";
        }
        return questionsAndAnswers;
    }

    public static boolean isPrime(int number) {
        final int minValue = 3;
        final int evenDivisor = 2;
        int maxValue = (int) (Math.ceil(Math.sqrt(number)));

        if (number == evenDivisor) {
            return true;
        } else if (number < evenDivisor || number % evenDivisor == 0) {
            return false;
        } else {
            for (int j = minValue; j <= maxValue; j++) {
                if (number % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}
