package ExercisesPackage;

import java.util.Scanner;

class Circle {

	int radius;

	void input(int radius) {
		this.radius = radius;
	}

	void circumference() {

		System.out.println("Circumference = " + (2 * radius * 3.14));

	}
}

public class CircumferenceExOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		int radius = sc.nextInt();

		Circle cr = new Circle();

		cr.input(radius);
		cr.circumference();

	}

}
