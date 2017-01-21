package labprojects;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class April16th {
	public static void main(String[] args){
		createMenuBar();
	}
	
	public static void createMenuBar(){
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		menu.add(openItem);
		menu.addSeparator();
		JMenuItem closeItem = new JMenuItem("close");
		menu.add(closeItem);
		menuBar.add(menu);
		
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
	}
}
