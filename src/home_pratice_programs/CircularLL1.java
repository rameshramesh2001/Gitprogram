package home_pratice_programs;

public class CircularLL1 {
	//class CircularLinkedList {
	CircularLL head;

	    public void append(int data) {
	    	CircularLL newNode = new CircularLL(data);

	        if (head == null) {
	            head = newNode;
	            head.next = head; // Circular link to itself
	        } else {
	        	CircularLL current = head;
	            while (current.next != head) {
	                current = current.next;
	            }
	            current.next = newNode;
	            newNode.next = head; // Circular link
	        }
	    }

	    public void display() {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        CircularLL current = head;
	        do {
	            System.out.print(current.data + " ");
	            current = current.next;
	        } while (current != head);
	        System.out.println();
	    }
	}
