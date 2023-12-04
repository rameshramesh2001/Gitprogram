package home_pratice_programs;

public class DoublyLL1 {
	
	DoublyLL head;

	    public void append(int data) {
	    	DoublyLL newNode = new DoublyLL(data);

	        if (head == null) {
	            head = newNode;
	        } else {
	        	DoublyLL current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	            newNode.prev = current;
	        }
	    }

	    public void prepend(int data) {
	    	DoublyLL newNode = new DoublyLL(data);

	        if (head == null) {
	            head = newNode;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }

	    public void display() {
	    	DoublyLL current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	}
