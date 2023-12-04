package mirrorprogram;

public class Mirror {
	//public class Mirror1 {
		int data;
		Mirror left;
		Mirror right;
		
		Mirror(int data){
			this.data=data;
			left=null;
			 right=null;
		}
		 public static void main(String[] args) {
			 Mirror root=new Mirror(3);
			 root.left=new Mirror(7);
			 root.right=new Mirror(8);
			 root.left.left=new Mirror(1);
			 root.left.right=new Mirror(9);
			 root.left.right.right=new Mirror(2);
			 
			 System.out.println("Original Tree");
			 InOrderTraversal(root);
			 System.out.println();
			 
			 Mirror Mirroredroot = createMirror(root);
			 
			 System.out.println("Mirror Tree");
			 InOrderTraversal(Mirroredroot);
			 
			 System.out.println("PreOrder Tree");
			 preOrderTraversal(Mirroredroot);
		 }
	}
