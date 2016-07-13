package bt;

import java.util.Stack;

public class _7PostOrder {
	public static void postOrder(TreeNode root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");

	}

	public static void postOrderIteration(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		root = root.left;
		TreeNode node = null;
		while (true) {
			while (root != null) {
				s.push(root);
				root = root.left;

			}
			if (s.isEmpty())
				break;
			if (s.peek().right == null) {
				node = s.pop();
				System.out.print(node.data + " ");

			} 
			if (s.peek().right == node) {
				node = s.pop();
				System.out.print(node.data + " ");

			} else {
				root = s.peek().right;
			}
		}

	}

	public static void main(String args[]) {
		TreeNode root = TreeNode.createtree();
		postOrder(root);
		System.out.println();
		postOrderIteration(root);
		System.out.println();
	}

}
