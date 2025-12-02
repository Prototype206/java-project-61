package hexlet.code.games;

import static hexlet.code.Engine.massiveLength;
import static hexlet.code.Engine.massiveLengthOfElements;
import static hexlet.code.Engine.maxRandomValue;
import static hexlet.code.Engine.random;

import hexlet.code.Engine;

public final class Even {

    private Even() {
        throw new AssertionError("Utility class instantiation prohibited");
    }

    public static void startGameEven() {
        String gameDescription = "Answer \'yes\' if the number is even, otherwise answer \'no\'.";
        String[][] questionsAndAnswers = new String[massiveLength][massiveLengthOfElements];
        Engine.runGame(gameDescription, generateQuestionAnswer(questionsAndAnswers));
    }

    public static String[][] generateQuestionAnswer(String[][] questionsAndAnswers) {
        final int evenDivisor = 2;
        final int oddRemainder = 1;
        int numberOfIterations = questionsAndAnswers.length;

        for (int i = 0; i < numberOfIterations; i++) {
            int randomNumber = random.nextInt(maxRandomValue);
            questionsAndAnswers[i][0] = String.valueOf(randomNumber);
            if (randomNumber % evenDivisor == oddRemainder) {
                questionsAndAnswers[i][1] = "no";
            } else {
                questionsAndAnswers[i][1] = "yes";
            }
        }
        return questionsAndAnswers;
    }
}
