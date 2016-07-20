package slists;


public 

class NodeChar {
	char data;
	NodeChar next;
	NodeChar(char data) {
		this.data = data;
	}

	public static void printList(NodeChar head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println();
	}
}
