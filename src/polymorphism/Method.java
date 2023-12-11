package polymorphism;

public class Method {
	
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("My answer is: "+c);
	}
	


public static void main(String[] args) {
Method ob = new Method();
ob.add(20, 30);

}
}
	
	
	
	
	
	/*static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		System.out.println(add(20,10));
		System.out.println(add(2,10,20));
		

	}

}*/
