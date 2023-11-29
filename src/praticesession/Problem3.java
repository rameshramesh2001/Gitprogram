package praticesession;

import java.util.HashMap;

public class Problem3 {
	int data;
	Problem3 right;
	Problem3 left;
	public Problem3(int data) {
		this.data=data;
	}

	public static void main(String[] args) {
		Problem3 pro = new Problem3(7);
		pro.left=new Problem3(16);
		pro.right=new Problem3(12);
		pro.left.left=new Problem3(17);
		pro.left.right=new Problem3(19);
		pro.left.left.left=new Problem3(12);
		pro.left.left.right=new Problem3(31);
		pro.right.left=new Problem3(8);
		pro.right.right=new Problem3(7);
		pro.right.left.left=new Problem3(29);
		pro.right.left.right=new Problem3(6);
		pro.right.right.left=new Problem3(17);
		pro.right.right.right=new Problem3(11);
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer> ();
		System.out.println(traversal(pro,map));	
		

	}

}
