package slists;

public class _27PairwiseSwap {

	public static void pairwiseSwap(Node head) {

		Node current = head;
		int temp;
		while (current != null && current.next != null) {
			temp = current.data;
			current.data = current.next.data;
			current.next.data = temp;
			current = current.next.next;
		}
	}

	public static void pairwiseSwapRec(Node head) {
		if (head == null || head.next == null)
			return;
		int temp;
		temp = head.data;
		head.data = head.next.data;
		head.next.data = temp;
		pairwiseSwapRec(head.next.next);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		Node third = new Node(4);
		Node fourth = new Node(5);
		Node fifth = new Node(6);
		Node sixth = new Node(7);
		Node seventh = new Node(8);
		Node eighth = new Node(9);
		Node ninth = new Node(10);

		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eighth;
		eighth.next = ninth;

		LinkedList.printList(head);
		pairwiseSwap(head);
		LinkedList.printList(head);
		pairwiseSwapRec(head);
		LinkedList.printList(head);

	}
}
