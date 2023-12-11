package inheritancetypes;

public class Hierarchical1 extends Hierarchical {
public void classB() {
	System.out.println("ClassB");
}
}
class Hierarchical2 extends Hierarchical1{
	public void classC() {
		System.out.println("ClassC");
	}
}
class Hierarchical3 extends Hierarchical2{
	public void classD() {
		System.out.println("ClassD");
	}
}
