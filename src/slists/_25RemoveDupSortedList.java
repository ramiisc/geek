package slists;

public class _25RemoveDupSortedList {
	public static void removeDupSort(Node head) {

		Node current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		Node first = new Node(1);
		Node second = new Node(3);
		Node third = new Node(3);
		Node fourth = new Node(3);
		Node fifth = new Node(4);
		Node sixth = new Node(5);
		Node seventh = new Node(6);
		Node eighth = new Node(6);
		Node ninth = new Node(6);

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
		removeDupSort(head);
		LinkedList.printList(head);

	}

}
