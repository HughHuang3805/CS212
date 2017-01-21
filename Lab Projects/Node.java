package labprojects;


public class Node {
	private Person data;
	private Node next;
	
	Node(Person x) {
		data = x;
	}
	
	Node(Person x, Node n) {
		data = x;
		next = n;
	}
	
	
	public Person getData()		{	return data;	}
	public Node getNext()		{	return next; 	}
	public void setNext(Node n)	{	next = n;		}		
	
}


