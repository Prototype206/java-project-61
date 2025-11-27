package hexlet.code;

import java.util.Scanner;

public final class Cli {
	public static final StringBuilder USER_NAME = new StringBuilder();
	
	private Cli() {
		throw new AssertionError("Utility class instantiation prohibited");
	}
	
	public static void greetings(Scanner scanner) {
		System.out.println("Welcome to the Brain Games!");
		System.out.print("May I have your name? ");
		USER_NAME.append(scanner.nextLine());
		System.out.println("Hello, " + USER_NAME + "!");
	}
}
