package inheritancetypes;

public class Hierarchical {
	public void classA() {
		System.out.println("ClassA");
	}
	
	
	public static void main(String[] args) {
		Hierarchical2 ob = new Hierarchical2();
		Hierarchical1 ob1 = new Hierarchical1();
		Hierarchical3 ob2 = new Hierarchical3();
		
		
		ob.classA();
		ob1.classB();
		//ob.classB();
		//ob.classA();
		ob.classC();
		ob2.classD();

	}

}
