package Assgn4;

public class SavingAccount{
	private static double annualInterestRate;
	
	public SavingAccount(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	private double savingBalance;
	
	
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}	
	
	public static void modifyInterestRate(double rate) {
		SavingAccount.annualInterestRate=rate;
	}
	
	
	public double monthlyInterest() {
		return this.savingBalance*SavingAccount.annualInterestRate/1200;
	}
		
	public double monthlyBalance() {
		return this.savingBalance=this.savingBalance +monthlyInterest();
	}
	
}
