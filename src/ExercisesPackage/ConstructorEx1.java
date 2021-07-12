package ExercisesPackage;

import java.util.Scanner;

class Dog1{
	
	String color;
	int weight;
	int height;
	
	Dog1 (String color, int weight, int height){
		this.color = color;
		this.weight = weight;
		this.height = height;
	}
	
	void execute() {
	System.out.println("Dog information: " + color + " " +  weight + " " + height);
	}
}

public class ConstructorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter color: ");
	String color = sc.next();
	System.out.println("Enter weight: " );
	int weight = sc.nextInt();
	System.out.println("Enter height: ");
	int height = sc.nextInt();
	
	Dog1 d = new Dog1(color, weight, height);
	d.execute();
	//if using constructor do object after input / scanner
	}

}

//Constructor
//A constructor in Java is a special method that is used to initialize objects
//The constructor is called when an object of a class is created
//It can be used to set initial values for object attributes

//A constructor is the method which is called as soon as the object is created

