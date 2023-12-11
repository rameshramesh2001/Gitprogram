package logic1;

public class Sample1 {
	     Node head, tail;

	    public Sample1() {
	        this.head = null;
	        this.tail = null;
	    }

	   
	    public void insert(int data) 
	    {
	        Node newNode = new Node(data);

	        if (head == null)
	        {
	           
	            head = tail = newNode;
	        }
	        else if (data <= head.data)
	        {
	           
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        } 
	        else if (data >= tail.data) 
	        {
	           
	            newNode.prev = tail;
	            tail.next = newNode;
	            tail = newNode;
	        } 
	        else 
	        {
	            
	            Node current = head;

	            while (current.next != null && current.next.data < data)
	            {
	                current = current.next;
	            }

	            newNode.next = current.next;
	            newNode.prev = current;
	            current.next.prev = newNode;
	            current.next = newNode;
	        }
	    }

	   
	    public void display()
	    {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

}
