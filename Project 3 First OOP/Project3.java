package project3;

/**
 * CS212 Spring 2015 Project 3 Solution
 * 
 * @author Jean Lai
 *
 */

public class Project3 {

	public static void main(String[] args) {
		AirplaneGUI gui = new AirplaneGUI();
		new AirplaneController(gui);
		gui.setVisible(true);
	}

}
