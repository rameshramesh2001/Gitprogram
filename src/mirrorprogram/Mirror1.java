package mirrorprogram;

public class Mirror1 {

		public static Mirror createMirror(Mirror root) {
			if(root == null) {
			return null;
			}
			Mirror temp=root.left;
			root.left=root.right;
			root.right=temp;
			if(root.left != null) {
				createMirror(root.left);
			}
			if(root.right != null) {
				createMirror(root.right);
			}
			return root;
		}
		public static void InOrderTraversal(Mirror root) {
			if(root != null) {
				InOrderTraversal(root.left);
				System.out.println(root.data +" ");
				InOrderTraversal(root.right);
			}
		}
		public static void preOrderTraversal(Mirror root) {
			if(root != null) {
				System.out.println(root.data +" ");
			preOrderTraversal(root.left);
				preOrderTraversal(root.right);
			}
		}
}
