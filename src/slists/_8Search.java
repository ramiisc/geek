package slists;

public class _8Search {

	public static boolean search(Node head, int key) {
		if (head == null) {
			return false;
		}
		while (head != null) {
			if (head.data == key)
				return true;
			head = head.next;
		}
		return false;
	}

	public static boolean searchRec(Node head, int key) {
		if (head == null) {
			return false;
		}
		if (head.data == key)
			return true;

		return searchRec(head.next, key);
	}

	public static void main(String args[]) {
		Node head = null;
		int length = LinkedList.length(head);
		System.out.println("length:" + length);

		head = LinkedList.createList(10);
		LinkedList.printList(head);
		length = LinkedList.length(head);
		
		System.out.println("search:" + search(head,5));
		System.out.println("searchRec:" + searchRec(head,5));

	}
}
