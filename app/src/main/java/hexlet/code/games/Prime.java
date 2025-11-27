package hexlet.code.games;

import static hexlet.code.Engine.random;;

public final class Prime {
	private Prime() {
		throw new AssertionError("Utility class instantiation prohibited");
	}
	
	public static void startGamePrime() {
		System.out.println("Answer \'yes\' if given number is prime. Otherwise answer \'no\'.");
	}
	
	public static String generateCorrectAnswer() {
		int number = random.nextInt(100);
		int maxValue = (int) (Math.ceil(Math.sqrt(number)));
		final int MIN_VALUE = 3;
		final int EVEN_DIVISOR = 2;
		
		System.out.println("Question: " + number);
		if(number == EVEN_DIVISOR) {
			return "yes";
		}
		else if(number < EVEN_DIVISOR || number % EVEN_DIVISOR == 0) {
			return "no";
		}
		else {
			for(int i = MIN_VALUE; i < maxValue; i++) {
				if(number % i == 0) {
					return "no";
				}
			}
			return "yes";
		}
	}
	
}
