package Assgn4;

import java.util.Scanner;

public class Foreign
{
static Scanner sc = new Scanner(System.in);

private static double[] rates = {0.013582,0.011338,0.010186,1.416837,0.012288};

private static String[]countries = {"US Dollar","Euro","British Pound","Japanese Yen","Swiss Franc"}; 

private static double[] conversionAmount= new double[5];

private static double inr,max; 
 
public Foreign() {
	super();
}

static {
	inr=0.0;
	max=5;
}

public static void acceptInr()
{
System.out.print("\nPlease enter the amount in INR: ");
inr= sc.nextDouble();
}

public static void amountConversion()
{
	for(int i=0;i<max;++i)
	{
		double amount=0;
		//System.out.print("rates: "+rates[i]);
		//System.out.print(" INR to "+countries[i]+":");
		amount=inr * rates[i];
		//System.out.println(" Amount: "+amount);
		conversionAmount[i] = amount;
		
	}
}

public static void displayConversion()
{
	for(int i=0;i<max;++i)
	{
		System.out.println("INR to "+ countries[i]+": "+conversionAmount[i]);
		System.out.println();
	}
}

}



