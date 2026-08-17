class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {

    static void updateNode(Node head, int position, int newValue) {

        Node curr = head;
        int count = 1;

        while (curr != null && count < position) {
            curr = curr.next;
            count++;
        }

        if (curr != null) {
            curr.data = newValue;
        } else {
            System.out.println("Position not found!");
        }
    }

    static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Before Update:");
        printList(head);

        updateNode(head, 3, 35);

        System.out.println("After Update:");
        printList(head);
    }
}
