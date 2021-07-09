package ExercisesPackage;

class Dog {
	
	int age;
	int weight;
	String color;
	String type;
}



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog();
		
		dog1.age = 12;
		dog1.weight = 12;
		dog1.color = "gray";
		dog1.type = "graytype";
		
		System.out.println(dog1.age);
		System.out.println(dog1.weight);
		System.out.println(dog1.type);
		System.out.println(dog1.color);
		
	}

}
