package stack;
import java.util.Stack;

public class Stack_example{

	
		//package Stack;

		

		//public class stack_Example {
		public static void main(String[] args) {

			//public static void main(String[] args) {
				Stack <Integer> Stack = new Stack <Integer>();
				System.out.println("is epmty check: "+Stack.isEmpty());
				Stack.push(10);
				Stack.push(21);
				Stack.push(23);
				Stack.push(27);
				System.out.println(Stack);
				int last_removed_value =Stack.pop();
				System.out.println("Last_removed_value: "+last_removed_value);
				System.out.println("updated: "+Stack);

				System.out.println("is empty check: "+Stack.isEmpty());

				Stack.clear();
				System.out.println("updated: "+Stack);

				System.out.println("is empty check: "+Stack.isEmpty());

			}
}
