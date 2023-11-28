package home_pratice_programs;

import java.util.Scanner;

public class Function1 {
	int a,b,c;
	void  getinput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a=s.nextInt();
		System.out.println("Enter the second number: ");
		b=s.nextInt();
		
	}
	void display() {
		c=a+b;
		System.out.println(c);
	}

}
