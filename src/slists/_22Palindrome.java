package slists;

import java.util.Stack;

public class _22Palindrome {
	private static NodeChar current;
	
	public static boolean isPalRecur(NodeChar head) {
		if(head == null) return true;
		boolean isp = isPalRecur(head.next);
		if(isp == false) return false;
		if(current.data != head.data) return false;
		current = current.next;
		return true;
		
	}

	public static boolean isPalindrome(NodeChar head) {
		NodeChar slow = head, fast = head;
		Stack<Character> stack = new Stack<Character>();
		while (fast != null && fast.next != null) {
			stack.add(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast.next == null) slow = slow.next;
		while(slow != null) {
			if(stack.pop() != slow.data) return false;
			slow = slow.next;
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NodeChar h1 = new NodeChar('a');
		h1.next = new NodeChar('b');
		h1.next.next = new NodeChar('c');
		h1.next.next.next = new NodeChar('b');
		h1.next.next.next.next = new NodeChar('a');
		NodeChar.printList(h1);
		current = h1;
		System.out.println("isPalindrome:" + isPalindrome(h1));
		System.out.println("isPalindrome:" + isPalRecur(h1));

	}

}
