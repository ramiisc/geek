package slists;

public class _20SortedInsert {
	
	public static Node sortedInsert(Node head, int data) {
		Node current = head;
		Node newNode = new Node(data);
		if(data  < head.data) {
			newNode.next = head;
			return newNode;
		}
		
		while(current.next != null && current.next.data < data) {
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node h1 = new Node(10);
		h1.next = new Node(20);
		h1.next.next = new Node(25);
		h1.next.next.next  = new Node(32);
		h1.next.next.next.next = new Node(40);
		h1.next.next.next.next.next = new Node(50);
		LinkedList.printList(h1);
		h1 = sortedInsert(h1,  3);
		LinkedList.printList(h1);
		h1 = sortedInsert(h1,  21);
		LinkedList.printList(h1);
		sortedInsert(h1,  30);
		LinkedList.printList(h1);

	}

}
