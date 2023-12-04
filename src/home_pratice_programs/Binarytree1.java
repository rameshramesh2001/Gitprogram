package home_pratice_programs;

public class Binarytree1 {
Binarytree pa;
public Binarytree1(Binarytree newpa) {
	this.pa=newpa;
}
public void inorder() {
	inorder(pa);
}
public void inorder(Binarytree currentpa) {
	if(currentpa!=null) {
		inorder(currentpa.left);
		System.out.print(" "+currentpa.data);
		inorder(currentpa.right);
	}
}
public void preorder() {
	preorder(pa);
}
public void preorder(Binarytree currentpa) {
	if(currentpa!=null) {
		System.out.print(" "+currentpa.data);
		preorder(currentpa.left);
		preorder(currentpa.right);
	}
}
public void postorder() {
	postorder(pa);
}
public void postorder(Binarytree currentpa) {
	if(currentpa!=null) {
		postorder(currentpa.left);
		postorder(currentpa.right);
		System.out.print(" "+currentpa.data);
	}
}
}
