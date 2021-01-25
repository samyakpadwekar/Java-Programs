

package assignment3;

import java.util.Scanner;

class Circle{
	private int radius;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void Diameter() {
		System.out.println("Diameter:" + 2 * this.radius);
	}

	public void Circumference() {
		System.out.println("Circumference:" + 2 * Math.PI * this.radius);
	}

	public void Area() {
		System.out.println("Area:" + Math.PI * this.radius * this.radius);
	}
	
	
}
public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle();
       
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Radius:");
        c.setRadius(sc.nextInt());
        
        c.Diameter();
        c.Circumference();
        c.Area();
	}

}
