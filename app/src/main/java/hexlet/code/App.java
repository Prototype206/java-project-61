package hexlet.code;
import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Please enter the game number and press Enter.");
			System.out.print("1 - Greet\n2 - Even\n3 - Cacl\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
			int usersChoise = 0;
			
			try {
				usersChoise = Integer.parseInt(scanner.nextLine());
			}
			catch(NumberFormatException e){
				System.out.println("Wrong input! You need to enter a number");
			}
			
			switch(usersChoise){
			case 1:
				Cli.greetings(scanner);
				break;
			case 2:
				Cli.greetings(scanner);
				Even.startGameEven();
				Engine.runGame(Engine.EVEN_GAME_NUMBER, scanner);
				break;
			case 3:
				Cli.greetings(scanner);
				Calc.startGameCalc();
				Engine.runGame(Engine.CALC_GAME_NUMBER, scanner);
				break;
			case 4:
				Cli.greetings(scanner);
				GCD.startGameGCD();
				Engine.runGame(Engine.GCD_GAME_NUMBER, scanner);
				break;
			case 5:
				Cli.greetings(scanner);
				Progression.startGameProgression();
				Engine.runGame(Engine.PROGRESSION_GAME_NUMBER, scanner);
				break;
			case 6:
				Cli.greetings(scanner);
				Prime.startGamePrime();
				Engine.runGame(Engine.PRIME_GAME_NUMBER, scanner);
				break;
			case 0:
				break;
			default:
				throw new IllegalArgumentException("Unknown choise number " + usersChoise);
			}
		}
	}
}
