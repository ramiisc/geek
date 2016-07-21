package bt;

import java.util.Queue;

public class Insert {
	
	public static TreeNode insert(TreeNode root, int key) {
		TreeNode newNode = new TreeNode(key);
		TreeNode temp;
		if(root == null) {
			return newNode;
		}
		Queue<TreeNode> q =  new java.util.LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			temp = q.remove();
			if(temp.left != null) {
				q.add(temp.left);
			} else {
				temp.left = newNode;
				break;
			}
			if(temp.right != null) {
				q.add(temp.right);
			} else {
				temp.right = newNode;
				break;
			}
		}
		
		return root;
		
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
		
		_7LevelOrder.levelOrderByLine(root);
		insert(root, 8);
		insert(root, 9);
		System.out.println("LevelOrder");
		_7LevelOrder.levelOrderByLine(root);

	}

}
