package logic;

public class BinarySearchTree {
	    Node root;

	    public BinarySearchTree() {
	        root = null;
	    }

	  
	    public void insert(int key) {
	        root = insertRec(root, key);
	    }

	    private Node insertRec(Node root, int key) {
	        if (root == null) {
	            root = new Node(key);
	            return root;
	        }

	        if (key < root.data) {
	            root.left = insertRec(root.left, key);
	        } else if (key > root.data) {
	            root.right = insertRec(root.right, key);
	        }

	        return root;
	    }

	    
	    public int findDistance(int node1, int node2) {
	        Node lca = findLCA(root, node1, node2);

	        int distNode1 = findDistanceFromRoot(lca, node1, 0);
	        int distNode2 = findDistanceFromRoot(lca, node2, 0);

	        return distNode1 + distNode2;
	    }

	    private Node findLCA(Node root, int node1, int node2) {
	        if (root == null) {
	            return null;
	        }

	        if (root.data > node1 && root.data > node2) {
	            return findLCA(root.left, node1, node2);
	        } else if (root.data < node1 && root.data < node2) {
	            return findLCA(root.right, node1, node2);
	        }

	        return root;
	    }

	    private int findDistanceFromRoot(Node root, int target, int dist) {
	        if (root == null) {
	            return -1;
	        }

	        if (root.data == target) {
	            return dist;
	        }

	        int leftDist = findDistanceFromRoot(root.left, target, dist + 1);
	        int rightDist = findDistanceFromRoot(root.right, target, dist + 1);

	        return (leftDist != -1) ? leftDist : rightDist;
	    }
}
