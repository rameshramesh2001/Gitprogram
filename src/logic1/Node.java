package logic1;

//public class Sample {
	public class Node {
	    int data;
	    Node prev, next;

	    public Node(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }
	    public static void main(String[] args) {
	        Sample1 list = new Sample1();
	        list.insert(10);
	        list.insert(20);
	        list.insert(20);
	        list.insert(25);

	       
	        /*int[] elements = {5, 2, 8, 1, 6};
	        for (int element : elements) {
	            list.insert(element);
	        }*/

	       
	        System.out.println("Sorted Doubly Linked List:");
	        list.display();
	    }
	}
