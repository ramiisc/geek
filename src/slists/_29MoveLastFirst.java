package slists;

public class _29MoveLastFirst {
	
	public static Node moveLastFirst(Node head) {
		if(head.next == null) return head;

		Node current = head;
		Node last;
		while (current.next.next != null) {
			current = current.next;
		}
		last = current.next;
		current.next = null;
		last.next = head;
		head = last;
		return head;
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
		head = moveLastFirst(head);
		LinkedList.printList(head);

	}

}
