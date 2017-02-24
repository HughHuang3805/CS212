//Xiaoquan Huang
//CS212 night

public class Project2 {
	final static String [][] DATA = { 
		{"Air Berlin", "4504", "Boeing", "767-300", "Zurich (ZRH)", "New York, NY (JFK)", "2-26 1000", "2-26 1325"}, 
		{"Qatar Airways", "212", "Boeing", "767-300", "Milano (MXP)", "New York, NY (JFK)", "2-26 1000", "2-26 1330"},
		{"Jetblue Airways", "298", "Airbus", "A320", "Tampa, FL (TPA)", "New York, NY (JFK)", "2-26 0728", "2-26 0959"}, 					
		{"Air Canada", "6851", "Airbus", "A340-300", "Dakar (DKR)", "New York, NY (JFK)", "2-26 0255", "2-26 0650"}, 
		{"Alaska Airlines", "1219", "Boeing", "737-800", "Boston, MA (BOS)", "New York, NY (JFK)","2-26 0940", "2-26 1055"},
		{"Delta Airlines", "6182", "Canadadair", "CRJ", "Toronto (YYZ)", "New York, NY (JFK)", "2-26 0606", "2-26 0800"}, 
		{"American Airline", "199", "Boeing", "767-300", "Milano (MXP)", "New York, NY (JFK)", "2-26 1010", "2-26 1330"},
		{"United Airlines", "9855", "Boeing", "767-300", "Cairo (CAI)", "New York, NY (JFK)", "2-26 1025", "2-26 0325"}, 
		{"Virgin America", "483", "Airbus", "A320", "San Francisco (SFO)", "New York, NY (JFK)", "2-25 2320", "2-26 0750"}, 
		{"Air France", "3650", "Boeing", "767-400", "Barcelona (BCN)", "New York, NY (JFK)", "2-26 1055", "2-26 0158"},
		{"Air China", "7266", "Boeing", "757-200", "Los Angeles, CA (LAX)", "New York, NY (JFK)","2-25 2159", "2-26 0616"}
	};
	
	public static void main(String[]args){
		Airplane[] arrayAirplanes = new Airplane[DATA.length];
		for(int i = 0; i < DATA.length; i++){
			int j = 0;
			arrayAirplanes[i] = new Airplane();
			arrayAirplanes[i].setAirline(DATA[i][j]);
			arrayAirplanes[i].setFlightNumber(DATA[i][j+1]);
			arrayAirplanes[i].setMake(DATA[i][j+2]);
			arrayAirplanes[i].setModel(DATA[i][j+3]);
			arrayAirplanes[i].setDeparture(DATA[i][j+4]);
			arrayAirplanes[i].setArrival(DATA[i][j+5]);
			arrayAirplanes[i].setDepartureTime(DATA[i][j+6]);
			arrayAirplanes[i].setArrivalTime(DATA[i][j+7]);
		}
		
		System.out.println("This is the original list: ");
		for(int i = 0; i < DATA.length; i++){
			System.out.println(arrayAirplanes[i]);
			System.out.println();
		}
		
		sortList(arrayAirplanes);
		
		System.out.println("This is the updated list: ");
		System.out.println();
		for(int i = 0; i < DATA.length; i++){
			System.out.println(arrayAirplanes[i]);
			System.out.println();
		}
		System.out.println("Total number of planes: ");
		System.out.println(Airplane.getNumPlanes());
	}
	
	public static void sortList(Airplane[] x){
		for(int i=0; i<x.length; i++){
			String min = x[i].getArrivalTime();
			int minIndex = i;
			for(int j = i+1; j<x.length; j++){
				if(x[j].getArrivalTime().compareTo(min)<0){
					min = x[j].getArrivalTime();
					minIndex = j;
				}
			}
			
			Airplane temp = x[i];
			x[i] = x[minIndex];
			x[minIndex] = temp;
		}
		
	}
}
	

	

