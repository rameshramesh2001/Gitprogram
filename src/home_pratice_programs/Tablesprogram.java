package home_pratice_programs;

import java.util.Scanner;

public class Tablesprogram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the multiplication number: ");
		int num=s.nextInt();
		int result=0;
		for(int i=1;i<=10;i++) {
			result=i*num;
			System.out.println(i+"*"+num+"="+result);
		}
	}

}
