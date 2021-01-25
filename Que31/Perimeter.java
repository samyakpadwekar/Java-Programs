package assgn5;

public class Perimeter {
	
	public static int calcPerimeter(Rectangle rectangle) {
		return 2 * (rectangle.getLength() + rectangle.getBreadth());
	}
	
	public static int calcPerimeter(Circle circle) {
		return (int)(2 * Math.PI * circle.getRadius());
	}
	
	public static int calcPerimeter(Triangle triangle) {
		return (triangle.getSide1() + triangle.getSide2() + triangle.getBase());
	}
	
}
