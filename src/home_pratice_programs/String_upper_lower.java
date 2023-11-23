package home_pratice_programs;

import java.util.Scanner;

public class String_upper_lower {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str="";
		System.out.println("Enter any String: ");
		str=s.nextLine();
		String uppercasestring="",lowercasestring="";
		lowercasestring=str.toLowerCase();
		uppercasestring=str.toUpperCase();
		System.out.println("Orginal string is: "+str);
		System.out.println("Lowercase string is: "+lowercasestring);
		System.out.println("Uppercase string is: "+uppercasestring);

	}

}
