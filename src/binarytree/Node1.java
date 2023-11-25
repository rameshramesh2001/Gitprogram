package binarytree;

public class Node1 {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		System.out.println("Original tree: ");
		Node2.InOrderTraversal(root);
		System.out.println();
		//Node mirrorroot=mirror(root);
		 System.out.println("Mirror tree (inorder traversal):");
	        Node2.InOrderTraversal(root);
		

	}
}