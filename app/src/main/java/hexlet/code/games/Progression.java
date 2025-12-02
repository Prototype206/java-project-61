package hexlet.code.games;

import static hexlet.code.Engine.random;

import hexlet.code.Engine;

public final class Progression {

    private Progression() {
        throw new AssertionError("Utility class instantiation prohibited");
    }

    public static void startGameProgression() {
        String gameDescription = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[3][2];
        questionsAndAnswers = generateQuestionAnswer(questionsAndAnswers);
        Engine.runGame(gameDescription, questionsAndAnswers);
    }

    public static String[][] generateQuestionAnswer(String[][] questionsAndAnswers) {
        int maxValue = 20;
        int minValue = 7;
        int numberOfIterations = questionsAndAnswers.length;

        for (int i = 0; i < numberOfIterations; i++) {
            int numberOne = random.nextInt(100);
            int numberTwo = random.nextInt(100);
            int sumOfNumbers = numberOne;
            int progressionLength = random.nextInt(maxValue - minValue + 1) + minValue;
            int numberToSkip = random.nextInt(progressionLength);
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
