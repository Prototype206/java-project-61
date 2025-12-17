package hexlet.code.games;

import static hexlet.code.Engine.NUMBER_OF_ARRAY_PAIRS;
import static hexlet.code.Engine.NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS;
import static hexlet.code.Engine.RANDOM;

import hexlet.code.Engine;

public final class Calc {
    private static final char[] ARRAY_OF_OPERATIONS = {'+', '-', '*'};

    private Calc() {
        throw new AssertionError("Utility class instantiation prohibited");
    }

    public static void startGameCalc() {
        String gameDescription = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[NUMBER_OF_ARRAY_PAIRS][NUMBER_OF_ELEMENTS_IN_ARRAY_PAIRS];
        Engine.runGame(gameDescription, generateQuestionAnswer(questionsAndAnswers));
    }

    public static String[][] generateQuestionAnswer(String[][] questionsAndAnswers) {
        final int maxRandomValue = 100;
        final int numberOfOperators = ARRAY_OF_OPERATIONS.length;
        for (String[] pairs : questionsAndAnswers) {
            int numberOne = RANDOM.nextInt(maxRandomValue);
            int numberTwo = RANDOM.nextInt(maxRandomValue);
            char operator = ARRAY_OF_OPERATIONS[RANDOM.nextInt(numberOfOperators)];
            pairs[0] = generateQuestion(numberOne, numberTwo, operator);
            pairs[1] = String.valueOf(generateAnswer(numberOne, numberTwo, operator));
        }
        return questionsAndAnswers;
    }

    public static String generateQuestion(int numberOne, int numberTwo, char operator) {
        return numberOne + " " + operator + " " + numberTwo;
    }

    public static int generateAnswer(int numberOne, int numberTwo, char operator) {
        return calculate(numberOne, numberTwo, operator);
    }

    private static int calculate(int numberOne, int numberTwo, char operator) {
        switch (operator) {
        case '+':
            return numberOne + numberTwo;
        case '-':
            return numberOne - numberTwo;
        case '*':
            return numberOne * numberTwo;
        default:
            throw new IllegalArgumentException("Unknown operator");
        }
    }

}
