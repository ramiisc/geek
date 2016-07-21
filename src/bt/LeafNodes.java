package bt;

import java.util.Queue;

public class LeafNodes {
	public static int leafnodes(TreeNode root) {
		if(root == null) return 0;
		Queue<TreeNode> q =  new java.util.LinkedList<TreeNode>();
		q.add(root);
		int count = 0;
		while(!q.isEmpty()) {
			root = q.remove();
			if(root.left == null && root.right == null) {
				count++;
				continue;
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
		

		System.out.println("deepest:" + leafnodes(root));
		Insert.insert(root, 10);
//		System.out.println("deepest:" + deepest(root).data);
		

	}

}
