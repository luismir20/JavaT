package ExercisesPackage;

import java.util.Scanner;

class Triangle {

	int l;
	int h;

	void input(int l, int h) {
		this.l = l;
		this.h = h;

		System.out.println("Input for length: " + this.l);
		System.out.println("Input for height: " + this.h);
	}

	void area() {
		double area = (((double) this.l * (double) this.h) / 2);
		System.out.println("area of triangle: " + area);
	}
}

public class TriangeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("input l:");
		int l = sc.nextInt();
		System.out.println("input h:");
		int h = sc.nextInt();

		Triangle t = new Triangle();

		t.input(l, h);
		t.area();

	}

}
