package bt;

public class _15Identical {
	
	public static boolean identical(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 == null) return true;
		if(root1 == null || root2 == null) return false;
		if(root1.data != root2.data) return false;
		if(identical(root1.left, root2.left) && identical(root1.right, root2.right)) return true;
		return false;
	}
	
	public static boolean identical1(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 == null) return true;
		if(root1 == null || root2 == null) return false;
		if(root1.data != root2.data) return false;
		return identical(root1.left, root2.left) && identical(root1.right, root2.right);
	}
	public static void main(String args[]) {
		TreeNode root1 = TreeNode.createtree();
		TreeNode root2 = TreeNode.createtree();
		TreeNode root3 = TreeNode.createtree1();
		System.out.println("identical:"+identical(root1,root2));
		System.out.println("identical:"+identical1(root1,root2));
		System.out.println("identical:"+identical1(root1,root3));
	}
}
