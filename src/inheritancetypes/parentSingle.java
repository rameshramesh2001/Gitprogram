package inheritancetypes;

public class parentSingle {
	int a=20,b=30;
	int c = a+b;

	public static void main(String[] args) {
		ChildSingle1 ob = new ChildSingle1();
		System.out.println("My single class answer: "+ob.c);
		System.out.println("My single1 class answer: "+ob.d);

	}

}
