package labprojects;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class BaseballPlayerGUI extends JFrame {
	
	public BaseballPlayerGUI(){
		setTitle("Baseball Players");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout());
	}
}
