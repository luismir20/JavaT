package ExercisesPackage;

import java.util.Scanner;

class Employee{
	String name;
	int yearjoin;
	int salary;
	String address;
	
	
	void input(String name, int yearjoin, int salary, String address) {
		
		this.name = name;
		this.yearjoin = yearjoin;
		this.salary = salary;
		this.address = address;}
		
	void display() {
		
		System.out.println("Information: ");
		System.out.println(this.name);
		System.out.println(this.yearjoin);
		System.out.println(this.salary);
		System.out.println(this.address);
	}
}



public class InformationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Employee");
		System.out.println("input name: ");
		String name = sc.next();
		System.out.println("input year joined: ");
		int yearjoin = sc.nextInt();
		System.out.println("input salary: ");
		int salary = sc.nextInt();
		System.out.println("input address: ");
		String address = sc.next();
		
		Employee e1 = new Employee();
		e1.input(name, yearjoin, salary, address);
		e1.display();
		
		System.out.println("Employee");
		System.out.println("input name: ");
		String name2 = sc.next();
		System.out.println("input year joined: ");
		int yearjoin2 = sc.nextInt();
		System.out.println("input salary: ");
		int salary2 = sc.nextInt();
		System.out.println("input address: ");
		String address2 = sc.next();
		
		
		Employee e2 = new Employee();
		e2.input(name2, yearjoin2, salary2, address2);
		e2.display();
		
		
		System.out.println("Employee");
		System.out.println("input name: ");
		String name3 = sc.next();
		System.out.println("input year joined: ");
		int yearjoin3 = sc.nextInt();
		System.out.println("input salary: ");
		int salary3 = sc.nextInt();
		System.out.println("input address: ");
		String address3 = sc.next();
		
		Employee e3 = new Employee();
		e3.input(name3, yearjoin3, salary3, address3);
		e3.display();
		
		
		
		
		
		
		
	}

}
