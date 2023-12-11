package logic;
//class SortDouble{
	   
	public class SortedDoublyLinkedList {
	    int data;
	    SortedDoublyLinkedList prev, next;

	    public SortedDoublyLinkedList(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }

	    public static void main(String[] args) {
	        SortedDoublyLinkedList1 list = new SortedDoublyLinkedList1();

	        
	        int[] elements = {5, 2, 8, 1, 6};
	        for (int element : elements) {
	            list.insert(element);
	        }

	       
	        System.out.println("Sorted Doubly Linked List:");
	        list.display();
	    }
	}

