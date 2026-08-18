class Node{
	int data;
	Node prev;
	Node next;
	Node(int d) {
		data = d;
		prev = next = null;
	}
};

class Main{
	public static void main(string[] args){
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.prev = head;
		head.next.next = new Node(30);
		head.next.next.prev = head.next;
		head.next.next.next = new Node(40);
		head.next.next.next.prev = head.next.next;
		Node temp = head;
		while (temp!=next){
			System.out.print("<->");
			if(temp.next!=null){
				System.out.print("<->");
			}
			temp = temp.next;
		}
	}
}
