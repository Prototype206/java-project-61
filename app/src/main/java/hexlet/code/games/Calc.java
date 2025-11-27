package hexlet.code.games;

public final class Calc {
	private static int minValue = 0;
	private static int maxValue = 2;
	private static int operationNumber;
	private static int correctAnswer = 0;
	private static int numberOne;
	private static int numberTwo;
	
	private Calc() {
		throw new AssertionError("Utility class instantiation prohibited");
	}
	
	
	public static void startGameCalc() {
		System.out.println("What is the result of the expression?");
	}
		
		public static String generateCorrectAnswer() {
			numberOne = (int) (Math.random()*100);
			numberTwo = (int) (Math.random()*100);
			operationNumber = (int) (Math.random()*(maxValue-minValue+1)+minValue);
			
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
