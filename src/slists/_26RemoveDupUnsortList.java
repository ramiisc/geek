package slists;

import java.util.HashMap;

public class _26RemoveDupUnsortList {

	public static void removeDupUnsort(Node head) {
		HashMap<Integer, Boolean> ht = new HashMap<Integer, Boolean>();
		Node current = head;
		ht.put(current.data, true);
		while (current != null && current.next != null) {
			if (ht.containsKey(current.next.data)) {
				current.next = current.next.next;
			} else {
				ht.put(current.next.data, true);
				current = current.next;
			}
		}
	}

	public static void removeDupUnsort2(Node head) {

		Node current = head;
		Node runner = null;
		while (current != null) {
			runner = current;
			while (runner != null && runner.next != null) {
				if (current.data == runner.next.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		Node third = new Node(1);
		Node fourth = new Node(3);
		Node fifth = new Node(1);
		Node sixth = new Node(7);
		Node seventh = new Node(2);
		Node eighth = new Node(1);
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
		removeDupUnsort2(head);
		LinkedList.printList(head);

	}

}
