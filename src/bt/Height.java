package bt;

import java.util.Queue;

public class Height {

	public static int heigth1(TreeNode root) {
		if(root == null) return 0;
		int left = heigth1(root.left);
		int right = heigth1(root.right);
		return Math.max(left, right) + 1;

	}
	
	public static int heigth2(TreeNode root) {
		if(root == null) return 0;
		int left = heigth2(root.left);
		int right = heigth2(root.right);
		if(left > right) return left + 1;
		return right + 1;

	}
	
	public static int heigth(TreeNode root) {
		if(root == null) return 0;
		int count = 0;
		Queue<TreeNode> q =  new java.util.LinkedList<TreeNode>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			root = q.remove();
			if(root == null) {
				count++;
				if(q.isEmpty()) break;
				q.add(null);
			}
			if(root.left != null) {
				q.add(root.left);
			}
			if(root.right != null) {
				q.add(root.right);
			}
		}
		
		return count;

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
		

		System.out.println("heigth:" + heigth1(root));
		System.out.println("heigth:" + heigth2(root));
		System.out.println("heigth:" + heigth1(root));
		
		Insert.insert(root, 9);
		System.out.println("heigth:" + heigth1(root));
		System.out.println("heigth:" + heigth2(root));
		System.out.println("heigth:" + heigth1(root));

	}

}
