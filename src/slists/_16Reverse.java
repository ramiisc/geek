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
	
	public static Node reverseRec(Node head) {
		
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

	}

}
