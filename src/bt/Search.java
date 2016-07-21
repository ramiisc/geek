package bt;

import java.util.Queue;

public class Search {
	public static boolean searchRec1(TreeNode root, int key) {
		if (root == null)
			return false;
		if(root.data == key) return true;
		boolean left = searchRec1(root.left, key);
		if(left) return true;
		boolean right = searchRec1(root.right, key);
		if(right) return true;
		
		return false;

	}
	
	public static boolean searchRec2(TreeNode root, int key) {
		if (root == null)
			return false;
		if(root.data == key) return true;
		return (searchRec1(root.left, key) || searchRec1(root.right, key));

	}
	
	public static boolean search(TreeNode root, int key) {
		if(root == null) return false;
		Queue<TreeNode> q =  new java.util.LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			root = q.remove();
			if(root.data == key) return true;
			if(root.left != null) {
				q.add(root.left);
			}
			if(root.right != null) {
				q.add(root.right);
			}
		}
		
		return false;

	}
	
	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		System.out.println("max:" + searchRec1(root, 10));
		System.out.println("max:" + searchRec2(root, 5));
		System.out.println("max:" + search(root, 10));
	}

}
