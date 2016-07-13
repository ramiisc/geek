package slists;

public class _7Length {
	public static int length(Node head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	public static int lengthRec(Node head) {
		
		if(head == null) {
			return 0;
		}
		return lengthRec(head.next)+1;
	}
	
	public static void main(String args[]) {
		Node head = null;
		int length = length(head);
		System.out.println("length:" + length);
		length = lengthRec(head);
		System.out.println("lengthRec:" + length);
		
		head = LinkedList.createList(10);
		LinkedList.printList(head);
		length = length(head);
		System.out.println("length:" + length);
		length = lengthRec(head);
		System.out.println("lengthRec:" + length);
	}
	

}
