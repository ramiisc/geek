package slists;

public class _3InsertNode {
	public static Node insertFront(Node head) {
		if (head == null) {
			head = new Node((int) (Math.random() * 20));
			return head;
		}
		Node newNode = new Node((int) (Math.random() * 20));
		newNode.next = head;
		head = newNode;
		return head;
	}

	public static Node insertEnd(Node head) {
		if (head == null) {
			head = new Node((int) (Math.random() * 20));
			return head;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node((int) (Math.random() * 20));
		current.next = newNode;
		return head;
	}

	public static Node insertAtPosition(Node head, int p) {
		int length = LinkedList.length(head);
		if (p < 1 ||   p > length + 1) {
			System.out.println("Out of bounds");
			return null;
		}
		Node newNode, current ;
		current = head;
		int count = 1;
		if (p == 1) {
			newNode = new Node((int) (Math.random() * 20));
			newNode.next= head;
			return newNode;
		}
		
		while (count < p -1) {
			current = current.next;
			count++;
		}
		newNode = new Node((int) (Math.random() * 20));
		newNode.next = current.next;
		current.next = newNode;
		return head;
	}
	

	public static Node insertBefore(Node head, int key, int data) {
		if (head == null) {
			System.out.println("Empty list");
			return null;
		}
		Node newNode , current ;
		current = head;
		if (head.data == key) {
			newNode = new Node((int) (Math.random() * 20));
			newNode.next = head;
			return newNode;
		}
		
		while (current.next != null && current.next.data !=  key) {
			current = current.next;
		}
		if(current.next == null  ) return head;
		newNode = new Node(data);
		newNode.next = current.next;
		current.next = newNode;
		return head;
	}
	
	public static Node insertAfter(Node head, int key, int data) {
		if (head == null) {
			System.out.println("Empty list");
			return null;
		}
		Node newNode , current ;
		current = head;
		while (current != null && current.data !=  key) {
			current = current.next;
		}
		if(current == null  ) return head;
		newNode = new Node(data);
		newNode.next = current.next;
		current.next = newNode;
		return head;
	}
	
	public static void main(String args[]) {
		Node head = null;
		int length = LinkedList.length(head);
		System.out.println("length:" + length);
		
		head = LinkedList.createList();
		LinkedList.printList(head);
		length = LinkedList.length(head);
		System.out.println("length:" + length);

		head = _3InsertNode.insertFront(head);
		LinkedList.printList(head);
		LinkedList.length(head);

		head = _3InsertNode.insertEnd(head);
		LinkedList.printList(head);
		LinkedList.length(head);
		
		head = _3InsertNode.insertAtPosition(head, 1);
		LinkedList.printList(head);
		length = LinkedList.length(head);
		System.out.println("length:" + length);
		
		head = _3InsertNode.insertAtPosition(head,  LinkedList.length(head)+1);
		LinkedList.printList(head);
		length = LinkedList.length(head);
		System.out.println("length:" + length);
		
		head = _3InsertNode.insertAtPosition(head, 7);
		LinkedList.printList(head);
		length = LinkedList.length(head);
		System.out.println("length:" + length);
		
		head = _3InsertNode.insertAtPosition(head, 2);
		LinkedList.printList(head);
		length = LinkedList.length(head);
		System.out.println("length:" + length);
		
		head = _3InsertNode.insertBefore(head, 5, 100);
		LinkedList.printList(head);
		length = LinkedList.length(head);
		System.out.println("length:" + length);
		
		head = _3InsertNode.insertAfter(head, 5, 100);
		LinkedList.printList(head);
		length = LinkedList.length(head);
		System.out.println("length:" + length);
	}
}
