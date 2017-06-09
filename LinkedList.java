package project2;

public class LinkedList {
	Node head = null;
	int size;
	
	public LinkedList(){
		head = new Node(null);
		size = 0;
	}
	
	public void insert(int data){
	
		Node temp = new Node(data);
		Node current = head;
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(temp);
		size++;
	}
	public int remove(){

		Node current = head;
		Node prev = null;
		while(current.getNext() != null){
			prev = current;
			current = current.getNext();
		}
		prev.next = current.getNext();
		return current.data;
	}
	
	
	public void printList(){

		Node current = head;
		while(current.getNext() != null){
			current = current.getNext();
			System.out.print(current.data + " ");
		}
	}

}
