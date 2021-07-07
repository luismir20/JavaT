package ExercisesPackage;

import java.util.Scanner;

public class InputExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Input a: ");
		String a = sc.next();
		
		System.out.println("Input b: ");
		String b = sc.next();
		
		System.out.println("Original:" + a + " " + b);
		
		String temp = a;
		
		a = b;
		
		b = temp;
		
		System.out.println("Flipped: " + a + " " + b);
		
		
		
		
		
	
		
		
	}

}
