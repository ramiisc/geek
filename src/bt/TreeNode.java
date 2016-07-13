package bt;

public class TreeNode {
	protected int data;
	protected TreeNode left, right;
	public TreeNode(int data) {
		super();
		this.data = data;
	}
	public TreeNode(int data, TreeNode left, TreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	public static TreeNode createtree() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		return root;
	}
	
	public static TreeNode createtree1() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.left.left.left  = new TreeNode(8);
		root.left.left.right  = new TreeNode(9);
		root.left.right.left  = new TreeNode(10);
		root.left.right.right  = new TreeNode(11);
		root.right.left.left  = new TreeNode(12);
		root.right.left.right  = new TreeNode(13);
		root.right.right.left  = new TreeNode(14);
		root.right.right.right  = new TreeNode(15);
		return root;
	}
	

}
