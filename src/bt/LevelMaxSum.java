package bt;

import java.util.Queue;

public class LevelMaxSum {

	public static int levelMaxSum(TreeNode root) {
		if (root == null)
			return 0;
		Queue<TreeNode> q = new java.util.LinkedList<TreeNode>();
		q.add(root);
		q.add(null);
		int maxLevel = 0;
		int maxSum = 0;
		int sum = 0;
		int level = 1;
		while (!q.isEmpty()) {
			root = q.remove();
			if (root == null) {
				if (maxSum < sum) {
					maxLevel = level;
					maxSum = sum;
				}
				sum = 0;
				level++;
				if (!q.isEmpty())
					q.add(null);
				continue;
			}
			sum += root.data;
			if (root.left != null) {
				q.add(root.left);
			}
			if (root.right != null) {
				q.add(root.right);
			}
		}
		System.out.println("maxSum:" + maxSum);
		return maxLevel;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1); 
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(11);
		root.left.right = new TreeNode(1);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(21);
		root.left.left.left = new TreeNode(8);
		root.left.right.left = new TreeNode(9);
	
		root.right.right.right = new TreeNode(10);
		System.out.println("maxLevel:" + levelMaxSum(root));

	}

}
