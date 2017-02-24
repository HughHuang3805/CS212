//Xiaoquan Huang
//cs212 night

public class Airplane2 {
	private String make, model, airline, flightNumber, departure, arrival, departureTime, arrivalTime, status = "";
	private String departureCity, arrivalCity;
	private static int numPlanes = 0;
	
	public Airplane2(){
		make = "";
		model = "";
		addNumPlanes();
	}
	
	public Airplane2(String make, String model){
		this.make = make;
		this.model = model;
		addNumPlanes();
	}
	
	public Airplane2(String make, String model, String airline, String flightNumber){
		this.make = make;
		this.model = model;
		this.airline = airline;
		this.flightNumber = flightNumber;
		addNumPlanes();
	}
	
	public Airplane2(String make, String model, String airline, String flightNumber, String departure, String arrival, String departureTime, String arrivalTime, String status){
		this.make = make;
		this.model = model;
		this.airline = airline;
		this.flightNumber = flightNumber;
		this.departure = departure;
		this.arrival = arrival;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.status = status;
		addNumPlanes();
	}
	
	public String toString(){
		String result = airline + " " +  flightNumber + " " + make + " " + model + " " + departureTime + " " + departure + " " + arrivalTime + " " + arrival + " " + status + "\n";
		return result;
	}

	public int compareTo(Airplane2 other){
		if(arrivalTime.compareTo(other.getArrivalTime()) == 0){
			return arrivalTime.compareTo(other.getAirline());
		}
		return arrivalTime.compareTo(other.getArrivalTime());
	}
	
	public boolean equals(Object other) {
		if (this == other) return true;
		if (other != null && other instanceof Airplane ) {
			Airplane2 otherPlane = (Airplane2)other;
			int makeOrder = make.compareTo(otherPlane.getMake());
			int airlineOrder = airline.compareTo(otherPlane.getAirline());
			int flightNumOrder = flightNumber.compareTo(otherPlane.getFlightNumber());
			int modelOrder = model.compareTo(otherPlane.getModel());
			int departureCityOrder = departureCity.compareTo(otherPlane.getDepartureCity());
			int departureTimeOrder = departureTime.compareTo(otherPlane.getDepartureTime());
			int arrivalCityOrder = arrivalCity.compareTo(otherPlane.getArrivalCity());
			int arrivalTimeOrder = arrivalTime.compareTo(otherPlane.getArrivalTime());
			if (makeOrder == 0 && airlineOrder == 0 && flightNumOrder == 0 &&
					modelOrder == 0 && departureCityOrder == 0 && departureTimeOrder == 0 &&
					arrivalCityOrder == 0 && arrivalTimeOrder == 0)
				return true;
		}
		return false;

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
	
	public String getDepartureCity(){
		return departureCity;
	}

	public String getArrival() {
		return arrival;
	}
	
	public String getArrivalCity(){
		return arrivalCity;
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
	
	public void setDepartureCity(String departureCity){
		this.departureCity = departureCity;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public void setArrivalCity(String arrivalCity){
		this.arrivalCity = arrivalCity;
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
