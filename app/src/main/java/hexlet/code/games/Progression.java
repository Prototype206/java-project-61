package hexlet.code.games;

import static hexlet.code.Engine.MAX_RANDOM_VALUE;
import static hexlet.code.Engine.NUMBER_OF_ARRAY_PAIRS;
import static hexlet.code.Engine.NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS;

import java.util.Random;

import hexlet.code.Engine;

public final class Progression {
    private Progression() {
        throw new AssertionError("Utility class instantiation prohibited");
    }

    public static void startGameProgression() {
        String gameDescription = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[NUMBER_OF_ARRAY_PAIRS][NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS];
        Engine.runGame(gameDescription, generateQuestionAnswer(questionsAndAnswers));
    }

    public static String[][] generateQuestionAnswer(String[][] questionsAndAnswers) {
        final Random random = new Random();
        final int maxValue = 20;
        final int minValue = 7;

        for (String[] pairs : questionsAndAnswers) {
            int numberOne = random.nextInt(MAX_RANDOM_VALUE);
            int step = random.nextInt(MAX_RANDOM_VALUE);
            int progressionLength = random.nextInt(maxValue - minValue + 1) + minValue;
            int numberToSkip = random.nextInt(progressionLength);

            String[] progressionArray = generateProgression(step, numberOne, progressionLength, numberToSkip);
            pairs[1] = progressionArray[numberToSkip];
            progressionArray[numberToSkip] = "..";
            pairs[0] = String.join(" ", progressionArray);
        }
        return questionsAndAnswers;
    }

    public static String[] generateProgression(int step, int numberOne, int progressionLength, int numberToSkip) {
        String[] progression = new String[progressionLength];

        int sumOfNumbers = numberOne;
        for (int i = 0; i < progressionLength; i++) {
            progression[i] = String.valueOf(sumOfNumbers);
            sumOfNumbers += step;
        }
        return progression;
    }
}
