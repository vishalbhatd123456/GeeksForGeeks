package LinkedList;

class Node1
{
	int data;
	
	Node1 next;
	
	Node1(int data)
	{
		this.data = data;
		next = null; //optional
	}
	public  void printList(Node1 head)
	{
		Node1 curr = head;
		
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	
}
class Node2
{
	String USN;
	Node2 next;
	
	Node2(String USN)
	{
		this.USN = USN;
		next = null;
	}
	public void printList(Node2 head)
	{
		Node2 curr = head;
		
		while(curr!=null)
		{
			System.out.print(curr.USN+ " ");
			curr = curr.next;
		}
	}
}
public class Test2 {
	public static void main(String[] args) {
		Node1 head1 = new Node1(10);
		head1.next = new Node1(20);
		head1.next.next = new Node1(30);
		head1.next.next.next = new Node1(40);
		head1.printList(head1);
		System.out.println();
		
		Node2 head2 = new Node2("1BI17CSxx1");
		head2.next = new Node2("1BI17CSxx2");
		head2.next.next = new Node2("1BI17CSxx3");
		head2.printList(head2);
	}

	
	
	

}
