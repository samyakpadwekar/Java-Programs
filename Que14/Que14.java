

package assignment3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class HeartRates{
	private String fname;
	private String lname;
	public int day;
	public int month;
	public int year;
	
	//constructor
	public HeartRates() {
		
	}
	
	//constructor
	public HeartRates(String fname, String lname, int day, int month, int year) {
		this.fname = fname;
		this.lname = lname;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//getter-setter
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

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	//input info
	public void acceptInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First name : ");
		this.setFname(sc.nextLine());
		
		System.out.print("Last name  : ");
		this.setLname(sc.nextLine());
		
		System.out.println("Enter birthdate  ");
		System.out.print("       Day : ");
		this.setDay(sc.nextInt());
		
		System.out.print("     Month : ");
		this.setMonth(sc.nextInt());
		
		System.out.print("      Year : ");
		this.setYear(sc.nextInt());
		
	}
	
	//print details
	public void printInfo() {
		System.out.println("");
		System.out.println("First name      : "+this.fname);
		System.out.println("Last name       : "+this.lname);
		System.out.println("Date of birth   : "+this.day+"/"+this.month+"/"+this.year);
	}
	
	//find age
	public int calculateAge(LocalDate birthDate,LocalDate currentDate) {    
		return Period.between(birthDate, currentDate).getYears();
	}
	
	//person�s maximum heart rate
	public int findMaxRate(int age) {
		int AGE = age;
		return  220 - AGE;
	}
	
	//person�s target heart rate
	public void findTargetRate(int maxRate) {
		float MAX = (float)maxRate;
		float max = (float)(0.85)*MAX;
		float min = (float)(0.50)*MAX;
		System.out.printf("Target heart range : %.0f to %.0f",min,max);
	}
}
	
public class RateCalc {
	public static void main(String[] args) {
		HeartRates hr = new HeartRates();
		
		//accept data
		hr.acceptInfo();
		
		//print data
		hr.printInfo();
		
		//print age
		LocalDate today = LocalDate.now();   //2020-11-26
		LocalDate birthday = LocalDate.of(hr.year, hr.month, hr.day);
		int age = hr.calculateAge(birthday, today);
		System.out.print("Age : ");
		System.out.println(age);
		
		//max rate
		int maxRate = hr.findMaxRate(age);
		System.out.print("Max heart Rate     : ");
		System.out.println(maxRate);
		
		//target rate
		hr.findTargetRate(maxRate);

	}
}