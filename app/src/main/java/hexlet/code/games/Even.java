package hexlet.code.games;

import static hexlet.code.Engine.random;

public final class Even {
	
	private Even() {
		throw new AssertionError("Utility class instantiation prohibited");
	}
	
	public static void startGameEven() {
		System.out.println("Answer \'yes\' if the number is even, otherwise answer \'no\'.");
	}
		

	public static String generateCorrectAnswer() {
		StringBuilder correctAnswer = new StringBuilder();
		final int evenDivisor = 2;
		final int oddRemainder = 1;
		correctAnswer.setLength(0);
		int randomNumber = random.nextInt(100);
		System.out.println("Question: " + randomNumber);
		
		if(randomNumber % evenDivisor == oddRemainder) {
			return "no";
		}
		else {
			return "yes";
		}
	}
		

}
