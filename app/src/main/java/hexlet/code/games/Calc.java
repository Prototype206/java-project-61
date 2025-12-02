package hexlet.code.games;

import static hexlet.code.Engine.random;

import hexlet.code.Engine;

public final class Calc {

	private Calc() {
		throw new AssertionError("Utility class instantiation prohibited");
	}
	
	
	public static void startGameCalc() {
		String gameDescription = "What is the result of the expression?";
		String[][] questionsAndAnswers = new String[3][2];
		questionsAndAnswers = generateQuestionAnswer(questionsAndAnswers);
		Engine.runGame(gameDescription, questionsAndAnswers);
	}
		
		public static String[][] generateQuestionAnswer(String[][] questionsAndAnswers) {
			
			int numberOfIterations = questionsAndAnswers.length;
			int correctAnswer;
			
			for(int i = 0; i < numberOfIterations ;i++) {
				int numberOne = random.nextInt(100);
				int numberTwo = random.nextInt(100);
				int operationNumber = random.nextInt(3);
				
				switch(operationNumber) {
					case(0):
						questionsAndAnswers[i][0] = numberOne + " + " + numberTwo;
						correctAnswer = numberOne + numberTwo;
						break;
					case(1):
						questionsAndAnswers[i][0] = numberOne + " - " + numberTwo;
						correctAnswer = numberOne - numberTwo;
						break;
					case(2):
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
