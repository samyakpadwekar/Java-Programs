package assgn5;

import java.util.Scanner;

abstract class Shape{
	protected double area;
	protected double perimeter;
	public Shape() {
		this.area = 0;
		this.perimeter= 0;
	}
	public abstract void calculateArea( );
	public final double getArea() {
		return this.area;
	}
	public abstract void calculatePerimeter( );
	public final double getPerimeter() {
			return this.perimeter;
	}
}
class Rectangle extends Shape{
	private double length;
	private double breadth;
	public Rectangle() {
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public void calculateArea( ) {
		this.area = this.length * this.breadth;
	}
	public void calculatePerimeter() {
		this.perimeter=(double) 2 * this.length * this.breadth;
		
	}
}
class Circle extends Shape{ 
	private double radius;
	public Circle() {
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void calculateArea( ) {
		this.area = Math.PI * Math.pow(this.radius, 2);
	}
	public void calculatePerimeter() {
		this.perimeter=(double) 2 * Math.PI * this.radius;
		
	}
}

class Triangle extends Shape{ 
	private double base;
	private double height;
	private double side1;
	private double side2;
	public Triangle() {
	}
	
	public void setBase(double base) {
		this.base = base;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void calculateArea( ) {
		this.area = .5d * this.base * this.height;
	}
	public void calculatePerimeter() {
		this.perimeter=(double) this.side1 + this.side2 + this.base;
		
	}
}


class ShapeFactory{
	public static Shape getInstance( int choice ) {
		switch( choice ) {
		case 1:	return new Rectangle();	
		case 2:	return new Circle();	
		case 3: return new Triangle();
		}
		return null;
	}
}
class ShapeTest{
	private Shape shape;	//null
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	private static Scanner sc = new Scanner(System.in);
	public void acceptRecord( ) {
		if( this.shape != null ) {
			if( shape instanceof Rectangle ) {
				Rectangle rect = (Rectangle) this.shape;	
				System.out.print("Length	:	");
				rect.setLength(sc.nextDouble());
				System.out.print("Breadth	:	");
				rect.setBreadth(sc.nextDouble());
			}else if(shape instanceof Circle) {
				Circle c = (Circle) this.shape;
				System.out.print("Radius	:	");
				c.setRadius(sc.nextDouble());
			}else {
				Triangle t=(Triangle) this.shape;
				System.out.print("Side1	:	");
				t.setSide1(sc.nextDouble());
				System.out.print("Side2	:	");
				t.setSide2(sc.nextDouble());
				System.out.print("Base	:	");
				t.setBase(sc.nextDouble());
				System.out.print("Length	:	");
				t.setHeight(sc.nextDouble());
			}
			this.shape.calculateArea();
			this.shape.calculatePerimeter();
		}
	}
	public void printRecord( ) {
		if( this.shape != null ) 
			{ System.out.println("Perimeter	:	"+this.shape.getPerimeter());
			System.out.println("Area	:	"+this.shape.getArea());
			}
		}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.println("3.Triangle");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
}
public class Que31 {
	public static void main(String[] args) {
		int choice;
		ShapeTest test = new ShapeTest();
		while( ( choice = ShapeTest.menuList( ) ) != 0 ) {
			Shape shape = ShapeFactory.getInstance(choice);
			if( shape != null ) {
				test.setShape(shape);
				test.acceptRecord();
				test.printRecord();
			}
		}
	}
}

