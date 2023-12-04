package home_pratice_programs;

public class Binarytree {
	int data;
	Binarytree left,right;
	public Binarytree(int newdata) {
		this.data=newdata;
	}

	public static void main(String[] args) {
		Binarytree sa = new Binarytree(10);
		sa.left=new Binarytree(20);
		sa.right=new Binarytree(30);
		sa.left.left=new Binarytree(55);
		sa.left.right=new Binarytree(44);
		sa.right.left=new Binarytree(51);
		sa.right.right=new Binarytree(33);
		
		Binarytree1 n = new Binarytree1(sa);
		n.inorder();
		System.out.println(" ");
		n.preorder();
		System.out.println(" ");
		n.postorder();

	}

}
