package project3;


public class Airplane implements Comparable<Airplane>{

	private String make;
	private String airline;
	private String flightNum;
	private String model;
	private String src;
	private String dest;
	private String departureTime;
	private String arrivalTime;
	private String status;
	private final static int DATE = 0;
	private final static int TIME = 1;
	
	private static int numPlanes = 0;
	
	public Airplane() {
		this("", "");
	}
	
	public Airplane(String make, String aircraft) {
		this.make = make;
		this.model = aircraft;
		this.status = "";
		numPlanes++;
	}
	
	public Airplane(String make, String aircraft, String company, String flight) {
		this(make, aircraft);
		airline = company;
		flightNum = flight;
	}
	
	public String getAirline()					{	return airline;			}
	public String getFlightNum()				{	return flightNum;		}
	public String getMake()						{	return make;			}
	public String getModel()					{	return model;			}
	public String getSrc()						{	return src;				}
	public String getDest()						{	return dest;			}
	public String getDepartureTime()			{	return departureTime;	}
	public String getArrivalTime()				{	return arrivalTime;		}
	public String getStatus()					{	return status;			}
	public static int getNumPlanes()			{	return numPlanes;		}

	public void setAirline(String a)			{	airline = a;			}
	
	public void setFlightNum(String flight)		{	flightNum = flight;		}
	
	public void setStatus(String update)		{	status = update;		}
	
	public void setDeparture(String from, String dTime) {
		src = from;
		departureTime = dTime;
	}
	
	public void setArrival(String to, String aTime) {
		dest = to;
		arrivalTime = aTime;
	}
	
	public void setDetails(String from, String to, String dTime, String aTime) {
		setDeparture(from, dTime);
		setArrival(to, aTime);
	}
	
	@Override
	/**
	 * Sort first by arrival Date/Time, then sort by airline
	 */
	public int compareTo(Airplane arg) {
		
		String dateTime[] = arrivalTime.split("\\s+");
		String argDateTime[] = arg.getArrivalTime().split("\\s+");

		if (dateTime[DATE].compareTo(argDateTime[DATE]) < 0)
			return -1;
		if (dateTime[DATE].compareTo(argDateTime[DATE]) > 0)
			return 1;
		int time = Integer.parseInt(dateTime[TIME]);
		int argTime = Integer.parseInt(argDateTime[TIME]);
		if (time == argTime) 
			return airline.compareTo(arg.getAirline());
		return time - argTime;
	}
	
	public boolean equals(Object other) {
		return true;
	}
	
	public String extractAirport(String city) {
		int start = city.indexOf('(');
		String airport = city.substring(start + 1, start + 4);
		return airport;
	}

	public String convertTime(String time) {
		String timeArray[] = time.split("\\s+");
		String hour = timeArray[TIME].substring(0, 2);
		String min = timeArray[TIME].substring(2);
		String ampm;
		if (Integer.parseInt(hour) / 12 == 0)
			ampm = "AM";
		else {
			ampm = "PM";
			hour = "" + Integer.parseInt(hour) % 12;
		}
		String result = timeArray[DATE] + " " + hour + ":" + min + " " + ampm;
		return result;		
	}
	
	public String toString() {
		String srcAirport = extractAirport(src);
		String destAirport = extractAirport(dest);
	
		String dTime = convertTime(departureTime);
		String aTime = convertTime(arrivalTime);
		
		String flightInfo = airline +  " " + flightNum + ", "
						+ srcAirport + " " + dTime + ", " + destAirport + " " + aTime + "\n";
		return flightInfo;
	}

}
