package hexlet.code;

import java.util.Scanner;

public final class Cli {
	private Cli() {
		throw new AssertionError("Utility class instantiation prohibited");
	}
	
	public static void greetings() {
		try(Scanner scanner = new Scanner(System.in)) {
		System.out.println("\nWelcome to the Brain Games!");
		System.out.print("May I have your name? ");
		String userName = scanner.nextLine();
		System.out.println("Hello, " + userName + "!");
		}
	}
}
