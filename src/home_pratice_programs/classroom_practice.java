package home_pratice_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class classroom_practice {

	public static void main(String[] args) {
		/*String[] strarr= {"ramu","raja","ramesh","perumal"};
		logicclass21 la=new logicclass21();
		System.out.println(la.toString());*/
		String name="";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		name=s.nextLine();
		String[] str=name.split("");
		char[] cha=name.toCharArray();
		List<String> pat = Arrays.asList(str);
		System.out.println(pat);
		

	}

}
