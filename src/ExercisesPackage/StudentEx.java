package ExercisesPackage;

class Student{
	
	String name;
	int roll_no;
	
	void call() {
		System.out.println("I love dominoes");
	}
	
}


public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		
		s1.name = "John";
		s1.roll_no = 2;
		
		System.out.println(s1.name);
		System.out.println(s1.roll_no);
		
		s1.call();
		
	}

}
