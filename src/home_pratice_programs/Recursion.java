package home_pratice_programs;

public class Recursion {
	public void recursive(int n) {
		//int n=1;
		if(n<=5) {
			//return 6;
			System.out.print(" "+n);
			n++;
		//return n+recursive(n+1);
			recursive(n);
		}
	}
			
	public static void main(String[] args) {
		Recursion f=new Recursion();
		f.recursive(1);
	}
}

