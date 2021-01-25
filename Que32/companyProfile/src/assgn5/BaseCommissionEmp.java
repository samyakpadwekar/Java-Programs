package assgn5;

import java.util.Scanner;

public class BaseCommissionEmp extends CommissionEmployee{
	
	Scanner sc = new Scanner(System.in);
	
	private float baseSalary;

	public BaseCommissionEmp() {
		super();
		this.baseSalary = 0;
	}

	public BaseCommissionEmp(String fname, String lname, int ssn, float grossSale, float commissionRate, float baseSalary) {
		super(fname, lname, ssn, grossSale, commissionRate);
		this.baseSalary = baseSalary;
	}

	public float getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void acceptRecord() {
		super.acceptRecord();
		System.out.print("Enter Weekly Base Salary: ");
		this.setBaseSalary(sc.nextFloat());
	}
	
	public void printRecord() {
		super.printRecord();
		System.out.println("Weekly Base Salary: " + this.calSal());
		System.out.println();
	}
	
	public float calSal() {
		return ((this.getCommissionRate() * this.getGrossSale()) + this.getBaseSalary());
	}
	

}
