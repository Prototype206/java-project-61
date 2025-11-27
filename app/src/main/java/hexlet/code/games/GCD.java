package hexlet.code.games;

import java.util.Random;

public final class GCD {
	
	private GCD() {
		throw new AssertionError("Utility class instantiation prohibited");
	}
	
	public static void startGameGCD() {
		System.out.println("Find the greatest common divisor of given numbers.");
	}
	
	public static String generateCorrectAnswer() {
		Random random = new Random();
		int numberA = random.nextInt(100);
		int numberB = random.nextInt(100);
		int numberC;
		System.out.println("Question: " + numberA + " " + numberB);
		while(true) {
			if(numberB > 0) {
				numberC = numberA;
				numberA = numberB;
				numberB = numberC % numberB;
			}
			else {
				break;
			}
		}
		return String.valueOf(numberA);
	}
}
