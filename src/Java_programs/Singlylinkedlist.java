package Java_programs;

public class Singlylinkedlist {
	//public class SinglyLinkedList {    
	    //Represent a node of the singly linked list    
	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;

	    public LinkedList() {
	        this.head = null;
	    }

	    // Method to add a new node to the end of the list
	    public void append(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node last = head;
	        while (last.next != null) {
	            last = last.next;
	        }

	        last.next = newNode;
	    }

	    // Method to print the elements of the list
	    public void display() {
	        Node current = head;

	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();

	        // Adding elements to the linked list
	        list.append(1);
	        list.append(2);
	        list.append(3);
	        list.append(4);

	        // Displaying the linked list
	        System.out.println("Linked List elements:");
	        list.display();
	    }
	}
}
