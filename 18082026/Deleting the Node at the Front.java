class Node{
	int data;
	Node prev;
	Node next;
	Node(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}

public class Main{
	public static Node delHead(Node head) {
		if(head == null) {
			return null;
		}

		Node temp = head;
		head = head.next;
		if(head!=null){
			head.prev = null;
		}
		return head;
	}
	public static void printList(Node head){
		Node curr = head;
		while( curr != null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.prev = head;
		head.next.next = new Node(3);
		head.next.next.next.prev = head.next;

		System.out.print("Original Linked List: ");
		printList(head);

		System.out.print("After Deletion at the beginning: ");
		head = delHead(head);

		printList(head)
	}
}
