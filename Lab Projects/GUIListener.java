package labprojects;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class GUIListener implements ActionListener { 

	JFrame jframe;

	public GUIListener(JFrame jf) {
		jframe = jf;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonName = e.getActionCommand();
		if (buttonName.equals("Open"))
	        JOptionPane.showMessageDialog(null, "Open");
		else if (buttonName.equals("Close"))
			JOptionPane.showMessageDialog(null,  "Close");
		else JOptionPane.showMessageDialog(null, "all the other buttons");
	}
	
}
