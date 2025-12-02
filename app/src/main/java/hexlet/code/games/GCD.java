package hexlet.code.games;

import static hexlet.code.Engine.MAX_RANDOM_VALUE;
import static hexlet.code.Engine.NUMBER_OF_ARRAY_PAIRS;
import static hexlet.code.Engine.NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS;
import static hexlet.code.Engine.RANDOM;

import hexlet.code.Engine;

public final class GCD {

    private GCD() {
        throw new AssertionError("Utility class instantiation prohibited");
    }

    public static void startGameGCD() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = new String[NUMBER_OF_ARRAY_PAIRS][NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS];
        Engine.runGame(gameDescription, generateQuestionAnswer(questionsAndAnswers));
    }

    public static String[][] generateQuestionAnswer(String[][] questionsAndAnswers) {
        int numberOfIterations = questionsAndAnswers.length;

        for (int i = 0; i < numberOfIterations; i++) {
            int numberA = RANDOM.nextInt(MAX_RANDOM_VALUE);
            int numberB = RANDOM.nextInt(MAX_RANDOM_VALUE);
            int numberC;
            questionsAndAnswers[i][0] = numberA + " " + numberB;
            while (true) {
                if (numberB > 0) {
                    numberC = numberA;
                    numberA = numberB;
                    numberB = numberC % numberB;
                } else {
                    break;
                }
            }
            questionsAndAnswers[i][1] = String.valueOf(numberA);
        }
        return questionsAndAnswers;
    }
}
