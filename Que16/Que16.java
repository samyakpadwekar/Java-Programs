

package assignment3;


import java.util.Scanner;

class Plan {
	private int monthCharge;
	private float callCharge, smsCharge;
	private int freeCalls;
	private int disCalls;

	public Plan(int monthCharge, float callCharge, float smsCharge, int freeCalls, int disCalls) {
		this.monthCharge = monthCharge;
		this.callCharge = callCharge;
		this.smsCharge = smsCharge;
		this.freeCalls = freeCalls;
		this.disCalls = disCalls;
	}

	public float countBill(int numOfCall, int numOfSms) {

		float sum1;
		
		sum1 = (numOfCall - this.freeCalls - this.disCalls) * this.callCharge;
		if((numOfCall - this.freeCalls) < this.disCalls)
			sum1 = sum1 + ((float)numOfCall - this.freeCalls) * 0.5f * this.callCharge;
		else
			sum1 = sum1 + (this.disCalls ) * 0.5f * this.callCharge;
			
		sum1 = sum1 + (numOfSms * this.smsCharge) + this.monthCharge;
		
		return sum1+(sum1*0.125f);
	}

}

public class CellBill {

	public static void main(String[] args) {
		int numOfCall, numOfSms;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Plan A\n2. Plan B\n3. Plan C");
		System.out.println("Enter Choice for plan : ");
		int choice = sc.nextInt();
		
		System.out.println("Enter number of calls : ");
		numOfCall = sc.nextInt();
		
		System.out.println("Enter number of sms  : ");
		numOfSms = sc.nextInt();
		
		switch (choice) {
		case 1:
			Plan p1 = new Plan(199, 1.00f, 1.00f, 50, 50);
			System.out.printf(" %.2f",p1.countBill(numOfCall, numOfSms)); 
			
			break;
		case 2:
			Plan p2 = new Plan(299, 0.80f, 0.75f, 75, 75);
			System.out.printf(" %.2f",p2.countBill(numOfCall, numOfSms)); 
			break;
		case 3:
			Plan p3 = new Plan(399, 0.60f, 0.50f, 100, 100);
			System.out.printf(" %.2f",p3.countBill(numOfCall, numOfSms)); 
			break;
		}
	}
}