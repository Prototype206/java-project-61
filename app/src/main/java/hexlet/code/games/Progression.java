package hexlet.code.games;

public final class Progression {
	private static int numberOne;
	private static int numberTwo;
	private static int sumOfNumbers;
	private static int progressionLength;
	private static int maxValue = 20;
	private static int minValue = 7;
	private static int numberToSkip;
	private static StringBuilder progressionString = new StringBuilder();
	private static int correctAnswer;
	
	private Progression() {
		throw new AssertionError("Utility class instantiation prohibited");
	}

	public static void startGameProgression() {
		System.out.println("What number is missing in the progression?");
	}

	public static String generateCorrectAnswer() {
		numberOne = (int) (Math.random()*100);
		numberTwo = (int) (Math.random()*100);
		sumOfNumbers = numberOne;
		progressionLength = (int) (Math.random()*(maxValue - minValue + 1) + minValue);
		numberToSkip = (int) (Math.random()*progressionLength);
		correctAnswer = numberOne + numberTwo * numberToSkip;
		return String.valueOf(correctAnswer);
	}

	public static void generateProgression() {
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
