package project3;



public class LinkedList {

	private Node first;
	private Node last;
	private int length;
	
	public LinkedList() {
		first = new Node();
		last = first;
		length = 0;
	}
	
	public void append(Airplane a) {
		Node node = new Node(a);
		last.setNext(node);
		last = node;
		++length;
	}
	
	public void prepend(Airplane a) {
		Node node = new Node(a, first.getNext());
		first.setNext(node);
		if (length == 0)
			last = node;
		++length;
	}
	
	public void insert(Airplane a) {
		Node current = first.getNext();
		Node previous = first;
		while (current != null) {
			Airplane data = current.getData();
			if (data.compareTo(a) > 0)
				break;
			previous = current;
			current = current.getNext();
		}
		Node node = new Node(a, current);
		previous.setNext(node);
		++length;
	}
	
	public String toString() {
		String result = "";
		Node current = first.getNext();
		while (current != null) {
			result += current.getData().toString() +"\n";
			current = current.getNext();
		}
		return result;
		
	}
}
