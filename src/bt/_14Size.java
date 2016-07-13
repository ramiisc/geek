package bt;

public class _14Size {
	public static int size(TreeNode root) {
		if (root == null)
			return 0;
		return 1+size(root.left)+size(root.right);

	}
	public static void main(String args[]) {
		TreeNode root = TreeNode.createtree();
		System.out.println("size:"+size(root));
	}
}
