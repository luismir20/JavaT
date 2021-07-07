package ExercisesPackage;

import java.util.Scanner;

public class AlphabetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Insert letter: ");
		String letter = sc.next();

		if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u") {
			System.out.println("It is a vowel");

		} else {
			System.out.println("It is a consonant");
		}

	}

}
