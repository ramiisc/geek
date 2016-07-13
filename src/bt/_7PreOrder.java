package bt;

import java.util.Stack;

public class _7PreOrder {
	public static void preOrder(TreeNode root) {
		if(root == null) return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void preOrderIteration(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		System.out.print(root.data+" ");
		root = root.left;
 		while(true) {
			while(root != null) {
				s.push(root);
				System.out.print(root.data+" ");
				root = root.left;
				
			}
			if(s.isEmpty()) break;
			root = s.pop();
			root = root.right;
		}
		
	}
	
	public static void main(String args[]) {
		TreeNode root = TreeNode.createtree(); 
		preOrder(root);
		System.out.println();
		preOrderIteration(root);
		System.out.println();
	}

}
