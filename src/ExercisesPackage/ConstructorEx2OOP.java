package ExercisesPackage;
import java.util.Scanner;
class EmployeeHw {
	String name;
	int salary;
	int hoursworked;
	EmployeeHw(String name, int salary, int hoursworked) {
		this.name = name;
		this.salary = salary;
		this.hoursworked = hoursworked;
	}
	void getInfo() {
		System.out.println(" Employee info: " + name + " " + salary + " " + hoursworked);
	}
	void AddSal(int salary) {
		if (salary < 500) {
			this.salary = salary + 10;
			System.out.println("Salary with added credit: " + this.salary);
		} else {
			this.salary = salary;
			System.out.println("No salary increase");
		}
	}
	void AddWork(int hoursworked) {
		if (hoursworked > 6) {
			this.salary = this.salary + 5;
			System.out.println("Salary with added credit: " + this.salary);
		} else {
			this.salary = salary;
			System.out.println("No salary increase");
		}
	}
}
public class ConstructorEx2OOP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter salary: ");
		int salary = sc.nextInt();
		System.out.println("Enter hours: ");
		int hoursworked = sc.nextInt();
		EmployeeHw e = new EmployeeHw(name, salary, hoursworked);
		e.getInfo();
		System.out.println("Result with AddSal: ");
		e.AddSal(salary);
		e.getInfo();
		System.out.println("Result with AddWork: ");
		e.AddWork(salary);
	}
}
//unfinished
//need to get e.AddWork to include the added credit on top of credit originally added.