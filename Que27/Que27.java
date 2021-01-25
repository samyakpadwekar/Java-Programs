
package Assgn4;

import java.util.Scanner;

public class Que27 {
	static Scanner sc=new Scanner(System.in);
	
	public static void callingMethod(SavingAccount saver) {
		TestSavingAccount test=new TestSavingAccount();	
		
	    System.out.println("\nMonthly Interest       Monthly updated balance");
	    test.calculations(saver);
	    test.print();	    		   
	   }

	public static void main(String[] args) {
	   SavingAccount saver1=new SavingAccount(2000.00);	   	
	   SavingAccount saver2=new SavingAccount(3000.00);
	     
	   
	   System.out.println("\nEnter interest rate");
	   SavingAccount.modifyInterestRate(sc.nextDouble());
	   
	   System.out.println("\nSaver 1 details :");
		Que7.callingMethod(saver1);
		
		System.out.println("\nSaver 2 details :");
		Que7.callingMethod(saver2);
		
		System.out.println("\nEnter interest rate");
		SavingAccount.modifyInterestRate(sc.nextDouble());
		   
		System.out.println("\nSaver 1 details :\n");
		Que7.callingMethod(saver1);
			
		System.out.println("\nSaver 2 details :\n");
		Que7.callingMethod(saver2);
    
	   
     } 
	
}
