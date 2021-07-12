package ExercisesPackage;

import java.util.Scanner;

class Bank {

	int accountNo;
	int balance;
	String acHolder;

	void input(int accountNo, int balance, String acHolder) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.acHolder = acHolder;
	}

	void execute() {

		System.out.println("Bank Information: " + accountNo + " " + balance + " " + acHolder);

	}

}

public class BankExOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();

		System.out.println("Enter accounNo: ");
		int accountNo = sc.nextInt();
		System.out.println("Enter balance: ");
		int balance = sc.nextInt();
		System.out.println("Enter acHolder: ");
		String acHolder = sc.nextLine();
		acHolder = sc.nextLine();

		b.input(accountNo, balance, acHolder);
		b.execute();

	}

}
