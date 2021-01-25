package Assgn4;

import java.util.Scanner;

public class TestSavingAccount {	
   
    static double [][]arr=new double[12][2];    	 
    
	 public void calculations(SavingAccount saver)
	{
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<12;++i) {		
			TestSavingAccount.arr[i][0]=saver.monthlyInterest();
			TestSavingAccount.arr[i][1]=saver.monthlyBalance();	
		}	

	}
	 
	 public void print() {
		 
		 System.out.println();
		 for(int i=0;i<12;++i) 
			 System.out.printf("\n%.2f%.2f",arr[i][0],arr[i][1]);
		 System.out.println();
	 }
	
	 
}

    
