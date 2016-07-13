package bt;

import java.util.LinkedList;
import java.util.Queue;

public class _7LevelOrder {

	public static void levelOrder(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			root = q.remove();
			System.out.print(root.data + " ");
			if (root.left != null) {
				q.add(root.left);

			}
			if (root.right != null) {
				q.add(root.right);

			}
		}

	}

	public static void levelOrderByLine(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		q.add(null);
		while (!q.isEmpty()) {
			root = q.remove();
			if (root == null) {
				System.out.println();
				if(q.isEmpty()) break;
				q.add(null);
			} else {
				System.out.print(root.data + " ");
				if (root.left != null) {
					q.add(root.left);

				}
				if (root.right != null) {
					q.add(root.right);

				}
			}
		}

	}

	public static void main(String args[]) {
		TreeNode root = TreeNode.createtree1();
		levelOrder(root);
		System.out.println();
		levelOrderByLine(root);
		System.out.println();

	}

}
