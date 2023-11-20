package Java_pratice_programs2;

import java.util.Scanner;

public class Excesis3 {

	public static void main(String[] args) {
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("My number is:"+sum);

	}

}
