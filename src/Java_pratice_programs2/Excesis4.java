package Java_pratice_programs2;

import java.util.Scanner;

public class Excesis4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Add");
		}

	}

}
