class Node {
	public int data;
	public Node next;
	public Node prev;

	Node(int newData){
		data = newData;
		next = prev = null;
	}
}
public class Main{
	public static Node insertAtPos(Node head, int p, int x) {
		ArrrayList<Node> nodes = new ArrayList<>();
		Node curr = head;		
		while(curr!=null){
			nodes.add(curr);
			curr = curr.next;
		}

		Node newNode = new Node(x);
		Node pnode = newNode;
		
		
		if (head! = null){
			head.prev = newNode;
		}
		return newNode;
	}
	public static void printList(Node head){
		Node curr = head;
		while(curr!=null){
			System.out.print(curr.data);
			if(curr.next !=null){
				System.out.print("<->");
			}
			curr = curr.next;
		}

		System.out.println();
	}
	public static void main(String[] args){
		Node head = new Node(2);
		head.next = new Node(3);
		head.next.prev = head;
		head.next.next.next.prev = head.next;
		int data = 1;
		head = insertAtPos(head, data);
		printList(head);
	}
}
