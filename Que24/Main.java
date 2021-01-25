package Assgn4;

import java.util.Scanner;

class Main {
	public static void main(String args[])
	{
		Stack1 s = new Stack1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 elements in stack");
		s.push(sc.nextInt());
		s.push(sc.nextInt());
		s.push(sc.nextInt());
		
		System.out.println();
		
		System.out.println(s.pop() + " Popped from stack");
	}
}
