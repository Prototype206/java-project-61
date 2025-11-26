package hexlet.code;
import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Please enter the game number and press Enter.");
		System.out.print("1 - Greet\n2 - Even\n3 - Cacl\n4 - GCD\n0 - Exit\nYour choice: ");
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
		case 0:
			break;
		}
		}
		finally {
			scanner.close();
		}
	}
}
