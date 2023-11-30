package binaryexample;

public class Example1 {
	int data;
	Example1 left,right;
	public Example1(int newdata) {
		this.data=newdata;
	}

	public static void main(String[] args) {
		Example1 pa = new Example1(38);
		pa.left=new Example1(27);
		pa.right=new Example1(25);
		pa.left.left=new Example1(20);
		pa.left.right=new Example1(18);
		pa.left.left.left=new Example1(55);
		pa.left.left.right=new Example1(24);
		pa.left.right.left=new Example1(28);
		pa.right.left=new Example1(45);
		pa.right.right=new Example1(32);
		pa.right.left.left=new Example1(39);
		pa.right.left.right=new Example1(8);
		pa.right.left.right.right=new Example1(12);
		pa.right.left.right.right.left=new Example1(9);
		pa.right.right.left=new Example1(13);
		pa.right.right.right=new Example1(16);
		pa.right.right.right.left=new Example1(6);
		pa.right.right.right.right=new Example1(4);
		
		
		
		Example2 ex = new Example2(pa);
		ex.inorder();
		System.out.println("");
		ex.preorder();
		System.out.println("");
		ex.postorder();
		System.out.println("");
		
		

	}

}
