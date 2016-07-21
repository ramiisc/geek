package bt;

import java.util.Queue;
import java.util.Stack;

public class LevelOrderReverse {

	public static void levelorderReverse(TreeNode root) {
		if(root == null) return;
		Stack<TreeNode> s = new Stack<TreeNode>();
		Queue<TreeNode> q =  new java.util.LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			root = q.remove();
			s.push(root);
			if(root.right != null) {
				q.add(root.right);
			}
			if(root.left != null) {
				q.add(root.left);
			}
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop().data+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		System.out.println("levelorderReverse:");
		levelorderReverse(root);

	}

}
