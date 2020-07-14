class Insert
{
    static Node insertInSorted(Node head, int data)
    {
        // your code here
        //boundary conditions
        Node temp = new Node(data);
        if(head == null)
        {
            return temp;
        }
        
        if(head.data>data)
        {
            temp.next = head;
            return temp;
        }
        
        Node curr = head;
        
        while(curr.next!=null&&data>curr.next.data)
        {
            curr = curr.next;
        }
        
        //insert
        temp.next = curr.next;
        curr.next = temp;
        
        return head;
    }
}
