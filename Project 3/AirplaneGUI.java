package project3;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class AirplaneGUI extends JFrame {
	
	final int NUM_LISTS = 3;
	final int APPEND = 0;
	final int PREPEND = 1;
	final int INSERT = 2;
	final String[] LIST = {"APPEND", "PREPEND", "INSERT"};
	final Color[] colors = {Color.ORANGE, Color.GREEN, Color.RED};
	
	JTextArea[] textAreas;
	JButton[] buttons;

	public AirplaneGUI() {
		initialize();
	}
	
	
	public void initialize() {
		setTitle("Flight Schedule");
		setSize(500, 500);
		setLayout(new GridLayout(1, 4));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setupControlPanel();
		setupDisplayPanel();
	}
	
	public void setupControlPanel() {
		JPanel controlPanel = new JPanel();
		controlPanel.setSize(10, 10);
		controlPanel.setLayout(new GridLayout(3, 1));
		
		buttons = new JButton[NUM_LISTS];
		for (int i = 0; i < NUM_LISTS; ++i) {
			buttons[i] = new JButton(LIST[i]);
			buttons[i].setSize(5, 5);
			controlPanel.add(buttons[i]);
		}

		add(controlPanel);
	}
	
	public void setupDisplayPanel() {

		Border squareBorder = BorderFactory.createLineBorder(Color.BLACK, 0);
		textAreas = new JTextArea[NUM_LISTS];
		for (int i = 0; i < NUM_LISTS; ++i) {
			textAreas[i] = new JTextArea(LIST[i] + "\n");
			textAreas[i].setBorder(squareBorder);
			textAreas[i].setBackground(colors[i]);
			JScrollPane scrollPane = new JScrollPane(textAreas[i]);
			add(scrollPane);
		}

	}

	public void setButtonListener(ActionListener a) {
		for (int i = 0; i < NUM_LISTS; ++i) {
			buttons[i].addActionListener(a);
		}
	}
	
	public void displayList(int selection, String result) {
		textAreas[selection].append(result);
	}

}
