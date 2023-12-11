package logic;
	class Node {
	    int data;
	    Node left, right;
	    public Node(int item) {
	        data = item;
	        left = right = null;
	    }

	    public static void main(String[] args) {
	    	Node pa = new Node(5);
	    	pa.left=new Node(3);
			pa.right=new Node(6);
			pa.left.left=new Node(1);
			pa.left.right=new Node(2);
			pa.right.left=new Node(8);
			pa.right.right=new Node(10);
	        BinarySearchTree tree = new BinarySearchTree();

	        
	        /*int[] keys = {5,3,6,1,2,8,10};
	        for (int key : keys) {
	            tree.insert(key);
	        }*/

	       
	        int node1 = 3;
	        int node2 = 10;
	        int distance = tree.findDistance(node1, node2);

	        System.out.println("Distance between Node " + node1 + " and Node " + node2 + ": " + distance);
	    }
	}
