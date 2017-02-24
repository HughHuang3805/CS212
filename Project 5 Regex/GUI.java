package Project5;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.util.Map;

public class GUI extends JFrame {

	JMenuItem[] menuItems = new JMenuItem[3];
	JTextArea textArea = new JTextArea();

	public GUI(){	
		setTitle("I Love Cupcakes");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMenuItems();
		setDisplayPanel();
		setVisible(true);
	}

	public void setDisplayPanel(){
		textArea.setBackground(Color.GREEN);
		textArea.setEditable(false);
		add(new JScrollPane(textArea));
	}

	public void setMenuItems(){
		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("File");
		JMenu menu2 = new JMenu("Sort");
		JMenuItem item1 = new JMenuItem("Open");
		JMenuItem item2 = new JMenuItem("Exit");
		JMenuItem item3 = new JMenuItem("Words");
		menuItems[0] = item1;
		menuItems[1] = item2;
		menuItems[2] = item3;
		menu1.add(item1);
		menu1.addSeparator();
		menu1.add(item2);
		menu2.add(item3);
		menuBar.add(menu1);
		menuBar.add(menu2);
		setJMenuBar(menuBar);
	}

	public void displayResult(Map<String, Integer> map){
		for(String key : map.keySet()){
			textArea.append(key + ": " + map.get(key) + "\n");
		}
	}

	public void clearGUI(){
		textArea.setText(null);
	}

	public void setButtonListener(ActionListener a){
		for(JMenuItem x : menuItems){
			x.addActionListener(a);
		}
	}

}
