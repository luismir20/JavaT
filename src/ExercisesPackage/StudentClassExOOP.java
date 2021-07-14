package ExercisesPackage;

class Student1 {

	String name;

	Student1(String name) {

		this.name = name;
	}

	Student1() {

		this.name = "unknown";

	}

	void display() {

		System.out.println("Student name: " + name);

	}

}

public class StudentClassExOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s1 = new Student1();
		Student1 s2 = new Student1("Luis");

		s1.display();
		s2.display();

	}

}
