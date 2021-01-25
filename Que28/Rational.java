package Assgn4;

import java.util.Scanner;

public class Rational{
	private int num, denom;
	private static String[] operations = {"Addition","Subtraction","Multiplication","Division"}; 

	public Rational() {
		this.num = 1;
		this.denom = 2;
	}

	public Rational(int num, int denom) {
		int d;  
	    d = findGcd(num, denom); 
	    num = num / d;
	    denom = denom / d;
		this.num = num;
		if(this.num == 0)
			this.denom = 0;
		else
			this.denom = denom;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDenom() {
		return denom;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}

	static int findGcd(int num, int denom) {  
	    if (denom == 0)  
	        return num;  
	    return findGcd(denom, num % denom);      
	} 
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numerator : ");
		setNum(sc.nextInt());
		System.out.print("Denominator : ");
		setDenom(sc.nextInt());
	}
	
	public void print() {
		System.out.println(this.num+" "+this.denom);
	}
	
	public static void printRecord(int[][] arr) {
		if( arr != null ) {
			System.out.println();
			for( int row = 0; row < 4; ++ row ) {
				System.out.println(operations[row]+" : "+arr[row][0]+"/"+arr[row][1]);
			}
		}
	}
	
	public static Rational addNumbers(Rational r1, Rational r2) {
		Rational result = new Rational((r1.num * r2.denom) + (r2.num * r1.denom) , r1.denom * r2.denom);
		return result;
	}
	
	public static Rational subtractNumbers(Rational r1, Rational r2) {
		Rational result = new Rational((r1.num * r2.denom) - (r2.num * r1.denom) , r1.denom * r2.denom);
		return result;
	}
	
	public static Rational multiplyNumbers(Rational r1, Rational r2) {
		Rational result = new Rational(r1.num * r2.num , r1.denom * r2.denom);
		return result;
	}
	
	public static Rational divideNumbers(Rational r1, Rational r2) {
		Rational result = new Rational(r1.num * r2.denom , r1.denom * r2.num);
		return result;
	}
	
	public String representAsString() {
		return String.format("%d/%d", this.getNum(), this.getDenom());
	}
	
	public String representInFloatingAsString() {
		//float newNum = ;
		return String.format("%.2f", (float)this.num/this.denom);
	}
}
