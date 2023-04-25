package MacMaven;

import java.util.Scanner;


public class BankAccount {
	static int currentbalance = 10000;

	public static void main(String args[]) {
		// BankaccountBalance.bank();
		// BankaccountBalance.balancecheck();
		BankAccount d = new BankAccount();
		d.decision();

		// System.out.println("Your account balance is" +d.decision() );
	}

	public String  decision() {
		Scanner obj2 = new Scanner(System.in);
		System.out.println("Enter whether to Withdraw or Deposit MO NEY");
		String wd = obj2.nextLine();
		// int deposit=obj2.nextInt();
		if (wd.equals("Withdraw")) {
			BankAccount.draw();
		} else if (wd.equals("Deposit")) {
			BankAccount.deposit();
		} else {
			System.out.println("Your input is defintly  invalid");
		}
return null;
	}

	public static void draw() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Amount to Withdraw ");
		int withdrawal = obj.nextInt();
		if (currentbalance >= withdrawal) {
			System.out.println("You have Withdrawn " + withdrawal);
			currentbalance = currentbalance - withdrawal;
			System.out.println("Balance after withdrawal: " + currentbalance);
		} else {
			System.out.println(" You can not withdraw " + withdrawal);

			System.out.println("Your balance is: " + currentbalance);
		}
		obj.close();
	}

	public static void deposit() {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter Amount to Withdraw/Deposit ");
		int deposit = obj1.nextInt();
		System.out.println(" Deposited " + deposit);
		currentbalance = currentbalance + deposit;
		System.out.println("Balance after deposit: " + currentbalance);
		obj1.close();
	}

	/*
	 * public static int balancecheck(){ BankaccountBalance1.draw();
	 * BankaccountBalance1.deposit();
	 * 
	 * System.out.println("Balance : "+ currentbalance); return currentbalance;
	 * 
	 * }
	 */

}


