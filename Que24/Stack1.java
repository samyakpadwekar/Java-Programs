package Assgn4;

public class Stack1 {
		static final int MAX = 100;
		int top;
		int a[] = new int[MAX]; // Maximum size of Stack

		Stack1()
		{
			top = -1;
		}
		
		boolean isEmpty()
		{
		 
			if(top < 0)
			 	return true;
			 else 
				 return false;
		}
		
		boolean isfull() 
		{

			   if(top >= MAX)
			      return true;
			   else
			      return false;
			}

		boolean push(int x)
		{
			if (!(isfull())) {
				a[++top] = x;
				System.out.println(x + " pushed into stack");
				return true;
			}
			else {
				System.out.println("Stack Overflow");
				return false;
			}
		}

		int pop()
		{
			if (!isEmpty()) {
				int x = a[top--];
				return x;
			}
			else {
				System.out.println("Stack Underflow");
				return 0;
			}
		}

		int peek()
		{
			if (top < 0) {
				System.out.println("Stack Underflow");
				return 0;
			}
			else {
				int x = a[top];
				return x;
			}
		}
	}
