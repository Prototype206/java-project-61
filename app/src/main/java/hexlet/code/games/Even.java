package hexlet.code.games;

public final class Even {
	private static int evenDivisor = 2;
	private static int oddRemainder = 1;
	private static StringBuilder correctAnswer = new StringBuilder();
	
	private Even() {
		throw new AssertionError("Utility class instantiation prohibited");
	}
	
	public static void startGameEven() {
		System.out.println("Answer \'yes\' if the number is even, otherwise answer \'no\'.");
	}
		

	public static String generateCorrectAnswer() {
		correctAnswer.setLength(0);
		int randomNumber = (int) (Math.random()*100);
		if(randomNumber % evenDivisor == oddRemainder) {
			correctAnswer.append("no");
		}
		else {
			correctAnswer.append("yes");
		}
		
		System.out.println("Question: " + randomNumber);
		return correctAnswer.toString();
	}
		

}
