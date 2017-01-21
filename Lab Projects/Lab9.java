package labprojects;

import java.awt.Container;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Lab9 {
	final static String [][]DATA = {{ "27", "Brown", "Charlie", "0.671"},
									{"17", "Brown", "Sally", "0.431"},
									{"10", "Reichardt", "Patricia", "0.123"},
									{"111", "Van Pelt", "Linus", "0.111"}};
	
	public static void main(String[] args){
		BaseballPlayerGUI playerGUI = new BaseballPlayerGUI();
		playerGUI.setVisible(true);
		BaseballPlayer[] baseballPlayers = new BaseballPlayer[DATA.length];
		
		for(int i = 0; i < DATA.length; i++){
			int number = Integer.parseInt(DATA[i][0]);
			String lastName = DATA[i][1];
			String firstName = DATA[i][2];
			double battingAverage = Double.parseDouble(DATA[i][3]);
			baseballPlayers[i] = new BaseballPlayer(number, lastName, firstName, (float) battingAverage);
		}
		JTextArea playerInfo = new JTextArea("Player Information: " + "\n");
		for(int i = 0; i < DATA.length; i++){
			playerInfo.append(baseballPlayers[i].toString() + "\n");
		}
		JScrollPane playerScrollPane = new JScrollPane(playerInfo);
		playerGUI.add(playerScrollPane);
		playerInfo.setEditable(false);
		playerGUI.setVisible(true);		
	}
	
}
;