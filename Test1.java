package LinkedList;


class Node
{
	int data;
	
	Node next; //self referential structures
	Node(int x)
	{
		data = x;
		next = null;
	}
	
}
public class Test1 {
	public static void main(String[] args) {
		
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
	}
	
	

}
