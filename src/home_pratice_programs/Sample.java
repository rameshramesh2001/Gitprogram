package home_pratice_programs;

import java.util.LinkedList;
import java.util.Queue;

public class Sample {
	
	public static void main(String[]args) {
		Queue <Integer> queue = new LinkedList<>();
		int value1=10;
		int value2=20;
		int value3=value1+value2;
		
		System.out.println("My old value: "+value1+" "+value2);
		System.out.println("My new value: "+value3);
	}

}
