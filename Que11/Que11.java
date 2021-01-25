

package assignment3;

import java.util.Scanner;

class Invoice{
	private String partnum;
	private String partdisc;
	private int qty;
	private double price;
	
	public Invoice() {}

	public String getPartnum() {
		return partnum;
	}

	public void setPartnum(String partnum) {
		this.partnum = partnum;
	}

	public String getPartdisc() {
		return partdisc;
	}

	public void setPartdisc(String partdisc) {
		this.partdisc = partdisc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		if(qty>=0)
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price>=0)
		this.price = price;
	}
	
	
 
	
}
public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice i=new Invoice();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Part num :  ");
		i.setPartnum(sc.nextLine());
		System.out.println("Part discription :  ");
		i.setPartdisc(sc.nextLine());
		System.out.println("Part qty :  ");
		i.setQty(sc.nextInt());
		System.out.println("Part price :  ");
		i.setPrice(sc.nextFloat());
		
		System.out.println(i.getPartnum());
		System.out.println(i.getPartdisc());
		System.out.println(i.getQty());
		System.out.println(i.getPrice());
		 
	}

}
