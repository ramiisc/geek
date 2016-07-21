package bt;

import java.util.Queue;

import slists.LinkedList;

public class MaxElement {
	public static int maxRec(TreeNode root, int max) {
		if (root == null)
			return max;
		int left = maxRec(root.left,max);
		int right = maxRec(root.right,max);
		if(left > right) {
			max = left;
		} else {
			max = right;
		}
		if(max < root.data) {
			max = root.data;
		}
		return max;

	}
	
	public static int max(TreeNode root) {
		int max = Integer.MIN_VALUE;
		if(root == null) return max;
		Queue<TreeNode> q =  new java.util.LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			root = q.remove();
			if(root.data > max) {
				max = root.data;
			}
			if(root.left != null) {
				q.add(root.left);
			}
			if(root.right != null) {
				q.add(root.right);
			}
		}
		
		return max;

	}

	public static void main(String args[]) {
//		TreeNode root = TreeNode.createtree();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(10);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		System.out.println("max:" + maxRec(root, Integer.MIN_VALUE));
		System.out.println("max:" + max(root));
	}

}
