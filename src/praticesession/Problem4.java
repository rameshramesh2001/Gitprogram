package praticesession;

public class Problem4 {
	private static boolean Problem4(Problem3 pro, HashMap<Integer, Integer> map) {
		if(pro==null)
		{
        return false;
		}
		if(map.containsKey(pro.data))
		{
			
			return true;
		}
        
		map.put(pro.data,0);
        
        return traversal(pro.left,map)||traversal(pro.right,map);   
		
	}
}
