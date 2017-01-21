package labprojects;

public class BaseballPlayer {
	private int playerNumber;
	private String lastName;
	private String firstName;
	private float battingAverage;
	private static int numPlayers = 0;
	
	public BaseballPlayer(int playerNumber, String lastName, String firstName, float battingAverage){
		if(playerNumber < 0)
			throw new IllegalArgumentException("Player number is not valid");
		this.playerNumber = playerNumber;
		if(battingAverage > 1 || battingAverage < 0)
			throw new IllegalArgumentException("Batting average is not valid");
		this.battingAverage = battingAverage;
		this.lastName = lastName;
		this.firstName = firstName;		
		numPlayers++;
	}
	
	public static void printNumPlayers(){
		System.out.println("The total number of players at this point is: " + numPlayers);
	}
	
	public String toString(){
		String string = lastName + ", " + firstName + " " + playerNumber + " " + "(" + battingAverage + ")";
		return string;
	}
}
