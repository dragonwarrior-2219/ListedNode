class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {

    static Node deleteHead(Node head) {

        if (head == null)
            return null;

        Node temp = head;
        head = head.next;
        temp = null;

        return head;
    }

    static void printList(Node curr) {

        while (curr != null) {
            System.out.print(curr.data);

            if (curr.next != null)
                System.out.print(" -> ");

            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(8);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(7);

        head = deleteHead(head);

        printList(head);
    }
}
