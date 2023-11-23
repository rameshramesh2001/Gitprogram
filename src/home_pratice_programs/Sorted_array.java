package home_pratice_programs;

import java.util.Scanner;

public class Sorted_array {

	public static void main(String[] args) {
		int n,temp;
		int arr[]= {10,50,20,100,30,5};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		n=s.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int i=0;i<n;i++) {
			System.out.println("My sorted value is: "+arr[i]);
		}

	}

}
