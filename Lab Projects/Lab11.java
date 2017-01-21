package labprojects;

public class Lab11 {
	public static void main(String[] args) {
		Triangle myTriangle = new Triangle(2, 3, 1, 2, 3);
		myTriangle.calculateArea();
		System.out.println(myTriangle.area);
		Circle myCircle = new Circle(5);
		myCircle.calculateArea();
		System.out.println(myCircle.area);
	}
}
