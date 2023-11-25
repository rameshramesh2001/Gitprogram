package binarytree;

public class Node2 {
public static Node mirror(Node root) {
	if(root==null) {
		return null;
	}
	Node temp = root.left;
    root.left = root.right;
    root.right = temp;
    if(root.left!=null) {
    	mirror(root.left);
    }
    if(root.right!=null) {
    	mirror(root.right);
    }
    return root;
}
  
public static void InOrderTraversal(Node root) {
    if (root != null) {
        InOrderTraversal(root.left);
        System.out.print(root.data + " ");
        InOrderTraversal(root.right);
    }
}

}
