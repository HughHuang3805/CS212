
public class LinkedList {
	
	private Node first;
	private Node last;
	private static int length = 0;
	
	public LinkedList(){
		first = null;
		length++;
	}
	
	public LinkedList(Airplane2 x){
		first = new Node(x);
		length++;
	}
	
	public void append(Airplane2 airplaneObject){
		Node current = first;
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(new Node(airplaneObject));
		last = current.getNext();
		
		/*Node current = new Node(airplaneObject); 
		if(last == null)
			last = first; 
		else{
			first.setNext(current);
			last = first.getNext();
			first = last;
		}*/

		length++;
	}
	
	public void prepend(Airplane2 airplaneObject){
		Node current = new Node(airplaneObject);
		current.setNext(first);
		first = current;
		while(current!=null){
			if(current.getNext() == null){
				last = current;
			}
			current = current.getNext();
		}
		
		/*Node current = new Node(airplaneObject); 
		if(first == null)
			first = current; 
			
		current.setNext(first);
		first = current; */
		
		length++;
	}
	
	public void insert(Airplane2 airplaneObject){
		if(first == null){
			first = new Node(airplaneObject);
		}
		if(airplaneObject.compareTo(first.getData())<0){
			first = new Node(airplaneObject, first);
		}
		else{
			Node current = first;
			Node previous = first;
			while(current != null){
				if(current.getData().compareTo(airplaneObject)>0){
					previous.setNext(new Node(airplaneObject, current));
					break;
				}
				else{
					previous = current;
					current = current.getNext();
				}
			}
			if(current == null){
				previous.setNext(new Node(airplaneObject));
			}
			while(current != null){
				if(current.getNext() == null){
					last = current;
				}
				current = current.getNext();
			}
		}
		length++;
	}
	public String printOut(){//can change to a toString method
		Node current = first;
		String str = "";
		while(current!=null){
//			System.out.print(current.getData());
			str += current.getData(); 
			str += "\n";
			current = current.getNext();
		}
//		System.out.println();
		
		return str;
	}
	
	public String toString(){
		String result = "";
		//String tempResult = "";
		//String make, model, airline, flightNumber, departure, arrival, departureTime, arrivalTime, departureCity, arrivalCity;
		Node current = first;
		while(current != last){
			/*airline = current.getData().getAirline() + " ";
			model = current.getData().getModel() + " ";
			make = current.getData().getMake() + " ";
			departureCity = current.getData().getDepartureCity() + " ";
			departureTime = current.getData().getDepartureTime() + " ";
			flightNumber = current.getData().getFlightNumber() + " ";
			departure = current.getData().getDeparture() + " ";
			arrival = current.getData().getArrival() + " ";
			arrivalTime = current.getData().getArrivalTime() + " ";
			arrivalCity = current.getData().getArrivalCity() + " ";*/
			result += current.toString();
					//airline + flightNumber + model + make + departureTime + departureCity + departure + arrival + arrivalTime + arrivalCity + "\n";
			//result += tempResult;
			current = current.getNext();
		}
		return result;
	}
	
	public void setFirst(Node x){
		first = x;
	}
	
	public void setLast(Node x){
		last = x;
	}
	
}