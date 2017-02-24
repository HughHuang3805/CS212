package project3;



public class Node {

	private Airplane data;
	private Node next;
	
	public Node() {
		this(null, null);
	}
	
	public Node(Airplane a) {
		this(a, null);
	}
	
	public Node(Airplane a, Node n) {
		data = a;
		next = n;
	}
	
	public void setNext(Node n) {		next = n;			}
	public Node getNext() 		{		return next;		}	
	public Airplane getData()	{		return data;		}
	
}
