package Assgn5;

import java.time.LocalDate;
import java.util.Scanner;

public class Date {
	Scanner sc = new Scanner(System.in);
	
	private int day;
	private int month;
	private int year;
	
	public Date() {
		LocalDate ldt = LocalDate.now();
		this.day = ldt.getDayOfMonth();
		this.month = ldt.getMonthValue();
		this.year = ldt.getYear();
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
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
	
}
