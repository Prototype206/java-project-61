package hexlet.code.games;

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
        final int maxRandomValue = 100;
        final int minValue = 1;
        for (String[] pairs : questionsAndAnswers) {
            int numberA = RANDOM.nextInt(maxRandomValue + minValue);
            int numberB = RANDOM.nextInt(maxRandomValue + minValue);
            pairs[0] = numberA + " " + numberB;
            pairs[1] = String.valueOf(calculationNOD(numberA, numberB));
        }
        return questionsAndAnswers;
    }

    public static int calculationNOD(int numberA, int numberB) {
        int numberC;
        while (true) {
            if (numberB > 0) {
                numberC = numberA;
                numberA = numberB;
                numberB = numberC % numberB;
            } else {
                break;
            }
        }
        return numberA;
    }
}
