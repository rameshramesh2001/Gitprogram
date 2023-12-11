package logic;

//import diameter.Samplehw;

public class Sample1 {
	Sample root;

	int height(Sample root) {
		if(root==null)
		return 0;
		int leftheight=height(root.left);
		int rightheight=height(root.right);
		return Math.max(leftheight,rightheight+1);
}

	
}
