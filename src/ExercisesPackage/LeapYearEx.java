package ExercisesPackage;

import java.util.Scanner;

public class LeapYearEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Input year: ");
		int year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " year is a leap year");
		} else if (year % 400 == 0) {
			System.out.println(year + "year is a leap year");

		} else {
			System.out.println(year + " is not a leap year");
		}

	}
}