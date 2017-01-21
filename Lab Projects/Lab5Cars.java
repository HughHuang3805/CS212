package labprojects;

public class Lab5Cars {
	public static void main(String[]args){
		Cars toyota = new Cars("Toyota", "Green", "1999");
		Cars lexus = new Cars("Lexus", "Silver", "2010");
		Cars porche = new Cars("Porche", "Black", "2015");
		
		System.out.println(lexus);
		System.out.println(toyota);
		System.out.println(porche);
	}
}
