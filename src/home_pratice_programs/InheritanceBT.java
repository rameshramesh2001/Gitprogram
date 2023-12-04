package home_pratice_programs;

public class InheritanceBT {
	int data;
	InheritanceBT left,right;
	public InheritanceBT(int newdata) {
		this.data=newdata;
	}

	public static void main(String[] args) {
		InheritanceBT sa = new InheritanceBT(10);
		sa.left=new InheritanceBT(20);
		sa.right=new InheritanceBT(30);
		sa.left.left=new InheritanceBT(55);
		sa.left.right=new InheritanceBT(44);
		sa.right.left=new InheritanceBT(51);
		sa.right.right=new InheritanceBT(33);
		
		
		InheritanceBT1 n = new InheritanceBT1(sa);
		n.inorder();

	}

}
