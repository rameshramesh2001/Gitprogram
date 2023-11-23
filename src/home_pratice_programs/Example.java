package home_pratice_programs;

import java.util.LinkedList;
import java.util.Queue;

public class Example {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<>();
	queue.add("Apple");
	queue.add("Orange");
	queue.add("banana");
	System.out.println("Total Elements"+queue);
	String front = queue.remove();
	System.out.println("Remove Elements: "+front);
	System.out.println("Remaining Queue: "+queue);
		}

	}

