package labprojects;

public class Rectangle extends Shape{
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public int calculateArea(){
		return this.area = length * width;
	}
	
	public int calculatePerimeter(){
		return this.area = 2 * (length + width);
	}
}
