package labprojects;

public class Cars {
	private String make;
	private String year;
	private String color;
	public static int numCars = 0;
	
	public String getMake(){return make;}
	public String getYear(){return year;}
	public String getColor(){return color;}
	public static int getNumCars(){return numCars;}
	
	public static void addCars(){numCars++;}
	public Cars(){
		make = "Ford";
		year = "2010";
		color = "green";
		addCars();
	}
	public Cars(String m, String c){
		make = m;
		color = c;
		addCars();
	}
	public Cars(String m, String c, String y){
		make = m;
		color = c;
		year = y;
		addCars();
	}
	public String toString(){
		String result = "The brand of the car is: " + make + "\n" +
						"The color of the car is: " + color + "\n" +
						"The year of the car is: " + year + "\n";
		return result;
	}
	
}
