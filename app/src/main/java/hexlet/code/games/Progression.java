package hexlet.code.games;

import static hexlet.code.Engine.MAX_RANDOM_VALUE;
import static hexlet.code.Engine.NUMBER_OF_ARRAY_PAIRS;
import static hexlet.code.Engine.NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS;
import static hexlet.code.Engine.RANDOM;

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
        final int maxValue = 20;
        final int minValue = 7;
        int numberOfIterations = questionsAndAnswers.length;

        for (int i = 0; i < numberOfIterations; i++) {
            int numberOne = RANDOM.nextInt(MAX_RANDOM_VALUE);
            int numberTwo = RANDOM.nextInt(MAX_RANDOM_VALUE);
            int sumOfNumbers = numberOne;
            int progressionLength = RANDOM.nextInt(maxValue - minValue + 1) + minValue;
            int numberToSkip = RANDOM.nextInt(progressionLength);
            int correctAnswer = numberOne + numberTwo * numberToSkip;
            questionsAndAnswers[i][0] = generateProgression(numberTwo, sumOfNumbers, progressionLength, numberToSkip);
            questionsAndAnswers[i][1] = String.valueOf(correctAnswer);
        }
        return questionsAndAnswers;
    }

    public static String generateProgression(int numberTwo, int sumOfNumbers, int progressionLength, int numberToSkip) {
        StringBuilder progressionString = new StringBuilder();
        for (int i = 0; i < progressionLength; i++) {
            if (i == numberToSkip) {
                progressionString.append(".. ");
                sumOfNumbers += numberTwo;
                continue;
            }
            progressionString.append(sumOfNumbers).append(" ");
            sumOfNumbers += numberTwo;
        }
        return progressionString.toString();
    }

}
