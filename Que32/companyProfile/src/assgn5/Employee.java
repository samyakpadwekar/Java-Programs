package assgn5;

import java.util.Scanner;

public class Employee {
	
	Scanner sc = new Scanner(System.in);
	
	private String fname;
	private String lname;
	private int ssn;
	
	public Employee() {
		this("", "", 0);
	}
	
	public Employee(String fname, String lname, int ssn) {
		this.fname = fname;
		this.lname = lname;
		this.ssn = ssn;
	}
	
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public void acceptRecord() {
		System.out.print("Enter First Name: ");
		this.setFname(sc.nextLine());
		System.out.print("Enter Last Name: ");
		this.setLname(sc.nextLine());
		System.out.print("Enter Social Security Number: ");
		this.setSsn(sc.nextInt());
	}
	
	public void printRecord() {
		System.out.println();
		System.out.println("First Name: " + this.getFname());
		System.out.println("Last Name: " + this.getLname());
		System.out.println("Social Security Number: " + this.getSsn());
	}

}
