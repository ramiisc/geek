package slists;

public class _18MergeLists {
	
	public static Node  mergeLists(Node h1, Node h2) {
		Node h3 = null, c3 = null, c1 = h1, c2 = h2;
		
		if(h1 == null) return h2;
		if(h2 == null) return h1;
		
		while(c1 != null && c2 != null) {
			if(c1.data < c2.data) {
				if(h3 == null) {
//					h3  = new Node(c1.data);
					h3  = c1;
					c3 = h3;
				} else {
//					c3.next  = new Node(c1.data);
					c3.next   = c1;
					c3 = c3.next;
				}
				c1 = c1.next;
			} else {
				if(h3 == null) {
//					h3  = new Node(c2.data);
					h3  = c2;
					c3 = h3;
				} else {
//					c3.next  = new Node(c2.data);
					c3.next   = c2;
					c3 = c3.next;
				}
				c2 = c2.next;
			}
		}
		
		while(c1 != null) {
//			c3.next  = new Node(c1.data);
			c3.next   = c1;
			c3 = c3.next;
			c1 = c1.next;
		}
		
		while(c2 != null) {
//			c3.next  = new Node(c2.data);
			c3.next   = c2;
			c3 = c3.next;
			c2 = c2.next;
		}
		
		return h3;
		
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
		
		Node h2 = new Node(5);
		h2.next = new Node(12);
		h2.next.next = new Node(27);
		h2.next.next.next  = new Node(35);
		LinkedList.printList(h2);
		
		
		Node h3 =  mergeLists(h1,h2);
		LinkedList.printList(h3);

	}

}
