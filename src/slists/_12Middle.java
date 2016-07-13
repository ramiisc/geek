package slists;

public class _12Middle {
	
	
	public static int middle1(Node head) {
		int length = LinkedList.length(head);
		int count = 0;
		while(count < length/2) {
			head = head.next;
			count++;
		}
		return head.data;
	}
	
	public static int middle2(Node head) {
		Node slow, fast;
		slow = head;
		fast = head;
		while(fast != null  && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	public static int middle3(Node head) {
		Node mid = head, current = head;
		int count = 0;
		while(current != null) {
			current = current.next;
			if(count % 2 != 0) mid = mid.next;
			count++;
		}
		return mid.data;
	}
	
	public static void main(String args[]) {
		Node head = null;
		int length = LinkedList.length(head);
		System.out.println("length:" + length);

		head = LinkedList.createList(2);
		LinkedList.printList(head);
		length = LinkedList.length(head);
		
		System.out.println("middle:" + middle1(head));
		System.out.println("middle:" + middle2(head));
		System.out.println("middle:" + middle3(head));

	}

}
