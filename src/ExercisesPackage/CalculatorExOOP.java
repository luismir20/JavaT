package ExercisesPackage;

import java.util.Scanner;

class Calculator {

	void add(int x, int y) {

		System.out.println("Added: " + (x + y));
	}

	void subtract(int x, int y) {

		System.out.println("Subtracted:" + (x - y));
	}

	void multiply(int x, int y) {

		System.out.println("Multiplied: " + (x * y));
	}

	void divide(int x, int y) {

		if (y > 0) {
			System.out.println("Divide: " + (x / y));
		} else {
			System.out.println("Cannot divide by zero ");
		}
	}
}

public class CalculatorExOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Calculator x = new Calculator();
		Calculator y = new Calculator();

		System.out.println("Enter inputs: ");
		int n = sc.nextInt();
		int m = sc.nextInt();

		x.add(n, m);
		x.subtract(n, m);
		x.divide(n, m);
		x.multiply(n, m);

	}

}
