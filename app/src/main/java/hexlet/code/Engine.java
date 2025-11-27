package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public final class Engine {
	private static int scoreCounter = 0;
	private static int scoreToWin = 3;
	private static StringBuilder correctAnswer = new StringBuilder();
	private static StringBuilder usersAnswer = new StringBuilder();
	static final int EVEN_GAME_NUMBER = 2;
	static final int CALC_GAME_NUMBER = 3;
	static final int GCD_GAME_NUMBER = 4;
	static final int PROGRESSION_GAME_NUMBER = 5;
	static final int PRIME_GAME_NUMBER = 6;
	
	private Engine() {
		throw new AssertionError("Utility class instantiation prohibited");
	}
	
	public static void runGame(int gameNumber, Scanner scanner) {
		for(int i = 0; i<scoreToWin; i++) {
			correctAnswer.setLength(0);
			usersAnswer.setLength(0);
			
			switch(gameNumber) {
				case EVEN_GAME_NUMBER:
					correctAnswer.append(Even.generateCorrectAnswer());
					break;
				case CALC_GAME_NUMBER:
					correctAnswer.append(Calc.generateCorrectAnswer());
					break;
				case GCD_GAME_NUMBER:
					correctAnswer.append(GCD.generateCorrectAnswer());
					break;
				case PROGRESSION_GAME_NUMBER:
					correctAnswer.append(Progression.generateCorrectAnswer());
					Progression.generateProgression();
					break;
				case PRIME_GAME_NUMBER:
					correctAnswer.append(Prime.generateCorrectAnswer());
					break;
				default:
					throw new IllegalArgumentException("Unknown number of game " + gameNumber);
			}
			
			System.out.print("Your answer: ");
			usersAnswer.append(scanner.nextLine());
			if(usersAnswer.toString().equals(correctAnswer.toString())) {
				System.out.println("Correct!");
				scoreCounter++;
			}
			else{
				System.out.println(usersAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer.toString() + ".\nLet\'s try again, " + Cli.userName + "!");
				break;
			}
			if(scoreCounter == scoreToWin) {
				System.out.println("Congratulations, " + Cli.userName);
			}
		}
	}

}
