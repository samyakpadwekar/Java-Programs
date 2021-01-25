package assgn5;

public class Area {
	
	public static int calcArea(Rectangle rectangle) {
		return rectangle.getBreadth() * rectangle.getLength();
	}
	
	public static int calcArea(Circle circle) {
		return (int)(Math.PI * circle.getRadius());
	}
	
	public static int calcArea(Triangle triangle) {
		return (int)(0.5 * triangle.getBase() * triangle.getHeight());
	}

}
