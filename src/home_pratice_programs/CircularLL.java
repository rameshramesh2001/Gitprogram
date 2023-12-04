package home_pratice_programs;

public class CircularLL {
	//class Node {
	    int data;
	    CircularLL next;

	    public CircularLL(int data) {
	        this.data = data;
	        this.next = null;
	    }

	
	    public static void main(String[] args) {
	    	CircularLL1 cll = new CircularLL1();

	        cll.append(1);
	        cll.append(2);
	        cll.append(3);

	        cll.display(); // Output: 1 2 3
	    }


	}
