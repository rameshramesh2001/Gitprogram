package inheritancetypes;

public class Multilevel {
	
	public void print_my() {
		System.out.print("My ");
	}

	public static void main(String[] args) {
		Multilevel2 ob = new Multilevel2();
		ob.print_my();
		ob.print_name();
		ob.print_ramesh();
		
		
	}

}
