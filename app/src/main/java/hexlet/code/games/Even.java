package hexlet.code.games;

import static hexlet.code.Engine.NUMBER_OF_ARRAY_PAIRS;
import static hexlet.code.Engine.NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS;
import static hexlet.code.Engine.RANDOM;

import hexlet.code.Engine;

public final class Even {

    private Even() {
        throw new AssertionError("Utility class instantiation prohibited");
    }

    public static void startGameEven() {
        String gameDescription = "Answer \'yes\' if the number is even, otherwise answer \'no\'.";
        String[][] questionsAndAnswers = new String[NUMBER_OF_ARRAY_PAIRS][NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS];
        Engine.runGame(gameDescription, generateQuestionAnswer(questionsAndAnswers));
    }

    public static String[][] generateQuestionAnswer(String[][] questionsAndAnswers) {
        final int maxRandomValue = 100;
        final int evenDivisor = 2;
        final int oddRemainder = 1;
        int numberOfIterations = questionsAndAnswers.length;

        for (int i = 0; i < numberOfIterations; i++) {
            int randomNumber = RANDOM.nextInt(maxRandomValue);
            questionsAndAnswers[i][0] = String.valueOf(randomNumber);
            questionsAndAnswers[i][1] = randomNumber % evenDivisor == oddRemainder ? "no" : "yes";
        }
        return questionsAndAnswers;
    }
}
