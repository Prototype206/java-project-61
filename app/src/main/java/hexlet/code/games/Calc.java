package hexlet.code.games;

import static hexlet.code.Engine.MAX_RANDOM_VALUE;
import static hexlet.code.Engine.NUMBER_OF_ARRAY_PAIRS;
import static hexlet.code.Engine.NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS;
import static hexlet.code.Engine.RANDOM;

import hexlet.code.Engine;

public final class Calc {

    private Calc() {
        throw new AssertionError("Utility class instantiation prohibited");
    }

    public static void startGameCalc() {
        String gameDescription = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[NUMBER_OF_ARRAY_PAIRS][NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS];
        Engine.runGame(gameDescription, generateQuestionAnswer(questionsAndAnswers));
    }

    public static String[][] generateQuestionAnswer(String[][] questionsAndAnswers) {

        int numberOfIterations = questionsAndAnswers.length;
        int correctAnswer;

        for (int i = 0; i < numberOfIterations; i++) {
            final int numberOfOperators = 3;
            int numberOne = RANDOM.nextInt(MAX_RANDOM_VALUE);
            int numberTwo = RANDOM.nextInt(MAX_RANDOM_VALUE);
            int operationNumber = RANDOM.nextInt(numberOfOperators);

            switch (operationNumber) {
            case (0):
                questionsAndAnswers[i][0] = numberOne + " + " + numberTwo;
                correctAnswer = numberOne + numberTwo;
                break;
            case (1):
                questionsAndAnswers[i][0] = numberOne + " - " + numberTwo;
                correctAnswer = numberOne - numberTwo;
                break;
            case (2):
                questionsAndAnswers[i][0] = numberOne + " * " + numberTwo;
                correctAnswer = numberOne * numberTwo;
                break;
            default:
                throw new IllegalArgumentException("Unknown number of operation " + operationNumber);
            }
            questionsAndAnswers[i][1] = String.valueOf(correctAnswer);
        }
        return questionsAndAnswers;
    }
}
