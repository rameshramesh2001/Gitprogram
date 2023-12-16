package hashmap;

import java.util.HashMap;

public class Example1 {
	static boolean answer=false;

	public static void main(String[] args) {
		HashMap<String, String> hashmap =  new HashMap<String, String>(); 
		hashmap.put("Name", "Ramesh");
		hashmap.put("Age", "34");
		hashmap.put("Gender", "Male");
		hashmap.put("Ect", "...");
		//System.out.println(hashmap.);
		//hashmap.keySet()
;		String search="34";
		hashmap.forEach((key,value)->{
			if(key.contains(search)||value.contains(search)) {
				answer=true;
			}
			//System.out.println(answer);
		});
		System.out.println(search+" :"+answer);

	}

}
