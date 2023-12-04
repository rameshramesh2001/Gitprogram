package home_pratice_programs;

public class EncapsulationBT1 {
	EncapsulationBT pa;
	public EncapsulationBT1(EncapsulationBT newpa) {
		this.pa=newpa;
	}
	public void inorder() {
		inorder(pa);
	}
	public void inorder(EncapsulationBT  currentpa) {
		if(currentpa!=null) {
			inorder(currentpa.left);
			System.out.print(" "+currentpa.data);
			inorder(currentpa.right);
		}
	}
}
