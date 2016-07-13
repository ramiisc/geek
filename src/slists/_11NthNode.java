package slists;

public class _11NthNode {

	public static int nth(Node head, int index) {
		int count = 1;
		int length = LinkedList.length(head);
		if(index > length) {
			System.out.println("out of bounds:");
			return -1;
		}
		while(count != index) {
			head = head.next;
			count++;
		}
		return head.data;
	}

	public static void main(String args[]) {
		Node head = null;
		int length = LinkedList.length(head);
		System.out.println("length:" + length);

		head = LinkedList.createList(10);
		LinkedList.printList(head);
		length = LinkedList.length(head);
		
		System.out.println("nth:" + nth(head,9));

	}

}
