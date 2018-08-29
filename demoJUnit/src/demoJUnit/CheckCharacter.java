package demoJUnit;

import java.util.Scanner;

public class CheckCharacter {

	private static boolean isVowel = false;
	private char ch = scanInput();

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public void controller() {

		checkChar(ch);
		printResult(ch);

	}

	private static char scanInput() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = scanner.next().charAt(0);
		scanner.close();
		return ch;

	}

	private static void checkChar(char ch) {

		switch (ch) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			isVowel = true;
		}
		
	}

	private static void printResult(char ch) {
		
		if (isVowel == true) {
			System.out.println(ch + " is  a Vowel");
		} else {
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				System.out.println(ch + " is a Consonant");
			else
				System.out.println("Input is not an alphabet");
		}
		
	}

	public static void main(String[] args) {
		
		CheckCharacter chk = new CheckCharacter();
		chk.controller();
		
	}
}