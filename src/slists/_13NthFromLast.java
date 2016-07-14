package slists;

public class _13NthFromLast {
	public static int nthFromLast1(Node head, int k) {
		int count = 0;
		int length = LinkedList.length(head);
		if(k > length) {
			System.out.println("out of bounds:");
			return -1;
		}
		while(count < length - k) {
			head = head.next;
			count++;
		}
		return head.data;
	}
	
	public static int nthFromLast2(Node head, int k) {
		int count = 0;
		int length = LinkedList.length(head);
		Node slow = head, fast = head;
		if(k > length) {
			System.out.println("out of bounds:");
			return -1;
		}
		while(count < k) {
			fast = fast.next;
			count++;
		}
		while(fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.data;
	}

	public static void main(String args[]) {
		Node head = null;
		int length = LinkedList.length(head);
		System.out.println("length:" + length);

		head = LinkedList.createList(10);
		LinkedList.printList(head);
		length = LinkedList.length(head);
		
		System.out.println("nth:" + nthFromLast1(head,4));
		System.out.println("nth:" + nthFromLast2(head,4));

	}

}
