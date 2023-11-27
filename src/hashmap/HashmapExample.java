package hashmap;

import java.util.HashMap;

public class HashmapExample {

	public static void main(String[] args) {
		/*HashMap<String, String> hashmap =  new HashMap<String, String>(); 
		hashmap.put("Name", "Ramesh");
		hashmap.put("Age", "34");
		hashmap.put("Gender", "Male");
		hashmap.put("Ect", "...");
		System.out.println(hashmap.get("Name"));
		System.out.println(hashmap.get("Age"));
		System.out.println(hashmap.get("Gender"));
		System.out.println(hashmap.get("Ect"));
		System.out.println(hashmap.size());
		System.out.println("Contains: "+hashmap.containsKey("address"));
		System.out.println("contains: "+hashmap.containsKey("Age"));
		System.out.println("contains: "+hashmap.remove("Name"));*/
		
		
		
		HashMap <String, Integer> hashmap1 = new HashMap<String, Integer>();
		hashmap1.put("Ramesh", 10);
		System.out.println(hashmap1.get("Ramesh"));
		HashMap <Integer, String> hashmap2 = new HashMap<Integer, String>();
		hashmap2.put(20, "Ramesh");
		System.out.println(hashmap2.get(20));
		

	}

}
