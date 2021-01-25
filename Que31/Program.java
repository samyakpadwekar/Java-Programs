package assgn5;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	
	public static void acceptRecord(Rectangle rectangle) {
		System.out.print("Enter Length: ");
		rectangle.setLength(sc.nextInt());
		System.out.print("Enter Breadth: ");
		rectangle.setBreadth(sc.nextInt());
	}
	
	public static void acceptRecord(Circle circle) {
		System.out.print("Enter Radius: ");
		circle.setRadius(sc.nextInt());
	}
	
	public static void acceptRecord(Triangle triangle) {
		System.out.print("Enter Side 1: ");
		triangle.setSide1(sc.nextInt());
		System.out.print("Enter Side 2: ");
		triangle.setSide2(sc.nextInt());
		System.out.print("Enter Base: ");
		triangle.setBase(sc.nextInt());
		System.out.print("Enter Height: ");
		triangle.setHeight(sc.nextInt());
	}
	
	public static void printRecord(Rectangle rectangle) {
		System.out.println("The Area Of the Rectangle is: " + Area.calcArea(rectangle));
		System.out.println("The Perimeter Of the Rectangle is: " + Perimeter.calcPerimeter(rectangle));
		System.out.println();
	}
	
	public static void printRecord(Circle circle) {
		System.out.println("The Area Of the Circle is: " + Area.calcArea(circle));
		System.out.println("The Circumference Of the Circle is: " + Perimeter.calcPerimeter(circle));
		System.out.println();
	}
	
	public static void printRecord(Triangle triangle) {
		System.out.println("The Area Of the Triangle is: " + Area.calcArea(triangle));
		System.out.println("The Perimeter Of the Triangle is: " + Perimeter.calcPerimeter(triangle));
		System.out.println();
	}
	
	public static int menuList() {
		System.out.println("Find the Area and Perimeter Of: ");
		System.out.println("1. Rectangle");
		System.out.println("2. Circle");
		System.out.println("3. Triangle");
		System.out.println("0. EXIT.");
		System.out.println("Enter Choice: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		
		while((choice = Program.menuList()) != 0) {
			
			switch(choice) {
			case 1:
				Rectangle rectangle = new Rectangle();
				Program.acceptRecord(rectangle);
				Program.printRecord(rectangle);
				break;
			case 2:
				Circle circle = new Circle();
				Program.acceptRecord(circle);
				Program.printRecord(circle);
				break;
			case 3:
				Triangle triangle = new Triangle();
				Program.acceptRecord(triangle);
				Program.printRecord(triangle);
				break;
			}
		}

	}

}
