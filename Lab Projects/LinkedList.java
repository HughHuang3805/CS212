package labprojects;


public class LinkedList {

	Node head;
	
	public LinkedList(Person x) {
		head = new Node(x);
	}
	
	public LinkedList(Node x) {
		head = x;
	}
	
	public void append(Person x) {
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(new Node (x));
	}
	
	public void insert(Person x) {
		Node newNode = new Node(x);
		if (x.compareTo(head.getData() ) < 0) {			
			newNode.setNext(head);
			head = newNode;
		} else {
			Node current = head;
			Node previous = head;
			while (current != null) {
				if (x.compareTo(current.getData() ) < 0)
					break;
				previous = current;
				current = current.getNext();
			}
			previous.setNext(newNode);
			newNode.setNext(current);
		}
	
	}
	
	public String toString() {
		Node current = head;
		Person currentPerson = head.getData();
		String result = currentPerson.toString();
		
		while (current.getNext() != null) {
			current = current.getNext();
			currentPerson = current.getData();
			result += currentPerson.toString() + "\n";
		}
		return result;
	}
	
	public void delete(Person x){
		Node current = head;
		Node previous = head;
		while(current!=null){
			Person currentPerson = current.getData();
			if(currentPerson.equals(x)){
				previous.setNext(current.getNext());
				return;
			}
			previous = current;
			current = current.getNext();
		}
	}
	
	public boolean find(Person x){
		Node current = head;
		while(current!=null){
			Person currentPerson = current.getData();
			if(currentPerson.equals(x)){
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

									
}

