package bt;

public class Diameter {
	
	public static int  diameter = 0;
	
	public static int diameter(TreeNode root) {
		if(root == null) return 0;
		int left = diameter( root.left);
		int right = diameter( root.right);
		if(diameter < left +right) diameter = left+right;
		return Math.max(left, right)+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.left.left= new TreeNode(8);
		root.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(9);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(10);
		
		diameter(root);
		System.out.println("deepest:" + diameter);

	}

}
