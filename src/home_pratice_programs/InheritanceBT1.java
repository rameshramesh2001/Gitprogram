package home_pratice_programs;

public class InheritanceBT1 extends InheritanceBT {
	InheritanceBT pa;
	public InheritanceBT1(int newpa) {
		super(newpa);
		
	}
	public void inorder() {
		inorder(pa);
	}
	public void inorder(InheritanceBT currentpa) {
		if(currentpa!=null) {
			inorder(currentpa.left);
			System.out.println(" "+currentpa.data);
			inorder(currentpa.right);
		}
	}
	

}
