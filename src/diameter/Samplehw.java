package diameter;

public class Samplehw {
	int data;
	Samplehw left,right;
	public Samplehw(int newdata) {
		this.data=newdata;
	}
	

	public static void main(String[] args) {
		Samplehw root = new Samplehw(9);
		root.left=new Samplehw(7);
		root.right=new Samplehw(8);
		root.left.left= new Samplehw(6);
		root.left.right= new Samplehw(22);
		root.left.left.right=new Samplehw(22);
		root.left.left.right.left=new Samplehw(13);
		root.left.left.right.right=new Samplehw(4);
		root.left.left.right.right.left=new Samplehw(2);
		root.right.left=new Samplehw(11);
		root.right.right=new Samplehw(13);
		root.right.right.left=new Samplehw(16);
		root.right.right.right=new Samplehw(9);
		root.right.right.left.left=new Samplehw(3);
		root.right.right.left.right=new Samplehw(20);
		root.right.right.left.right.left=new Samplehw(19);
		
		Samplehw2 pa = new Samplehw2();
		System.out.println("My diameter value is:"+pa.diameter(root));

	}
}


	
