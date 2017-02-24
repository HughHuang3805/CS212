//Xiaoquan Huang
//cs212 night

public class Airplane {
	private String make, model, airline, flightNumber, departure, arrival, departureTime, arrivalTime, status = "";
	public static int numPlanes = 0;
	
	public Airplane(){
		make = "";
		model = "";
		addNumPlanes();
	}
	
	public Airplane(String make, String model){
		this.make = make;
		this.model = model;
		addNumPlanes();
	}
	
	public Airplane(String make, String model, String airline, String flightNumber){
		this.make = make;
		this.model = model;
		this.airline = airline;
		this.flightNumber = flightNumber;
		addNumPlanes();
	}
	
	public String toString(){
		String result = airline + ", " + "Flight Number: " + flightNumber + "\n" +
						"Aircraft: " + make + " " + model + "\n" +
						"Departure: " + departureTime + " @ " + departure + "\n" +
						"Arrival: " + arrivalTime + " @ " + arrival + "\n" + 
						"Status: " + status;
		return result;
	}

	public int compareTo(Airplane other){
		if(arrivalTime.compareTo(other.getArrivalTime()) == 0){
			return arrivalTime.compareTo(other.getAirline());
		}
		return arrivalTime.compareTo(other.getArrivalTime());
	}
	
	public boolean equals(Object other){
		if(other == null) return false;
		if(!(other instanceof Airplane)) return false;
		Airplane otherAirplane = (Airplane) other;
		return this.compareTo(otherAirplane) == 0;
	}
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getAirline() {
		return airline;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getDeparture() {
		return departure;
	}

	public String getArrival() {
		return arrival;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public String getStatus() {
		return status;
	}

	public static int getNumPlanes() {
		return numPlanes;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static void setNumPlanes(int numPlanes) {
		Airplane.numPlanes = numPlanes;
	}
	
	public static void addNumPlanes(){ 
		numPlanes++;
	}
}
