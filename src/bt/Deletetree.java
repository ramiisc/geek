package bt;

public class Deletetree {
	public static void delete(TreeNode root) {
		if (root == null)
			return;
		delete(root.left);
		delete(root.right);
		root = null;
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
		delete(root);
		_7LevelOrder.levelOrderByLine(root);

	}

}
