package ExercisesPackage;

import java.util.Scanner;

class NewBank {

	String acHolderName;
	int acNumber;
	int balance;
	int credit;
	int debit;

	NewBank(String acHolderName, int acNumber, int balance) {
		this.acHolderName = acHolderName;
		this.acNumber = acNumber;
		this.balance = balance;
	}

	void credit(int credit) {
		this.credit = credit;
		this.balance = (balance + credit);
		System.out.println("New balance after credit: " + balance);
	}

	void debit(int debit) {
		this.debit = debit;
		this.balance = (balance - debit);
		System.out.println("New balance after debit: " + balance);
	}

	void printDetails() {
		System.out.println("Account Details: " + acHolderName + " " + acNumber + " " + balance);

	}

}

public class BankEx2OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Insert acHolderName: ");
		String acHolderName = sc.nextLine();

		System.out.println("Insert acNumber: ");
		int acNumber = sc.nextInt();

		System.out.println("Insert balance: ");
		int balance = sc.nextInt();

		NewBank b = new NewBank(acHolderName, acNumber, balance);
		b.printDetails();

		System.out.println("Insert credit: ");
		int credit = sc.nextInt();

		b.credit(credit);
		b.printDetails();

		System.out.println("Insert debit: ");
		int debit = sc.nextInt();

		b.debit(debit);
		b.printDetails();

	}

}


//updated with constructor
