
package assignment3;


import java.util.Scanner;

class FD{
	public double amt;
	private double years;
	
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public void setYears(double years) {
		this.years = years;
	}

	
	public void totAmt(double T)
	{	
		System.out.println("Total Amount after " + T + " years");
		if(T >= 5) 
		{
			double r=10;
			System.out.print(amt * (Math.pow((1 + r / 100), T)));
		}
		else if((this.amt < 2000) && (T >= 2) )
		{
			double r = 5;
			System.out.print(amt * (Math.pow((1 + r / 100), T)));
		}
		else if((this.amt < 6000) && (T >= 2) )
		{
			double r=7;
			System.out.print(amt * (Math.pow((1 + r / 100), T)));
		}
		else if((this.amt > 6000) && (T >= 1) )
		{
			double r=8;
			System.out.print(amt * (Math.pow((1 + r / 100), T)));
		}
		else
		{
			double r=3;
			System.out.print(amt * (Math.pow((1 + r / 100), T)));
	    }
	
	}
	
	
}
public class FDtest {

	public static void main(String[] args) {
		FD fd = new FD();
       
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Amount: ");
        fd.setAmt(sc.nextDouble());
        
        System.out.print("Enter Year to calculate total amount: ");
        double Years = sc.nextDouble();
        
        fd.setYears(Years);
        
        fd.totAmt(Years);
        
	}

}
