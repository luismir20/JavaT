package ExercisesPackage;

import java.util.Scanner;

public class SchoolEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Insert grade:");

		int grade = sc.nextInt();

		if (grade > 80) {
			System.out.println("A");
		} else if (grade > 60) {
			System.out.println("B");
		} else if (grade > 50) {
			System.out.println("C");
		} else if (grade > 45) {
			System.out.println("D");
		} else if (grade > 25) {
			System.out.println("E");
		} else {
			System.out.println("F");
		}

	}

}
