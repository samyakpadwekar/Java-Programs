package assgn5;

public class Triangle {
	private int base;
	private int height;
	private int side1;
	private int side2;
	
	public Triangle() {
		this(0,0,0,0);
	}
	
	public Triangle(int base, int height, int side1, int side2) {
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}
	
}
