package diameter;

public class Example {
	int data;
	Example left,right;
	public Example(int newdata) {
		this.data=newdata;
	}
	
	public static void main(String[] args) {
		Example root = new Example(9);
		root.left=new Example(7);
		root.right=new Example(8);
		root.left.left= new Example(6);
		root.left.right= new Example(22);
		root.left.left.right=new Example(22);
		root.left.left.right.left=new Example(13);
		root.left.left.right.right=new Example(4);
		root.left.left.right.right.left=new Example(2);
		root.right.left=new Example(11);
		root.right.right=new Example(13);
		root.right.right.left=new Example(16);
		root.right.right.right=new Example(9);
		root.right.right.left.left=new Example(3);
		root.right.right.left.right=new Example(20);
		root.right.right.left.right.left=new Example(19);
		Example1 pa = new Example1();
		System.out.println("My height of value is: "+pa.height(root));
		System.out.println("My diameter value is: "+pa.dia(root));
		

	}

}
