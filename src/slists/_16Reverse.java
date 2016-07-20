package slists;

public class _16Reverse {

	public static Node reverse(Node head) {
		Node prev = null, next = null, current = head;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		return prev;
	}
	
	public static Node reverseRec(Node prev, Node head) {
		if(head == null) return prev;
		Node next;
		next = head.next;
		head.next = prev;
		return reverseRec( head, next);
	}
	
	

	public static void main(String args[]) {
		Node head = null;
		int length = LinkedList.length(head);
		System.out.println("length:" + length);

		head = LinkedList.createListStatic();
		LinkedList.printList(head);
		length = LinkedList.length(head);
		head = reverse(head);
		LinkedList.printList(head);
		head = reverseRec(null,head);
		LinkedList.printList(head);
		head = reverseRec(null,head);
		LinkedList.printList(head);

	}

}
