package project3;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AirplaneController implements ActionListener{

	// Input data - Airline, Flight Number, Make, Model, Departure City, Arrival City, Departure Time, Arrival Time
	final static String [][] DATA = { 
		{"Air Berlin", "4504", "Boeing", "767-300", "Zurich (ZRH)", "New York, NY (JFK)", "2-26 1000", "2-26 1325"}, 
		{"Qatar Airways", "212", "Boeing", "767-300", "Milano (MXP)", "New York, NY (JFK)", "2-26 1000", "2-26 1330"},
		{"Jetblue Airways", "298", "Airbus", "A320", "Tampa, FL (TPA)", "New York, NY (JFK)", "2-26 0728", "2-26 0959"}, 					
		{"Air Canada", "6851", "Airbus", "A340-300", "Dakar (DKR)", "New York, NY (JFK)", "2-26 0255", "2-26 0650"}, 
		{"Alaska Airlines", "1219", "Boeing", "737-800", "Boston, MA (BOS)", "New York, NY (JFK)","2-26 0940", "2-26 1055"},
		{"Delta Airlines", "6182", "Canadadair", "CRJ", "Toronto (YYZ)", "New York, NY (JFK)", "2-26 0606", "2-26 0800"}, 
		{"American Airline", "199", "Boeing", "767-300", "Milano (MXP)", "New York, NY (JFK)", "2-26 1010", "2-26 1330"},
		{"United Airlines", "9855", "", "", "Cairo (CAI)", "New York, NY (JFK)", "2-26 1025", "2-26 0325"}, 
		{"Virgin America", "483", "Airbus", "A320", "San Francisco (SFO)", "New York, NY (JFK)", "2-25 2320", "2-26 0750"}, 
		{"Air France", "3650", "Boeing", "767-400", "Barcelona (BCN)", "New York, NY (JFK)", "2-26 1055", "2-26 0158"},
		{"Air China", "7266", "Boeing", "757-200", "Los Angeles, CA (LAX)", "New York, NY (JFK)","2-25 2159", "2-26 0616"}
	};
	
	final static int AIRLINE = 0;
	final static int FLIGHT_NUM = 1;
	final static int MAKE = 2;
	final static int MODEL = 3;
	final static int DEPARTURE_CITY = 4;
	final static int ARRIVAL_CITY = 5;
	final static int DEPARTURE_TIME = 6;
	final static int ARRIVAL_TIME = 7;
	
	final int APPEND = 0;
	final int PREPEND = 1;
	final int INSERT = 2;
	final String[] LIST = {"APPEND", "PREPEND", "INSERT"};
	
	AirplaneGUI gui;
	
	public AirplaneController(AirplaneGUI g) {
		gui = g;
		gui.setButtonListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonName = e.getActionCommand();
		if (buttonName.equals(LIST[APPEND])) {
			createList(APPEND);
			
		} else if (buttonName.equals(LIST[PREPEND])) {
			createList(PREPEND);
			
		} else if (buttonName.equals(LIST[INSERT])) {
			createList(INSERT);
		}
		
	}
	
	public void createList(int selection) {
		
		int numPlanes = DATA.length;
		LinkedList list = new LinkedList();
		
		for (int i = 0; i < numPlanes; i++) {
			String airline = DATA[i][AIRLINE];
			String flightNum = DATA[i][FLIGHT_NUM];
			String make = DATA[i][MAKE];
			String model = DATA[i][MODEL];
			String src = DATA[i][DEPARTURE_CITY];
			String dest = DATA[i][ARRIVAL_CITY];
			String departTime = DATA[i][DEPARTURE_TIME];
			String arrivalTime = DATA[i][ARRIVAL_TIME];
			
			Airplane plane = new Airplane(make, model, airline, flightNum);
			plane.setDetails(src,  dest, departTime, arrivalTime);
			switch (selection) 
			{
			case APPEND:
				list.append(plane);
				break;
			case PREPEND:
				list.prepend(plane);
				break;
			default:
				list.insert(plane);
			}
		}
		
		gui.displayList(selection, list.toString());
			
		
	}

}
