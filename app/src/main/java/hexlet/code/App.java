package hexlet.code;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Please enter the game number and press Enter.");
		System.out.print("1 - Greet\n2 - Even\n0 - Exit\nYour choice: ");
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
			Even.startGameEven(scanner);
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
