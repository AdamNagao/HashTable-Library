package project2;

public class Node {
	Node next = null;
	int data;
	
	public Node(int d){
		data = d;
	}
	public Node(Node nd){
		next = nd;
	}
	public Node getNext(){
		return this.next;
	}
	public void setNext(Node nd){
		this.next = nd;
	}
}
