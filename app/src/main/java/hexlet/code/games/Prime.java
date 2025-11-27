package hexlet.code.games;

public final class Prime {
	private static int number;
	private static int maxValue;
	private final static int MIN_VALUE = 3;
	private final static int EVEN_DIVISOR = 2;

	
	
	private Prime() {
		throw new AssertionError("Utility class instantiation prohibited");
	}
	
	public static void startGamePrime() {
		System.out.println("Answer \'yes\' if given number is prime. Otherwise answer \'no\'.");
	}
	
	public static String generateCorrectAnswer() {
		number = (int) (Math.random()*100);
		maxValue = (int) (Math.ceil(Math.sqrt(number)));
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
