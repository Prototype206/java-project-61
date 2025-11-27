package hexlet.code.games;

import java.util.Random;


public final class Progression {
	private static int numberTwo;
	private static int sumOfNumbers;
	private static int progressionLength;
	private static int numberToSkip;
	
	private Progression() {
		throw new AssertionError("Utility class instantiation prohibited");
	}

	public static void startGameProgression() {
		System.out.println("What number is missing in the progression?");
	}

	public static String generateCorrectAnswer() {
		Random random = new Random();
		int maxValue = 20;
		int minValue = 7;
		int numberOne = random.nextInt(100);
		numberTwo = random.nextInt(100);
		sumOfNumbers = numberOne;
		progressionLength = random.nextInt(maxValue - minValue + 1) + minValue;
		numberToSkip = random.nextInt(progressionLength);
		int correctAnswer = numberOne + numberTwo * numberToSkip;
		return String.valueOf(correctAnswer);
	}

	public static void generateProgression() {
		StringBuilder progressionString = new StringBuilder();
		progressionString.setLength(0);
		progressionString.append("Question: ");
		for(int i = 0; i < progressionLength; i++) {
			if(i == numberToSkip) {
				progressionString.append(".. ");
				sumOfNumbers += numberTwo;
				continue;
			}
			progressionString.append(sumOfNumbers + " ");
			sumOfNumbers += numberTwo;
		}
		System.out.println(progressionString.toString());
	}
	
}
