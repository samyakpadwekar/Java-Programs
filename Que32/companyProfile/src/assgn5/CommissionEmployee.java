package assgn5;

public class CommissionEmployee extends Employee {
	private float grossSale;
	private float commissionRate;
	
	public CommissionEmployee() {
		this.grossSale = 0;
		this.commissionRate = 0;
	}

	public CommissionEmployee(String fname, String lname, int ssn, float grossSale, float commissionRate) {
		super(fname, lname, ssn);
		this.grossSale = grossSale;
		this.commissionRate = commissionRate;
	}

	public float getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(float grossSale) {
		this.grossSale = grossSale;
	}

	public float getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(float commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public void acceptRecord() {
		super.acceptRecord();
		System.out.print("Enter Weekly Gross Sales: ");
		this.setGrossSale(sc.nextFloat());
		System.out.print("Enter Commission Rate(do not enter it in %): ");
		this.setCommissionRate(sc.nextFloat());
	}
	
	public void printRecord() {
		super.printRecord();
		System.out.println("Gross Sales: " + this.getGrossSale());
		System.out.println("Commission Rate: " + this.getCommissionRate());
		System.out.println("Weekly Salary: " + this.calSal());
		System.out.println();
	}
	
	public float calSal() {
		return this.getCommissionRate() * this.getGrossSale();
	}
	
}
