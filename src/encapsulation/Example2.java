package encapsulation;

public class Example2 {

	public static void main(String[] args) {
		Example1 exp=new Example1();
		exp.setName("Ramesh");
		exp.setAge(22);
		System.out.println("Myname is: "+exp.getName());
		System.out.println("My age is: "+exp.getAge());

	}

}
