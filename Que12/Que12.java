package assignment3;

import java.util.Scanner;
import java.io.*;

class Employee{
	private String Firstname;
	private String Lastname;
	private double Monthlysalary;
	
	public Employee() {}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public double getMonthlysalary() {
		return Monthlysalary;
	}

	public void setMonthlysalary(double monthlysalary) {
		if(Monthlysalary>=0)
		Monthlysalary = monthlysalary;
	}
	
	public double Earlysalary() {
		return 12*this.Monthlysalary;
	}
	
 
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first employee details : ");
		
		System.out.println("First name emp1:  ");
		e1.setFirstname(sc.nextLine());
		System.out.println("Last name  emp1:  ");
		e1.setLastname(sc.nextLine());
		System.out.println("Monthly salary emp1:  ");
		e1.setMonthlysalary(sc.nextDouble());
		
		
		
		System.out.println("First name emp2:  "); 	
		sc.nextLine();
		e2.setFirstname(sc.nextLine());	
		
		System.out.println("Last name  emp2:  ");
		e2.setLastname(sc.nextLine());
		System.out.println("Monthly salary emp2:  ");
		e2.setMonthlysalary(sc.nextDouble());	
		
		
		System.out.println();
		System.out.println("First name of emp1:  "+e1.getFirstname());
		System.out.println("Last name  of emp1:  "+e1.getLastname());
		System.out.println("Monthly salary emp1:  "+e1.getMonthlysalary());
		
		System.out.printf("Yearly salary of emp1:  %.2f\n",e1.Earlysalary());
		e1.setMonthlysalary(e1.getMonthlysalary()*1.1);
		System.out.println("After 10% raise ");		
		System.out.printf("Yearly salary of emp1:  %.2f: ",e1.Earlysalary());
		
				
		
		
		System.out.println();
		System.out.println("\nFirst name of emp2:  "+e2.getFirstname());
		System.out.println("Last name of emp2:  "+e2.getLastname());
		System.out.println("Monthly salary of emp2:  "+e2.getMonthlysalary());
		
		System.out.printf("Yearly salary of emp2:  %.2f\n",e2.Earlysalary());
		e2.setMonthlysalary(e2.getMonthlysalary()*1.1);
		System.out.println("After 10% raise ");		
		System.out.printf("Yearly salary of emp2:  %.2f: ",e2.Earlysalary());		

		
	}

}