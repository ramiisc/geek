package slists;

public class LinkedList {

	public static Node createList() {
		Node head = null, current = null;
		for (int i = 0; i < 10; i++) {
			if (head == null) {
				head = new Node((int) (Math.random() * 20));
				current = head;
				continue;
			}
			current.next = new Node((int) (Math.random() * 20));
			current = current.next;

		}
		return head;
	}
	
	public static Node createDummyList() {
		Node head =  new Node(1);
		Node first =  new Node(2);
		Node second =  new Node(3);
		Node third =  new Node(4);
		Node fourth =  new Node(5);
		Node fifth =  new Node(6);
		Node sixth =  new Node(7);

		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		return head;
	}
	
	public static Node createLoopList() {
		Node head =  new Node(1);
		Node first =  new Node(2);
		Node second =  new Node(3);
		Node third =  new Node(4);
		Node fourth =  new Node(5);
		Node fifth =  new Node(6);
		Node sixth =  new Node(7);
		Node seventh =  new Node(8);

		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = third;
		
		return head;
	}
	
	public static Node createListStatic() {
		Node head = null, current = null;
		for (int i = 1; i < 11; i++) {
			if (head == null) {
				head = new Node(i);
				current = head;
				continue;
			}
			current.next = new Node(i);
			current = current.next;

		}
		return head;
	}
	
	public static Node createList(int size) {
		Node head = null, current = null;
		if(size == 0) return null;
		for (int i = 0; i < size; i++) {
			if (head == null) {
				head = new Node((int) (Math.random() * 20));
				current = head;
				continue;
			}
			current.next = new Node((int) (Math.random() * 20));
			current = current.next;

		}
		return head;
	}

	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println();
	}

	public static int length(Node head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	/* Insert operations */
	
	
	/* Insert operations */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		int length = LinkedList.length(head);
		System.out.println("length:" + length);
		
		head = LinkedList.createList();
		LinkedList.printList(head);
		length = LinkedList.length(head);
		System.out.println("length:" + length);

	
	
		
		

	}

}
