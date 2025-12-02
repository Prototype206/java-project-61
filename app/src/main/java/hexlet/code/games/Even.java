package hexlet.code.games;

import static hexlet.code.Engine.random;
import hexlet.code.Engine;

public final class Even {
	
	private Even() {
		throw new AssertionError("Utility class instantiation prohibited");
	}
	
	public static void startGameEven() {
		String gameDescription = "Answer \'yes\' if the number is even, otherwise answer \'no\'.";
		String[][] questionsAndAnswers = new String[3][2];
		questionsAndAnswers = generateQuestionAnswer(questionsAndAnswers);
		Engine.runGame(gameDescription, questionsAndAnswers);
	}

	public static String[][] generateQuestionAnswer(String[][] questionsAndAnswers) {
		final int evenDivisor = 2;
		final int oddRemainder = 1;
		int numberOfIterations = questionsAndAnswers.length;
	
		for(int i = 0; i < numberOfIterations ;i++) {
			int randomNumber = random.nextInt(100);
			questionsAndAnswers[i][0] = String.valueOf(randomNumber);
			if(randomNumber % evenDivisor == oddRemainder) {
				questionsAndAnswers[i][1] = "no";
			}
			else {
				questionsAndAnswers[i][1] = "yes";
			}
		}
		return questionsAndAnswers;
	}
}
