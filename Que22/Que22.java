package Assgn4;

import java.util.Scanner;

public class Que22 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int choice;
		Seats s=new Seats();
		
		do{
		System.out.println("\nEnter type of ticket : ");
		System.out.println("0. Exit\n1. Firstclass\n2. Economy");
		choice=sc.nextInt();
		
		if(s.Status()==1) {			
		
		switch(choice)
		{
		case 1: 
			s.firstClass();
			break;
		case 2: 
			s.economyClass();
			break;
		}
		
		}
		else 
			break;
		}while(choice!=0);
		

	}

}

