package labprojects;

public class Temperature {
	private float celsius;
	private float fahrenheit;
	private char type;
	
	public Temperature(){
		celsius = 0;
	}
	
	public Temperature(float degree, char t){
		type = t;
		if(type == 'C'){
			celsius = degree;
			fahrenheit = convert(celsius, type);
		}
		else if(type =='F'){
			fahrenheit = degree;
			celsius = convert(fahrenheit,type);
		}
	}
	
	public static float convert(float degree, char x){
		if(x == 'C') return (float)1.8 * degree + 32;
		else return (float)((degree - 32)/1.8);
	}
	
	public float getTemperatureCelsius(){
		return celsius;
	}
	
	public float getTemperatureFah(){
		return fahrenheit;
	}
}
