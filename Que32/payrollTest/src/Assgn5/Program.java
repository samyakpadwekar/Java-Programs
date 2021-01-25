package Assgn5;

import java.util.Scanner;

import assgn5.BaseCommissionEmp;
import assgn5.CommissionEmployee;
import assgn5.Employee;
import assgn5.HourlyEmployee;
import assgn5.SalariedEmployees;

public class Program {
	static Scanner sc = new Scanner(System.in);
	
	public static int menuList() {
		System.out.println("Type Of Employee: ");
		System.out.println("1. Salaried Employee.");
		System.out.println("2. Hourly-Employee.");
		System.out.println("3. Commission-Employee.");
		System.out.println("4. BasePlus-Commission-Employee");
		System.out.println("0. EXIT");
		System.out.print("Enter your Choice: ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		int choice;
		
		while((choice = Program.menuList()) != 0) {
			switch(choice) {
			case 1:
				SalariedEmployees se = new SalariedEmployees();
				se.acceptRecord();
				se.printRecord();
				break;
			case 2:
				HourlyEmployee he = new HourlyEmployee();
				he.acceptRecord();
				he.printRecord();
				break;
			case 3:
				CommissionEmployee ce = new CommissionEmployee();
				ce.acceptRecord();
				ce.printRecord();
				break;
			case 4:
				BaseCommissionEmp be = new BaseCommissionEmp();
				be.acceptRecord();
				be.printRecord();
				break;
			}
		}
	}
}
