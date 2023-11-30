package binaryexample;

//import tree.Node;

public class Example2 {
Example1 n;
public Example2(Example1 n) {
	this.n=n;
}
public void inorder() {
	inorder(n);
}
public void inorder(Example1 currentn) {
	if(currentn != null) {
		//System.out.println("inorder");
		inorder(currentn.left);
		System.out.print(" "+currentn.data);
		inorder(currentn.right);
	}
}
public void preorder() {
	preorder(n);
}
public void preorder(Example1 currentn) {
	if(currentn!=null) {
		//System.out.println("preorder: ");
		System.out.print(" "+currentn.data);
		preorder(currentn.left);
		preorder(currentn.right);
	}
}
public void postorder() {
	postorder(n);
}
public void postorder(Example1 currentn) {
	if(currentn!=null) {
		//System.out.println("Post order: ");
		postorder(currentn.left);
		postorder(currentn.right);
		System.out.print(" "+currentn.data);
	}
}
}
