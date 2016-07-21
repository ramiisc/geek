package bt;

import java.util.Queue;

public class _14Size {
	public static int size(TreeNode root) {
		if (root == null)
			return 0;
		return 1+size(root.left)+size(root.right);

	}
	public static int sizeIte(TreeNode root) {
		if (root == null)
			return 0;
		int count = 0;
		Queue<TreeNode> q =  new java.util.LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			root = q.remove();
			count++;
			if(root.left != null) {
				q.add(root.left);
			}
			if(root.right != null) {
				q.add(root.right);
			}
		}
		
		return count;


	}
	public static void main(String args[]) {
		TreeNode root = TreeNode.createtree();
		System.out.println("size:"+size(root));
		System.out.println("sizeIte:"+sizeIte(root));
		Insert.insert(root, 10);
		System.out.println("size:"+size(root));
		System.out.println("sizeIte:"+sizeIte(root));
	}
}
