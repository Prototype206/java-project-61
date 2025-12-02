package hexlet.code.games;

import static hexlet.code.Engine.random;

import hexlet.code.Engine;

public final class GCD {

    private GCD() {
        throw new AssertionError("Utility class instantiation prohibited");
    }

    public static void startGameGCD() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = new String[3][2];
        questionsAndAnswers = generateQuestionAnswer(questionsAndAnswers);
        Engine.runGame(gameDescription, questionsAndAnswers);
    }

    public static String[][] generateQuestionAnswer(String[][] questionsAndAnswers) {
        int numberOfIterations = questionsAndAnswers.length;

        for (int i = 0; i < numberOfIterations; i++) {
            int numberA = random.nextInt(100);
            int numberB = random.nextInt(100);
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
