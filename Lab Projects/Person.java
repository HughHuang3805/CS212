package labprojects;

public class Person {
	
	private String name;
	private char gender;
	private String DOB;
	private String SSN;
	private static int population=0;
	
	public static void addPeople(){population++;}
	
	public Person(){//default constructor
		name = "John Doe";
		addPeople();
	}
	
	public Person(String n, char g){
		name = n;
		gender = g;
		addPeople();
	}
	
	public Person(String n, String dob, char g){
		name = n;
		DOB = dob;
		gender = g;
		addPeople();
	}
	
	public Person(String n, String dob, char g, String ssn){
		name = n;
		gender = g;
		DOB = dob;
		SSN = ssn;
		addPeople();
	}
	
	public int compareTo(Person other) {
		if ( name.compareTo(other.getName()) == 0 ) 
			return SSN.compareTo(other.getSSN());
		return name.compareTo(other.getName()); 
	}
	
	public boolean equals(Object other) {
		if (other == null)			// making sure other is NOT null
			return false;
		
		if (!(other instanceof Person))
			return false;			// making sure other is a Person object
		
		Person otherPerson = (Person) other;
		return this.compareTo(otherPerson) == 0;
	}
	
	public String getName(){return name;}
	public char getGender(){return gender;}
	public String getDOB(){return DOB;}
	public String getSSN(){return SSN;}
	public static int getPeople(){return population;}
	
	public String toString(){// will be called automatically when called on object
		String result = "Name: " + name +  "\n" + "DOB: " + DOB + "\n" + "Gender: " + gender
				+ "SSN: " + SSN;
		return result;
	}
}
