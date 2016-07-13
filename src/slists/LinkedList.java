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
