package ExercisesPackage;

import java.util.Scanner;
public class SquareElseIfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("insert length: ");
		
		int l = sc.nextInt();
		
		System.out.println("insert width: ");
		int w = sc.nextInt();
		
		if (l==w) {
			System.out.println("This is a square");
		}
		else {
			System.out.println("This is not a square");
		}
		
		
		
		
	}

}
