package inheritancetypes;

public class Hierarchical {
	public void classA() {
		System.out.println("ClassA");
	}
	
	
	public static void main(String[] args) {
		Hierarchical3 ob = new Hierarchical3();
		ob.classA();
		ob.classB();
		ob.classC();
		ob.classD();

	}

}
