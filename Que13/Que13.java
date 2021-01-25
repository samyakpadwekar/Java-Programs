
package assignment3;

import java.util.Scanner;

class Date{
	private int month,day,year;

	public Date() {
		super();
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
	
	public void printDate()
	{
		System.out.println(this.getMonth()+"/"+this.getDay()+"/"+this.getYear());
	}
	
}
public class DateTest {

	public static void main(String[] args) {
		Date dt = new Date();
       
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Date:");
        dt.setDay(sc.nextInt());
        
        System.out.print("Enter Month:");
        dt.setMonth(sc.nextInt());
        
        System.out.print("Enter Year:");
        dt.setYear(sc.nextInt());
        
        dt.printDate();
        
	}

}
