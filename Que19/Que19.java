

package assignment3;

import java.util.Scanner;

class custFacts {
	private int accountNum, balance, totalCharges, totalCredits, creditLimit;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Account Number  : ");
		this.accountNum = sc.nextInt();

		System.out.print("Balance at begining : ");
		this.balance = sc.nextInt();

		System.out.print("Total charges per month : ");
		this.totalCharges = sc.nextInt();

		System.out.print("Total Balance credited per month : ");
		this.totalCredits = sc.nextInt();

		System.out.print("Credit Limit : ");
		this.creditLimit = sc.nextInt();
	}

	public int getCreditLimit() {
		return this.creditLimit;
	}
		public int newBalance() {
		return this.balance + this.totalCharges - this.totalCredits;
	}

}

public class CreditCal {

	public static void main(String[] args) {
		custFacts c = new custFacts();
		c.acceptRecord();
		System.out.println("Total Limit : "+c.newBalance());
		if(c.newBalance() > c.getCreditLimit())
			System.out.println("Credit Limit exceeded");

	}

}
