package hexlet.code.games;

import static hexlet.code.Engine.random;

public final class Calc {

	private Calc() {
		throw new AssertionError("Utility class instantiation prohibited");
	}
	
	
	public static void startGameCalc() {
		System.out.println("What is the result of the expression?");
	}
		
		public static String generateCorrectAnswer() {
			int correctAnswer;
			int numberOne = random.nextInt(100);
			int numberTwo = random.nextInt(100);
			int operationNumber = random.nextInt(3);
			
			System.out.print("Question: " + numberOne);
			
			switch(operationNumber) {
				case(0):
					System.out.println(" + " + numberTwo);
					correctAnswer = numberOne + numberTwo;
					break;
				case(1):
					System.out.println(" - " + numberTwo);
					correctAnswer = numberOne - numberTwo;
					break;
				case(2):
					System.out.println(" * " + numberTwo);
					correctAnswer = numberOne * numberTwo;
					break;
				default:
					throw new IllegalArgumentException("Unknown number of operation " + operationNumber);
			}
			return String.valueOf(correctAnswer);
		}
}
