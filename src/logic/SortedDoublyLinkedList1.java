package logic;

public class SortedDoublyLinkedList1 {
	    Node head, tail;

	    public SortedDoublyLinkedList1() {
	        this.head = null;
	        this.tail = null;
	    }

	    public void insert(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	           
	            head = tail = newNode;
	        } else if (data <= head.data) {
	           
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        } else if (data >= tail.data) {
	            // If the new node should be the new tail
	            newNode.prev = tail;
	            tail.next = newNode;
	            tail = newNode;
	        } else {
	            // Insert the new node in the middle of the list
	            Node current = head;

	            while (current.next != null && current.next.data < data) {
	                current = current.next;
	            }

	            newNode.next = current.next;
	            newNode.prev = current;
	            current.next.prev = newNode;
	            current.next = newNode;
	        }
	    }
	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
}
