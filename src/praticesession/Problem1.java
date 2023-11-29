package praticesession;

public class Problem1 {
	int data;
	Problem1 right;
	Problem1 left;
	public Problem1(int data) {
		this.data=data;
	}
	

	public static void main(String[] args) {
		Problem1 pro = new Problem1(21);
		pro.left=new Problem1(9);
		pro.right=new Problem1(6);
		pro.left.left=new Problem1(23);
		pro.left.right=new Problem1(18);
		pro.left.left.left=new Problem1(12);
		pro.left.left.right=new Problem1(13);
		pro.right.left=new Problem1(7);
		pro.right.right=new Problem1(16);
		pro.right.left.left=new Problem1(17);
		pro.right.left=new Problem1(7);
		pro.right.right.left=new Problem1(15);
		pro.right.right.left.left=new Problem1(11);
		

	}

}
