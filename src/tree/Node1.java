package tree;

public class Node1 {
    Node n;
	public Node1(Node n) {
		this.n=n;
	}
	public void inorder() {
		inorder(n);
	}
public void inorder(Node currentn) {
	if(currentn != null) {
		inorder(currentn.left);
		System.out.print(" "+currentn.data);
		inorder(currentn.right);
	}
}
public void preorder() {
	preorder(n);
}
public void preorder(Node currentn) {
	if(currentn!=null) {
		preorder(currentn.right);
		System.out.print(" "+currentn.data);
		preorder(currentn.left);
	}
}
}
