package labprojects;

public class Circle extends Shape{
	
	private int radius;
	private static final double PI = 3.14;
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	public int calculateArea(){
		this.area = (int) PI * radius * radius;
		return area;
	}
	
	public int calculatePerimeter(){
		this.perimeter = (int) PI * radius * 2;
		return perimeter;
	}

}
