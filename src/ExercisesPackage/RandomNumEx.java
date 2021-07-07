package ExercisesPackage;

import java.util.Scanner;
import java.util.Random;

public class RandomNumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random randomNum = new Random();
		int showMe = 1 + randomNum.nextInt(10);

		Scanner sc = new Scanner(System.in);

		System.out.println("Insert number: ");

		int user = sc.nextInt();
		
		if (showMe == user) {
			System.out.println("Well guessed");
		}
		else {
			System.out.println("Better luck next time bad guesser it was: " + showMe);
		}

	}

}
