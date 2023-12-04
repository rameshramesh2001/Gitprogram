package home_pratice_programs;

public class DoublyLL {
	//class Node {
	    int data;
	    DoublyLL prev;
	    DoublyLL next;

	    public DoublyLL(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }

	
	    public static void main(String[] args) {
	    	DoublyLL1 dll = new DoublyLL1();

	        dll.append(1);
	        dll.append(2);
	        dll.append(3);

	        dll.display(); // Output: 1 2 3

	        dll.prepend(0);

	        dll.display(); // Output: 0 1 2 3
	    }
	}
