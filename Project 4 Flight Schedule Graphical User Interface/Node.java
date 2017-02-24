public class Node {
	Airplane2 airplaneObject;
	Node next;
	
	public Node(){
		airplaneObject = null;
		next = null;
	}
	
	public Node(Airplane2 airplaneObject){
		this.airplaneObject = airplaneObject;
	}
	
	public Node(Airplane2 airplaneObject, Node next){
		this.airplaneObject = airplaneObject;
		this.next = next;
	}
	
	public void setAirplaneObject(Airplane2 airplaneObject){
		this.airplaneObject = airplaneObject;
	}
	
	public void setNext(Node x){
		this.next = x;
	}
	
	public Node getNext(){
		return next;
	}
	
	public Airplane2 getData(){
		return airplaneObject;
	}
}
