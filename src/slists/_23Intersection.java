package slists;

public class _23Intersection {

	public static Node intersection(Node head1, Node head2) {
		int len1 = LinkedList.length(head1);
		int len2 = LinkedList.length(head2);
		int count = 0;
		Node c1 = head1, c2 = head2;
		int diff = Math.abs(len1 - len2);
		if (len1 > len2) {
			while (count < diff) {
				c1 = c1.next;
				count++;
			}
		} else {
			while (count < diff) {
				c2 = c2.next;
				count++;
			}
		}
		while (c1 != null && c2 != null) {
			if (c1 == c2)
				return c1;
			c1 = c1.next;
			c2 = c2.next;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1 = new Node(1);
		Node first1 = new Node(2);
		Node second1 = new Node(3);
		Node third = new Node(4);
		Node fourth = new Node(5);
		Node fifth = new Node(6);
		Node sixth = new Node(7);
		Node seventh = new Node(8);

		head1.next = first1;
		first1.next = second1;
		second1.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;

		Node head2 = new Node(10);
		Node first2 = new Node(20);
		Node second2 = new Node(30);

		head2.next = first2;
		first2.next = second2;
		second2.next = third;

		LinkedList.printList(head1);
		LinkedList.printList(head2);
		Node in = intersection(head1, head2);
		if (in != null) {
			System.out.println("intersection: " + in.data);
		} else {
			System.out.println("No intersection ");
		}

	}

}
