package assgn5;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	
	Scanner sc = new Scanner(System.in);
	
	private float hourlyWage;
	private float hoursWorked;
	
	public HourlyEmployee() {
		this.hourlyWage = 0;
		this.hoursWorked = 0;
	}

	public HourlyEmployee(String fname, String lname, int ssn, float hourlyWage, float hoursWorked) {
		super(fname, lname, ssn);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}

	public float getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(float hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public float getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public void acceptRecord() {
		super.acceptRecord();
		System.out.print("Enter Hourly Wage: ");
		this.setHourlyWage(sc.nextFloat());
		System.out.print("Enter Hours Worked: ");
		this.setHoursWorked(sc.nextFloat());
	}
	
	public void printRecord() {
		super.printRecord();
		System.out.println("Hourly Wage: " + this.getHourlyWage());
		System.out.println("Hours Worked: " + this.getHoursWorked());
		System.out.println("Weekly Salary: " + this.calSal());
		System.out.println();
	}
	
	public float calSal() {
		if(this.getHoursWorked() < 40)
			return this.getHourlyWage() * this.getHoursWorked();
		else
			return (float)((40 * this.getHourlyWage()) + ((this.getHoursWorked() - 40) * (this.getHourlyWage() * 1.5) ));
	}
	

}
