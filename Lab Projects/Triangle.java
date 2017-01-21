package labprojects;

public class Triangle extends Shape{
	
	private int base;
	private int height;
	private int side1;
	private int side2;
	private int side3;
	
	public Triangle(int base, int height, int side1, int side2, int side3){
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public int calculateArea(){
		return this.area = (base * height) / 2;
	}

	public int calculatePerimter(){
		return this.perimeter = side1 + side2 + side3;
	}
}
