package hexlet.code.games;

public class GCD {
	private static int numberA;
	private static int numberB;
	private static int numberC;
	
	public static void startGameGCD() {
		System.out.println("Find the greatest common divisor of given numbers.");
	}
	
	public static String generateCorrectAnswer() {
		numberA = (int) (Math.random()*100);
		numberB = (int) (Math.random()*100);
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
