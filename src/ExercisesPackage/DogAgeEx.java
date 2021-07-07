package ExercisesPackage;

import java.util.Scanner;

public class DogAgeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("insert dog year in human years: ");
		double doginhy = sc.nextDouble();

		if (doginhy <= 2) {
			System.out.println("dog years:" + doginhy * 10.5);
		} else
			System.out.println("dog years:" + ((2 * 10.5) + ((doginhy - 2) * 4)));

	}

}
