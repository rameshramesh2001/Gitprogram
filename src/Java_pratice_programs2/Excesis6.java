package Java_pratice_programs2;

import java.util.Scanner;

public class Excesis6 {

	public static void main(String[] args) {
		int n,search,flag=0,i;
		 int [] arr = new int [] {10,20,30,40,50};  
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit");
		n=s.nextInt();
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the search key");
		search=s.nextInt();
		for(i=0;i<n;i++) {
			if(search==arr[i]) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Value found of position"+i+1);
		}
		else {
			System.out.println("Value not found");
		}

	}

}
