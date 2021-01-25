package assgn5;

import java.util.Scanner;

public class SalariedEmployees extends Employee {
	
	Scanner sc = new Scanner(System.in);
	
	private int weeklySal;
	
	public SalariedEmployees() {
		this.weeklySal = 0;
	}
	
	public SalariedEmployees(String fname,String lname, int ssn, int weeklySal) {
		super(fname, lname, ssn);
		this.weeklySal = weeklySal;
	}

	public int getWeeklySal() {
		return weeklySal;
	}

	public void setWeeklySal(int weeklySal) {
		this.weeklySal = weeklySal;
	}
	
	public void acceptRecord() {
		super.acceptRecord();
		System.out.print("Enter Weekly Salary: ");
		this.setWeeklySal(sc.nextInt());		
	}
	
	public void printRecord() {
		super.printRecord();
		System.out.println("Weekly Salary: " + this.getWeeklySal());
		System.out.println();
	}
	
	
}
