package labprojects;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Lab8 {

	public static void main(String[] args) {

		JFrame myFrame = new JFrame();
		myFrame.setTitle("Buttons");
		myFrame.setSize(400, 400);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout( new GridLayout(1, 3));

		Container pane = myFrame.getContentPane();

		GUIListener listener = new GUIListener(myFrame);

		JButton button1 = new JButton("Open");
		button1.addActionListener(listener);

		JButton button2 = new JButton("Close");
		button2.addActionListener(listener);

		JButton button3 = new JButton("Other");
		button3.addActionListener(listener);
		
		pane.add(button1);//need to add it in order to see 
		pane.add(button2);
		pane.add(button3);
		myFrame.setVisible(true);
		
	}

}
