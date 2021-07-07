package ExercisesPackage;

import java.util.Scanner;

public class ForFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("insert length: ");
		int l = sc.nextInt();

		System.out.println("length: " + l);
		System.out.println("insert width: ");
		int w = sc.nextInt();

		System.out.println("width: " + w);
		int area = l * w;
		int perimeter = l + l + w + w;
		System.out.println("The area of the rectangle is " + area + " and the perimeter is: " + perimeter);

	}

}
