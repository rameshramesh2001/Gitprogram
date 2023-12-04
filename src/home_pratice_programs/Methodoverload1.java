package home_pratice_programs;

public class Methodoverload1 {
	//class BinaryTree {
	Methodoverload root;

	Methodoverload1() {
	        root = null;
	    }

	    // Method to insert a new node with an integer key
	    void insert(int key) {
	        root = insertRec(root, key);
	    }

	    // Method to insert a new node with a TreeNode key
	    void insert(Methodoverload newNode) {
	        root = insertRec(root, newNode);
	    }

	    private Methodoverload insertRec(Methodoverload root, Methodoverload newNode) {
	        if (root == null) {
	            root = new TreeNode(newNode);
	            return root;
	        }

	        if (newNode < root.data) {
	            root.left = insertRec(root.left, newNode);
	        } else if (newNode > root.data) {
	            root.right = insertRec(root.right, newNode);
	        }

	        return root;
	    }

	    private Methodoverload insertRec(Methodoverload root, Methodoverload newNode) {
	        if (root == null) {
	            return newNode;
	        }

	        if (newNode.data < root.data) {
	            root.left = insertRec(root.left, newNode);
	        } else if (newNode.data > root.data) {
	            root.right = insertRec(root.right, newNode);
	        }

	        return root;
	    }

	    // Method to perform in-order traversal
	    void inOrder() {
	        inOrderRec(root);
	    }

	    private void inOrderRec(Methodoverload root) {
	        if (root != null) {
	            inOrderRec(root.left);
	            System.out.print(root.data + " ");
	            inOrderRec(root.right);
	        }
	    }
}
