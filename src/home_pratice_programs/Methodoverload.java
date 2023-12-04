package home_pratice_programs;

public class Methodoverload {
	//class TreeNode {
	    int data;
	    Methodoverload left, right;

	    public Methodoverload(int newdata) {
	        this.data=newdata;
	    }

	    public static void main(String[] args) {
	    	Methodoverload tree = new Methodoverload(20);

	       
	        tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);

	       
	        System.out.println("In-order traversal of the binary tree:");
	        tree.inOrder();

	       
	        Methodoverload newNode1 = new Methodoverload(90);
	        Methodoverload newNode2 = new Methodoverload(25);

	        tree.insert(newNode1);
	        tree.insert(newNode2);

	        
	        System.out.println("\nIn-order traversal after additional insertions:");
	        tree.inOrder();
	    }


	//public static void main(String[] args) {
		

	}
