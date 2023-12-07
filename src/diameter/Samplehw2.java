package diameter;

public class Samplehw2 {
	Samplehw root;
	
	
	int diameter(Samplehw root) {
		if(root==null)
		return 0;
		
		int leftheight=height(root.left);
		int rightheight=height(root.right);
		
		int leftdia=diameter(root.left);
		int rightdia=diameter(root.right);
		return Math.max(leftheight+rightheight,Math.max(leftdia, rightdia));
	}
		
		int diameter2() {
			return diameter(root);
		}
		static int height(Samplehw node) {
			if(node==null)
				return 0;
				return (1+ Math.max(height(node.left), height(node.right)));
		}
	}
