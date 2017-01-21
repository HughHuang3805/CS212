import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class AirplaneController implements ActionListener{

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
	
	JFrame jframe;
	private String result = "";
	
	public AirplaneController(){
		
	}

	Airplane2 airplaneObjectArray[] = new Airplane2[DATA.length];
	{
	for(int i = 0; i < DATA.length; i++){
		airplaneObjectArray[i] = new Airplane2(DATA[i][2], DATA[i][3], DATA[i][0], DATA[i][1], DATA[i][4], DATA[i][5], DATA[i][6], DATA[i][7], "");
	}}
	
	public AirplaneController(JFrame jf) {
		jframe = jf;
	}

	public String getAppend(){
		LinkedList myLinkedList = new LinkedList(airplaneObjectArray[0]);
		for(int i = 1; i < airplaneObjectArray.length; i++){
			myLinkedList.append(airplaneObjectArray[i]);
		}
		
		return myLinkedList.printOut();
	}
	
	public String getPrepend(){
		LinkedList myLinkedList = new LinkedList(airplaneObjectArray[0]);
		for(int i = 1; i < airplaneObjectArray.length; i++){
			myLinkedList.prepend(airplaneObjectArray[i]);
		}
		
		return myLinkedList.printOut();
	}
	
	public String getNormal(){
		LinkedList myLinkedList = new LinkedList(airplaneObjectArray[0]);
		for(int i = 1; i < airplaneObjectArray.length; i++){
			myLinkedList.insert(airplaneObjectArray[i]);
		}
		
		return myLinkedList.printOut();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		LinkedList myLinkedList = new LinkedList(airplaneObjectArray[0]);
		JTextArea myTextArea = new JTextArea();
		String buttonName = e.getActionCommand();
		if (buttonName.equals("Append")){

			for(int i = 1; i < airplaneObjectArray.length; i++){
				myLinkedList.append(airplaneObjectArray[i]);
				//result = result + airplaneObjectArray[i].toString() + "\n";
			}
			result = myLinkedList.toString();
			//myLinkedList.printOut();
		}
	        
		else if (buttonName.equals("Prepend")){
			for(int i = 1; i < airplaneObjectArray.length; i++){
				myLinkedList.prepend(airplaneObjectArray[i]);
			}
			result = myLinkedList.toString();
			//myLinkedList.printOut();
		}
			
		else{
			for(int i = 1; i < airplaneObjectArray.length; i++){
				myLinkedList.insert(airplaneObjectArray[i]);
			}
			result = myLinkedList.toString();
			//myLinkedList.printOut();
		}
		
		
	}
	
	public String getResult(){
		return result;
	}
}
