package labprojects;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class PlaneDriver {
	final static int[] DATA = {3,4,9,1,2,7,10};
	
	public static void main(String[] args){
		JFrame myFrame = new JFrame();
		myFrame.setTitle("JFrame");
		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setBackground(Color.ORANGE);
		
		myFrame.setLayout(new GridLayout(1, 3));
		
		JTextArea textArea = new JTextArea();
		textArea.setText("This is a textArea");
		textArea.append("this is an add-on");
		textArea.setEditable(false);
		
		JTextArea textArea2 = new JTextArea("TextArea 2");
		textArea2.setBackground(Color.ORANGE);
		JTextArea textArea3 = new JTextArea("TextArea 3");
		JTextArea textArea4 = new JTextArea("TextArea 4");
		
		JLabel label = new JLabel("JLabel");
		label.setText(label.getText() + "Updated label");
		label.setText("Update label");
		
		//myFrame.getContentPane().add(label);
		Container pane = myFrame.getContentPane(); // contentpane is the space in between
		
		pane.add(textArea, BorderLayout.EAST);		
		pane.add(label, BorderLayout.WEST);
		pane.add(textArea2, BorderLayout.NORTH);
		pane.add(textArea3, BorderLayout.SOUTH);
		pane.add(textArea4, BorderLayout.CENTER);
		
		
		//myFrame.pack();
		myFrame.setVisible(true);
	}
}
