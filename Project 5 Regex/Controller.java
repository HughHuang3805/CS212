package Project5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Controller implements ActionListener{

	static GUI gui;
	static HashMap<String, Integer> map = new HashMap<String, Integer>();

	public Controller(GUI g){
		gui = g;
		gui.setButtonListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		String buttonName = e.getActionCommand();
		if(buttonName.equals("Open")){
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
			FileNameExtensionFilter filter1 = new FileNameExtensionFilter("text file","txt");
			fileChooser.setFileFilter(filter1);
			int result = fileChooser.showOpenDialog(gui);
			if(result == JFileChooser.APPROVE_OPTION){
				File selectedFile = fileChooser.getSelectedFile();
				//parse in the data
				parseData(selectedFile);
			}
		}
		if(buttonName.equals("Exit")){
			System.exit(0);
		}
		if(buttonName.equals("Words")){
			gui.clearGUI();
			sortList();
		}
	}

	public static void parseData(File x){
		try {
			BufferedReader reader = new BufferedReader(new FileReader(x));
			//regex1: check for words with ".,?" at the end, regex2:check for words with special characters in the middle
			String regex1 = "(\\w+)[.,?]", regex2 = "(\\w+)[?-].*";
			String line;
			while(true){
				line = reader.readLine();
				if(line == null) break;
				String[] lineArray = line.split("\\s+");
				for(String testWord: lineArray){
					int number;
					//look for words that end with ".,?" and words that contain "?"
					testWord = testWord.toLowerCase();
					if(testWord.matches(regex2)){
						System.out.println("error entry: " + testWord);
						//replace words that has special characters with empty string
						continue;
					}
					if(testWord.matches(regex1)){
						testWord = testWord.replaceAll("[^a-zA-Z ]", "");
					}
					if(!map.containsKey(testWord)){
						number = 1;
					} else{
						number = map.get(testWord) + 1;
					}
					map.put(testWord, number);				
				}
			}
			gui.displayResult(map);
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void sortList(){
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
		gui.displayResult(treeMap);
	}
	
}
