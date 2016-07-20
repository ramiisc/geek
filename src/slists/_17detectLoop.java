package slists;

public class _17detectLoop {
	
	public static boolean detectLoop(Node head) {
		Node slow = head, fast = head.next;
		
		while(fast!= null && fast.next != null ) {
			if(slow == fast) return true;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = LinkedList.createListStatic();
//		LinkedList.printList(head);
		System.out.println("detectLoop " + detectLoop(head));
		head = LinkedList.createLoopList();
		System.out.println("detectLoop " + detectLoop(head));

	}

}
