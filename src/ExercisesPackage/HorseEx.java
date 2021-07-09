package ExercisesPackage;

class Horse {
	int age;
	int size;
	String color;
	String type;

	void noise() {
		System.out.println("meeehhh");
	}

	void sleep() {
		System.out.println("Zzzzz");
	}

}

public class HorseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Horse horse1 = new Horse();

		horse1.age = 12;
		horse1.size = 12;
		horse1.color = "gray";
		horse1.type = "type";

		System.out.println(horse1.age);
		System.out.println(horse1.size);
		System.out.println(horse1.color);
		System.out.println(horse1.type);

		horse1.noise();
		horse1.sleep();

		Horse horse2 = new Horse();

		horse2.age = 12;
		horse2.size = 12;
		horse2.color = "gray";
		horse2.type = "type";

		System.out.println(horse2.age);
		System.out.println(horse2.size);
		System.out.println(horse2.color);
		System.out.println(horse2.type);

		horse2.noise();
		horse2.sleep();

	}

}
