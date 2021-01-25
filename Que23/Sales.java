package Assgn4;

import java.util.Scanner;

public class Sales {
static Scanner sc = new Scanner(System.in);
	
	public static void acceptRecord(int[][] sales) {
		if(sales != null) {
			for(int p = 0;p<5;p++) {
				for(int s=0;s<4;s++) {
					System.out.println("Enter sale of product "+(p+1)+" for salesperson "+(s+1));
					sales[p][s] = sc.nextInt();
				}
			}
			calcsales(sales);
			calcproducts(sales);
		}
	}
	
	public static void calcproducts(int[][] sales) {
		for(int p = 0; p < 5;p++) {
			int tot = 0;
			for(int i = 0;i<4;i++) {
				tot = tot + sales[p][i];
			}
			sales[p][4] = tot;
		}
	}
	
	public static void calcsales(int[][] sales) {
		for(int s = 0; s < 4;s++) {
			int tot = 0;
			for(int i = 0;i<5;i++) {
				tot = tot + sales[i][s];
			}
			sales[5][s] = tot;
		}
	}
	
	public static void displayRecord(int[][] sales) {
		System.out.println();
		if(sales != null) {
			
			for(int p = 0;p<6;p++) {
				for(int s=0;s<5;s++) {
					System.out.print(" "+sales[p][s]+ " ");
				}
				System.out.println();
			}
		}
	}
}
