package slists;

public class _4_5DeleteNode {
	public static Node deleteFront(Node head) {
		if (head == null) {
			return head;
		}
		Node current =head.next;
		head = null;
		return current;
	}

	public static Node deleteEnd(Node head) {
		if (head == null) {
			return head;
		}
		Node current = head,temp = null;
		while (current.next != null) {
			temp = current;
			current =  current.next;
		}
		if(temp == null) {
			return null;
		}
		temp.next = null;
		return head;
	}

	public static Node deleteAtPosition(Node head, int p) {
		int length = LinkedList.length(head);
		if (p < 1 ||   p > length) {
			System.out.println("Out of bounds");
			return null;
		}
		Node  current ;
		current = head;
		int count = 1;
		if (p == 1) {
			current = head.next;
			return current;
		}
		
		while (count < p -1) {
			current = current.next;
			count++;
		}
		current.next = current.next.next;
		return head;
	}
	
	public static Node deleteBefore(Node head, int key) {
		if (head == null) {
			System.out.println("Empty list");
			return null;
		}
		Node current, temp ;
		current = head;
		temp = head;
		if (head.data == key) {
			head = head.next;
			return head;
		}
		
		while (current.next != null && current.next.data !=  key) {
			temp = current;
			current = current.next;
		}
		if(current.next == null  ) return head;
		temp.next = current.next;
		return head;
	}
	
	public static Node deleteAfter(Node head, int key) {
		if (head == null) {
			System.out.println("Empty list");
			return null;
		}
		Node  current ;
		current = head;
		while (current != null && current.data !=  key) {
			current = current.next;
		}
		if(current == null || current.next == null ) return head;
		current.next = current.next.next;
		return head;
	}
	
	public static Node deleteKey(Node head, int key) {
		if (head == null) {
			System.out.println("Empty list");
			return null;
		}
		if(head.data == key) {
			head = head.next;
			return head;
		}
		Node  current ;
		current = head;
		while (current.next != null && current.next.data !=  key) {
			current = current.next;
		}
		if(current.next == null ) return head;
		current.next = current.next.next;
		return head;
	}
	
	public static void main(String args[]) {
		Node head = LinkedList.createList(10);
		LinkedList.printList(head);
		int length = LinkedList.length(head);
		System.out.println("length:" + length);
//		
//		head = _4_5DeleteNode.deleteFront(head);
//		LinkedList.printList(head);
//		length = LinkedList.length(head);
//		System.out.println("length:" + length);
//		
//		head = _4_5DeleteNode.deleteEnd(head);
//		LinkedList.printList(head);
//		length = LinkedList.length(head);
//		System.out.println("length:" + length);
//		
//
//		head = _4_5DeleteNode.deleteAtPosition(head, 6);
//		LinkedList.printList(head);
//		length = LinkedList.length(head);
//		System.out.println("length:" + length);
		
//		head = _4_5DeleteNode.deleteBefore(head, 6);
//		LinkedList.printList(head);
//		length = LinkedList.length(head);
//		System.out.println("length:" + length);
		
//		head = _4_5DeleteNode.deleteAfter(head, 6);
//		LinkedList.printList(head);
//		length = LinkedList.length(head);
//		System.out.println("length:" + length);
		
		head = _4_5DeleteNode.deleteKey(head, 6);
		LinkedList.printList(head);
		length = LinkedList.length(head);
		System.out.println("length:" + length);
	}
}
