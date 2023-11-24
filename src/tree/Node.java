package tree;

public class Node {
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		//this.left=left;
		//this.right=right;
	}

	public static void main(String[] args) {
		Node n = new Node(8);
		n.left=new Node(6);
		n.left.left=new Node(9);
		n.left.left.left=new Node(21);
		n.left.right=new Node(2);
		n.left.right.left=new Node(3);
		n.left.right.right=new Node(16);
		n.right=new Node(5);
		n.right.left=new Node(7);
		n.right.left.left=new Node(12);
		n.right.left.right=new Node(13);
		n.right.right=new Node(1);
	
		Node1 root = new Node1(n);
		root.inorder();
		System.out.println("-------------------------");
		root.preorder();
		//System.out.println();
		//System.out.println();

	}

}
