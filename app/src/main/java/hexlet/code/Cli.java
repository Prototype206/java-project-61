package hexlet.code;

import java.util.Scanner;

public final class Cli {
	public static String userName;
	
	private Cli() {
		throw new AssertionError("Utility class instantiation prohibited");
	}
	
	public static void greetings(Scanner scanner) {
		System.out.println("Welcome to the Brain Games!");
		System.out.print("May I have your name? ");
		userName = scanner.nextLine();
		System.out.println("Hello, " + userName + "!");
	}
}
