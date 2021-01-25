package Assgn4;



public class TestRational {
	

	public static void main(String[] args) {
		
		int[][] result = new int[4][2];
		
		//Rational r1 = new Rational(2,4);
		//Rational r2 = new Rational(2,6);
		Rational r3 = new Rational();
		Rational r4 = new Rational();
		
		r3.acceptRecord();
		r4.acceptRecord();
		
		Rational addition = Rational.addNumbers(r3,r4);
		result[0][0]= addition.getNum();
		result[0][1]= addition.getDenom();
		
		Rational subtraction = Rational.subtractNumbers(r3,r4);
		result[1][0]= subtraction.getNum();
		result[1][1]= subtraction.getDenom();
		
		Rational multiplication = Rational.multiplyNumbers(r3,r4);
		result[2][0]= multiplication.getNum();
		result[2][1]= multiplication.getDenom();
		
		Rational division = Rational.divideNumbers(r3,r4);
		result[3][0]= division.getNum();
		result[3][1]= division.getDenom();
		
		Rational.printRecord(result);
		
		String str1 = r3.representAsString();
		System.out.println("Rational 1 As string (a/b): "+str1);
		String str2 = r4.representAsString();
		System.out.println("Rational 2 As string (a/b): "+str2);
		
		String str3 = r3.representInFloatingAsString();
		System.out.println("Rational 1 As Floating point: "+str3);
		String str4 = r4.representInFloatingAsString();
		System.out.println("Rational 2 As Floating point: "+str4);
	}
}
