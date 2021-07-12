package ExercisesPackage;

import java.util.Scanner;

class Area {

	int length;
	int length2;
	int area;

	void input(int length, int length2) {

		this.length = length;
		this.length2 = length2;
	}

	void arearec() {
		this.area = this.length * this.length2;
		System.out.println(this.area + " = " + "area of the rectangle");
	}

}

public class RectangeExOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Area r = new Area();

		System.out.println("Enter length 1: ");
		int length = sc.nextInt();

		System.out.println("Enter length 2: ");
		int length2 = sc.nextInt();

		r.input(length, length2);
		r.arearec();

	}

}
