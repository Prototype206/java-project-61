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
				Cli.greetings();
				break;
			case 2:
				Even.startGameEven();
				break;
			case 3:
				Calc.startGameCalc();
				break;
			case 4:
				GCD.startGameGCD();
				break;
			case 5:
				Progression.startGameProgression();
				break;
			case 6:
				Prime.startGamePrime();
				break;
			case 0:
				break;
			default:
				throw new IllegalArgumentException("Unknown choise number " + usersChoise);
			}
		}
	}
}
