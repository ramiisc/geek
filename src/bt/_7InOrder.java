package bt;

import java.util.Stack;

public class _7InOrder {
	public static void inOrder(TreeNode root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static void inOrderIteration(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		root = root.left;
 		while(true) {
			while(root != null) {
				s.push(root);
				root = root.left;
				
			}
			if(s.isEmpty()) break;
			root = s.pop();
			System.out.print(root.data+" ");
			root = root.right;
		}
		
	}
	
	public static void main(String args[]) {
		TreeNode root = TreeNode.createtree(); 
		inOrder(root);
		System.out.println();
		inOrderIteration(root);
		System.out.println();
	}

}
