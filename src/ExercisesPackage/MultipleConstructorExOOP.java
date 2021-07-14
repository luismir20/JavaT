package ExercisesPackage;

class Dog5 {

	String name;
	int height;
	int weight;

	Dog5() {
		this.name = "unknown";
		this.height = 0;
		this.weight = 0;
	}

	Dog5(String name, int height) {
		this.name = name;
		this.height = height;
		this.weight = 0;
	}

	Dog5(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	void display() {
		System.out.println("Dog information: " + name + " " + height + " " + weight);
	}
}

public class MultipleConstructorExOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog5 d = new Dog5();
		Dog5 n = new Dog5("Gray", 10);
		Dog5 i = new Dog5("Gray", 10, 10);

		d.display();
		n.display();
		i.display();

	}

}
