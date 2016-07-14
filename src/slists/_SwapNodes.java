package slists;

public class _SwapNodes {

	public static Node swapNodes(Node head, int X, int Y) {

		Node prevX = null, prevY = null, nodeX = null, nodeY = null, temp = null;
		Node current = head;

		while (current != null) {
			if (current.data == X) {
				nodeX = current;
				break;
			}
			prevX = current;
			current = current.next;
		}

		if (nodeX == null) {
			return head;
		}
		current = head;
		while (current != null) {
			if (current.data == Y) {
				nodeY = current;
				break;
			}
			prevY = current;
			current = current.next;
		}

		if (nodeY == null) {
			return head;
		}
		if(prevX == null) {
			head = nodeY;
		} else {
			prevX.next = nodeY;
		}
		if(prevY == null) {
			head = nodeX;
		} else {
			prevY.next = nodeX;
		}
		temp = nodeY.next;
		nodeY.next = nodeX.next;
		nodeX.next = temp;

		return head;

	}

	public static void main(String args[]) {
		Node head = null;
		int length = LinkedList.length(head);
		System.out.println("length:" + length);

		head = LinkedList.createListStatic();
		LinkedList.printList(head);
		length = LinkedList.length(head);
		head =  swapNodes(head, 4, 4);
		LinkedList.printList(head);

	}

}
