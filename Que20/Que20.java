

package assignment3;

import java.util.Scanner;

class Item{
	int itemNumber, qty;
	float itemValue;
	
	public Item(int itemNumber, float itemValue) {
		super();
		this.itemNumber = itemNumber;
		this.itemValue = itemValue;

	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public float getItemValue() {
		return itemValue;
	}

	public void setItemValue(int itemValue) {
		this.itemValue = itemValue;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}

public class SalesCommCalc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Item i1 = new Item(1, 239.99f);
		Item i2 = new Item(2, 129.75f);
		Item i3 = new Item(3, 99.95f);
		Item i4 = new Item(4, 350.89f);
		
		double totalSales=0.0;
		
		int opt=1;
		
		while(opt>0) {
			
			System.out.println("\nAdd quantitites of item\n1. Add item 1 qty\n2. Add item 2 qty\n3 .Add item 3 qty\n4. Add item 4 qty\n0. Get commision\nEnter choice: ");
			opt = sc.nextInt();
			
			switch (opt) {
			case 0:
				totalSales = i1.getQty() * i1.getItemValue() + i2.getQty() * i2.getItemValue() + i3.getQty() * i3.getItemValue() + i4.getQty() * i4.getItemValue();
				
				System.out.println("\nWeekly Commission = " + (200 + totalSales*0.09));
				break;

			case 1:
				System.out.println("\nEnter qty: ");
				i1.setQty(i1.getQty() + sc.nextInt());
				break;
			
			case 2:
				System.out.println("\nEnter qty: ");
				i2.setQty(i2.getQty() + sc.nextInt());
				break;
				
			case 3:
				System.out.println("\nEnter qty: ");
				i3.setQty(i3.getQty() + sc.nextInt());
				break;
				
			case 4:
				System.out.println("\nEnter qty: ");
				i4.setQty(i4.getQty() + sc.nextInt());
				break;
				
			default:
				break;
			}
		}
		
	}

}