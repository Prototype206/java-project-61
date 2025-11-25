package hexlet.code;
import java.util.Scanner;

public class Even {
	public static void startGameEven(Scanner scanner) {

		System.out.println("Answer \'yes\' if the number is even, otherwise answer \'no\'.");
		int scoreCounter = 0;
		int scoreToWin = 3;
		int evenDivisor = 2;
		int oddRemainder = 1;
		
		
		StringBuilder correctAnswer = new StringBuilder();
		while(scoreCounter < scoreToWin) {
			int randomNumber = (int) (Math.random()*100);
			correctAnswer.setLength(0);
			
			if(randomNumber % evenDivisor == oddRemainder) {
				correctAnswer.append("no");
			}
			else {
				correctAnswer.append("yes");
			}
			System.out.println("Question: " + randomNumber);
			String answer = scanner.nextLine();
			if(answer.equals(correctAnswer.toString())) {
				System.out.println("Correct!");
				scoreCounter++;
			}
			else{
				System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer.toString() + ".\nLet\'s try again, " + Cli.userName + "!");
				break;
			}
		}
		if(scoreCounter == scoreToWin) {
			System.out.println("Congratulations, " + Cli.userName);
		}
	}
}
