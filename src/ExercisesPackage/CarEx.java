package ExercisesPackage;


class Car{
	
	String name;
	String model;
	int year;
	int reg_id;
	
	void call() {
		System.out.println("I love my car");
	}
}

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cr = new Car();
		
		cr.name = "Tesla";
		cr.model = "Model3";
		cr.year = 1995;
		cr.reg_id = 1423;
		
		System.out.println(cr.name);
		System.out.println(cr.model);
		System.out.println(cr.year);
		System.out.println(cr.reg_id);
		
		cr.call();
		
	}

}
