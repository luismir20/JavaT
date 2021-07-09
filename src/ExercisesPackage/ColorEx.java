package ExercisesPackage;

import java.util.Scanner;

class Color {

	String color;
	String type;
	int quantity;
	int rating;

	void input(String color, String type, int quantity, int rating) {
		
		this.color = color;
		this.type = type;
		this.quantity = quantity;
		this.rating = rating;
		
		
	}

	void display()
	{
		System.out.println("Results: ");
		System.out.println(this.color);
		System.out.println(this.type);
		System.out.println(this.quantity);
		System.out.println(this.rating);
	}

}

public class ColorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter color:");
		String color = sc.next();
		System.out.println("enter type:");
		String type = sc.next();
		System.out.println("enter quantity:");
		int quantity = sc.nextInt();
		System.out.println("enter rating:");
		int rating = sc.nextInt();
		
		Color cs = new Color();
		
		cs.input(color, type, quantity, rating);
		cs.display();
		
		
		
				
		
		
		
	}

}
