import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class AirplaneGUI extends JFrame {
	public AirplaneGUI(){
		setTitle("Flight Schedule");
		setSize(900,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout());
		
		//GridLayout[] gridLayout = new GridLayout[4];
		
		AirplaneController listener = new AirplaneController(this);
		
		/*First panel for button*/
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(3,1));
		
		JButton button1 = new JButton("Append");
		button1.setVisible(true);
		jp.add(button1); 

		JButton button2 = new JButton("Prepend");
		button2.setVisible(true);
		jp.add(button2); 
		
		JButton button3 = new JButton("Insert");
		button3.setVisible(true);
		jp.add(button3);
		add(jp);

		
		/** Second panel for Text area**/
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(1,3));
		
		//setLayout(new GridLayout(1,3));
		JTextArea textArea1 = new JTextArea("Append");
		JScrollPane myScrollPane1 = new JScrollPane(textArea1);
		textArea1.setEditable(false);
		textArea1.setVisible(true);
		jp2.add(myScrollPane1);
		
		JTextArea textArea2 = new JTextArea("Prepend");
		JScrollPane myScrollPane2 = new JScrollPane(textArea2);
		textArea2.setEditable(false);
		textArea2.setVisible(true);
		jp2.add(myScrollPane2);
		
		JTextArea textArea3 = new JTextArea("Insert");
		JScrollPane myScrollPane3 = new JScrollPane(textArea3);
		textArea3.setEditable(false);
		textArea3.setVisible(true);
		jp2.add(myScrollPane3);
		
		
		AirplaneController controller = new AirplaneController();
		Font f = textArea1.getFont();
		Font f4 = new Font(f.getFontName(), f.getStyle(), f.getSize()+4);
		 
		  
		/*Button Action listen*/
		button1.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	textArea1.setText(controller.getAppend()); 
		    	textArea1.setFont(f4);
		    }
		});
		
		button2.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	textArea2.setText(controller.getPrepend());   
		    	textArea2.setFont(f4);
		    }
		});
		
		button3.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	textArea3.setText(controller.getNormal());
		    	textArea3.setFont(f4);
		    }
		});
		
		add(jp2);
		setVisible(true);
	}
	
}
