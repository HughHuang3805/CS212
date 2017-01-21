package labprojects;

public class TemperatureMain {
	public static void main(String[] args){
		Temperature to = new Temperature(38, 'C');
		System.out.println(to.getTemperatureCelsius());
		System.out.println(to.getTemperatureFah());
	}
}
