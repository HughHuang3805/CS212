package labprojects;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Lab7 {

	static int [] DATA = {9,3,17,2,8,12,6,4};

	public static void main(String[] args) {

		// Three simple design of JFrame
		//createSimpleGUI();
		createGridLayoutGUI();
		//createBorderLayoutGUI();
		//createScrollGUI();

		//displayResult();

	}

	public static void createSimpleGUI() {

		JFrame myFrame = new JFrame();
		myFrame.setTitle("Simple GUI JFrame");
		myFrame.setSize(250, 250);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Label");
		Container pane = myFrame.getContentPane();
		pane.add(label);
		myFrame.setVisible(true);

		// JLabel are not clickable, and non-editable
	}

	public static void createGridLayoutGUI() {
		JFrame myFrame = new JFrame();
		myFrame.setTitle("GUI using GridLayout");
		myFrame.setSize(400, 400);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		int row = 3;
		int col = 3;
		myFrame.setLayout( new GridLayout(row, col) );			// set GridLayout of row = 1, col 3
		Container pane = myFrame.getContentPane();

		Color [] colors = {Color.RED, Color.GREEN};
		int size = row * col;

		//Create an array of textArea
		JTextArea [] textAreas = new JTextArea[size];
		for (int i = 0; i < size; ++i) {
			textAreas[i] = new JTextArea("TextArea ");
			textAreas[i].setEditable(false);			// set it non-editable
			textAreas[i].append(i + "");			
			textAreas[i].setBackground(colors[i % 2]);
			pane.add(textAreas[i]);
		}
		myFrame.setVisible(true);
	}

	public static void createBorderLayoutGUI() {
		JFrame myFrame = new JFrame();
		myFrame.setTitle("GUI using GridLayout");
		myFrame.setSize(400, 400);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout( new BorderLayout() );

		Container pane = myFrame.getContentPane();

		//TextArea are editable, can type text into it.
		JTextArea eastArea = new JTextArea("EAST");
		eastArea.setBorder(BorderFactory.createEtchedBorder());
		pane.add(eastArea, BorderLayout.EAST);

		JTextArea westArea = new JTextArea("WEST");
		westArea.setBorder(BorderFactory.createEtchedBorder());
		pane.add(westArea, BorderLayout.WEST);

		JTextArea northArea = new JTextArea("NORTH");
		northArea.setBorder(BorderFactory.createEtchedBorder());
		pane.add(northArea, BorderLayout.NORTH);

		JTextArea southArea = new JTextArea("SOUTH");
		southArea.setBorder(BorderFactory.createEtchedBorder());
		pane.add(southArea, BorderLayout.SOUTH);

		JTextArea centerArea = new JTextArea("CENTER");
		centerArea.setBorder(BorderFactory.createEtchedBorder());
		pane.add(centerArea, BorderLayout.CENTER);

		myFrame.setVisible(true);
	}

	public static void createScrollGUI() {
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Integers");
		myFrame.setSize(200, 200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout( new GridLayout(1, 2) );

		JTextArea leftTextArea = new JTextArea("LEFT");
		JScrollPane leftScrollPane = new JScrollPane(leftTextArea);

		JTextArea rightTextArea = new JTextArea("RIGHT");
		JScrollPane rightScrollPane = new JScrollPane(rightTextArea);

		Container pane = myFrame.getContentPane();
		pane.add(leftScrollPane);
		pane.add(rightScrollPane);
		myFrame.setVisible(true);

	}

	public static void displayResult() {
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Integers");
		myFrame.setSize(400, 400);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout( new GridLayout(1, 2) );

		JTextArea original = new JTextArea("Original: \n");
		original.setEditable(false);
		original.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		original.setBackground(Color.ORANGE);
		for (int i = 0; i < DATA.length; ++i) {
			original.append(String.valueOf(DATA[i] + "\n"));
		}

		selectionSort(DATA);

		JTextArea sorted = new JTextArea("Sorted: \n");
		sorted.setEditable(false);
		sorted.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		sorted.setBackground(Color.GREEN);
		for (int i = 0; i < DATA.length; ++i) {
			sorted.append(String.valueOf(DATA[i] + "\n"));
		}

		Container pane = myFrame.getContentPane();

		pane.add(original);
		pane.add(sorted);
		myFrame.setVisible(true);

	}

	public static void selectionSort(int [] x){
		for (int i = 0; i<x.length; i++){
			int min = x[i];
			int minIndex = i;
			for (int j=i+1; j<x.length; j++){
				if (x[j]<min){
					min = x[j];
					minIndex = j;
				} //if
			} //for j
			System.out.println ("Iteration : " + i); 
			System.out.println (x[i] + " swapped with " + x[minIndex]);
			int temp = x[i];
			x[i] = min;
			x[minIndex] = temp;


			System.out.println("Updated array: ");
			for (int k = 0; k<x.length; k++){
				System.out.print(x[k] + " ");
			}
			System.out.println();
			System.out.println();
			System.out.println();
		} //for i

	} // selectionSort
}


