package diameter;

public class Example1 {
//class Btree {
		
		Example root;
		
	public int dia(Example node) {
			if(node==null) {
				return 0;
			}
			
			else {
				
				int leftheight=height(node.left);
				 int rightheight=height(node.right);
				 
				 int leftdia =dia(node.left);
				 int rightdia =dia(node.right);
				 return Math.max((leftheight+rightheight+1) ,Math.max(leftdia, rightdia));
				 
				// return Math.max((leftheight+rightheight+1) ,Math.max(leftdia, rightdia));
			}
	}
			
			
	public int height(Example node) {
				 if(node==null) {
					 return 0;
				// else {
				 int leftheight=height(node.left);
				 int rightheight=height(node.right);
				
				 return Math.max(leftheight, rightheight +1);
			
				 }
	}
}
