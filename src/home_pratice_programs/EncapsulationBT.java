package home_pratice_programs;

public class EncapsulationBT {
	int data;
	EncapsulationBT left,right;
	public EncapsulationBT(int newdata) {
		this.data=newdata;
	}
	public int getData() {
		return data;
	}
	public EncapsulationBT getLeft() {
		return left;
	}
	public EncapsulationBT getRight() {
		return right;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setLeft(EncapsulationBT left) {
		this.left = left;
	}
	public void setRight(EncapsulationBT right) {
		this.right = right;
	}

	public static void main(String[] args) {
		EncapsulationBT sa = new EncapsulationBT(10);
		sa.left=new EncapsulationBT(20);
		sa.right=new EncapsulationBT(30);
		sa.left.left=new EncapsulationBT(55);
		sa.left.right=new EncapsulationBT(44);
		sa.right.left=new EncapsulationBT(51);
		sa.right.right=new EncapsulationBT(33);
		
		
		EncapsulationBT1 n = new EncapsulationBT1(sa);
		n.inorder();
		
		

	}

}
